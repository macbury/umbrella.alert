package macbury.umbrella.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;

import macbury.umbrella.UmbrellaApplication;
import macbury.umbrella.managers.IntentsManager;
import macbury.umbrella.model.Forecast;
import macbury.umbrella.providers.ForecastProvider;
import macbury.umbrella.providers.ForecastProviderError;
import macbury.umbrella.providers.ForecastProviderListener;

public class CheckWeatherService extends Service implements ForecastProviderListener {
  private static final String TAG           = "CheckWeatherService";
  private static final String WAKE_LOCK_TAG = "de.macbury.WAKE_LOCK";
  private ForecastProvider forecastProvider;
  private Forecast currentForecast;
  private UmbrellaApplication app;
  private PowerManager powerManager;
  private PowerManager.WakeLock wakeLock;

  public enum SyncStatus {
    Started,
    Working,
    Success,
    Error
  }

  public CheckWeatherService() {
  }

  @Override
  public void onCreate() {
    super.onCreate();
    Log.i(TAG, "Creating service...");
    this.powerManager = (PowerManager) getSystemService(POWER_SERVICE);
    this.wakeLock     = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, WAKE_LOCK_TAG);
    this.wakeLock.acquire();

    this.app          = (UmbrellaApplication)getApplication();
    forecastProvider  = new ForecastProvider(this);
    forecastProvider.setListener(this);
    setStatus(SyncStatus.Started);
  }

  private void setStatus(SyncStatus status) {
    sendBroadcast(app.intents.syncBroadcast(status));
  }

  @Override
  public int onStartCommand(Intent intent, int flags, int startId) {
    UmbrellaApplication app = (UmbrellaApplication)getApplication();

    Forecast storedForecast = app.store.getForecast();

    boolean forceRefresh = intent != null && intent.getBooleanExtra(IntentsManager.EXTRA_FORCE_REFRESH, false);

    if (storedForecast == null || storedForecast.isNotFresh()) {
      app.store.setUmbrellaNotificationDismissed(false);
    }

    //app.notifications.syncWeatherNotification(); //TODO: remove only for debug

    if (storedForecast == null || storedForecast.isNotFresh() || forceRefresh) {
      Log.i(TAG, "Starting command" );
      forecastProvider.fetch();
    } else if(!forecastProvider.isRunning()) {
      Log.i(TAG, "Fresh date skipping");
      setStatus(SyncStatus.Success);
      stopSelf();
    } else {
      Log.i(TAG, "Already running...");
    }
    return super.onStartCommand(intent, flags, startId);
  }

  @Override
  public void onForecastComplete(ForecastProvider forecastProvider) {
    stopSelf();
  }

  @Override
  public void onForecastError(ForecastProvider forecastProvider, ForecastProviderError error) {
    // show notification error here?
    setStatus(SyncStatus.Error);
  }

  @Override
  public void onForecastSuccess(ForecastProvider forecastProvider, Forecast currentForecast) {
    this.currentForecast = currentForecast;
    setStatus(SyncStatus.Success);
    showNotificationIfNeeded();
  }

  private void showNotificationIfNeeded() {
    app.store.put(currentForecast);

    if (currentForecast.takeUmbrella() && !app.store.isUmbrellaNotificationDismissed()) {
      app.notifications.showTakeUmbrella();
    } else {
      app.notifications.hideTakeUmbrella();
    }
  }

  @Override
  public void onDestroy() {
    Log.i(TAG, "Stopping service...");
    wakeLock.release();
    super.onDestroy();
  }

  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }
}
