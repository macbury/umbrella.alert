package macbury.umbrella.managers;

import android.util.Log;
import macbury.umbrella.UmbrellaApplication;

/**
 * Created by macbury on 26.08.14.
 */
public class ServicesManager {
  private static final String TAG = "ServicesManager";
  private final UmbrellaApplication application;

  public ServicesManager(UmbrellaApplication application) {
    this.application = application;
  }

  public void checkWeather(boolean forceRefresh) {
    Log.i(TAG, "Start check weather service");
    application.startService(application.intents.checkWeatherService(forceRefresh));
  }
}
