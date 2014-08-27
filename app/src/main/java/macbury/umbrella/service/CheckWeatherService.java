package macbury.umbrella.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import macbury.umbrella.model.Forecast;
import macbury.umbrella.providers.ForecastProvider;
import macbury.umbrella.providers.ForecastProviderError;
import macbury.umbrella.providers.ForecastProviderListener;

public class CheckWeatherService extends Service implements ForecastProviderListener {
  private static final String TAG = "CheckWeatherService";
  private ForecastProvider forecastProvider;

  public CheckWeatherService() {
  }

  @Override
  public void onCreate() {
    super.onCreate();
    Log.i(TAG, "Creating service...");
    forecastProvider = new ForecastProvider(this);
    forecastProvider.setListener(this);
  }

  @Override
  public int onStartCommand(Intent intent, int flags, int startId) {
    Log.i(TAG, "Recived start service command from: " + intent.getAction());
    forecastProvider.fetch();
    return super.onStartCommand(intent, flags, startId);
  }

  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }

  @Override
  public void onForecastComplete(ForecastProvider forecastProvider) {
    stopSelf();
  }

  @Override
  public void onForecastError(ForecastProvider forecastProvider, ForecastProviderError error) {
    // show notification error here?
  }

  @Override
  public void onForecastSuccess(ForecastProvider forecastProvider, Forecast currentForecast) {
    showNotificationIfNeeded();
  }


  private void showNotificationIfNeeded() {
    if (forecastProvider.getCurrentForecast().takeUmbrella()) {

    }
  }
  @Override
  public void onDestroy() {
    Log.i(TAG, "Stopping service...");
    super.onDestroy();
  }
}
