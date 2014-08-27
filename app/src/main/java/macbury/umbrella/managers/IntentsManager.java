package macbury.umbrella.managers;

import android.app.PendingIntent;
import android.content.Intent;

import macbury.umbrella.UmbrellaApplication;
import macbury.umbrella.activity.ForecastActivity;
import macbury.umbrella.receiver.DissmisedTakeUmbrellaNotificationReceiver;
import macbury.umbrella.service.CheckWeatherService;

/**
 * Created by macbury on 26.08.14.
 */
public class IntentsManager {
  private final UmbrellaApplication application;
  public final static String EXTRA_DISSMIS_TAKE_UMBRELLA = "EXTRA_DISSMIS_TAKE_UMBRELLA";

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

  public PendingIntent showMainActivity(boolean dismissTakeUmbrella) {
    Intent intent = new Intent(application, ForecastActivity.class);
    intent.setAction(Intent.ACTION_MAIN);
    intent.addCategory(Intent.CATEGORY_LAUNCHER);
    intent.putExtra(EXTRA_DISSMIS_TAKE_UMBRELLA, dismissTakeUmbrella);
    return PendingIntent.getActivity(application, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
  }

  public PendingIntent dismissTakeUmbrellaNotificationReceiver() {
    Intent intent = new Intent(application, DissmisedTakeUmbrellaNotificationReceiver.class);
    return PendingIntent.getBroadcast(application, 0, intent, 0);
  }
}
