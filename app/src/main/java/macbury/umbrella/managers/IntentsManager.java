package macbury.umbrella.managers;

import android.app.PendingIntent;
import android.content.Intent;

import macbury.umbrella.UmbrellaApplication;
import macbury.umbrella.service.CheckWeatherService;

/**
 * Created by macbury on 26.08.14.
 */
public class IntentsManager {
  private final UmbrellaApplication application;

  public IntentsManager(UmbrellaApplication application) {
    this.application = application;
  }

  public Intent checkWeatherService() {
    return new Intent(application, CheckWeatherService.class);
  }

  public PendingIntent checkWeatherReceiver() {
    Intent intent = new Intent(application, CheckWeatherService.class);
    return PendingIntent.getBroadcast(application, 0, intent, 0);
  }
}
