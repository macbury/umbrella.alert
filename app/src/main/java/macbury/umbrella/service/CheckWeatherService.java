package macbury.umbrella.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import macbury.umbrella.UmbrellaApplication;
import macbury.umbrella.managers.IntentsManager;
import macbury.umbrella.model.Forecast;
import macbury.umbrella.providers.ForecastProvider;
import macbury.umbrella.providers.ForecastProviderError;
import macbury.umbrella.providers.ForecastProviderListener;

public class CheckWeatherService extends Service implements ForecastProviderListener {
  private static final String TAG = "CheckWeatherService";
  private ForecastProvider forecastProvider;
  private Forecast currentForecast;
  private UmbrellaApplication app;

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
    this.app         = (UmbrellaApplication)getApplication();
    forecastProvider = new ForecastProvider(this);
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

    if (storedForecast == null || !storedForecast.isFresh() || intent.getBooleanExtra(IntentsManager.EXTRA_FORCE_REFRESH, false)) {
      Log.i(TAG, "Starting fetch: " + intent.getAction());
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
      app.store.setUmbrellaNotificationDismissed(false);
    }
  }

  @Override
  public void onDestroy() {
    Log.i(TAG, "Stopping service...");
    super.onDestroy();
  }

  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }
}
