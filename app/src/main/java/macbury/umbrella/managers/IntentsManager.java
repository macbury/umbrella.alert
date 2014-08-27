package macbury.umbrella.managers;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;

import macbury.umbrella.UmbrellaApplication;
import macbury.umbrella.activity.ForecastActivity;
import macbury.umbrella.receiver.DissmisedTakeUmbrellaNotificationReceiver;
import macbury.umbrella.service.CheckWeatherService;

/**
 * Created by macbury on 26.08.14.
 */
public class IntentsManager {
  private final UmbrellaApplication application;

  public static final String BROADCAST_ACTION_FINISHED_SYNCING = "macbury.umbrella.BROADCAST_ACTION_SYNC";

  public final static String EXTRA_DISSMIS_TAKE_UMBRELLA = "EXTRA_DISSMIS_TAKE_UMBRELLA";
  public final static String EXTRA_FORCE_REFRESH         = "EXTRA_FORCE_REFRESH";
  public final static String EXTRA_SYNC_STATUS         = "EXTRA_SYNC_STATUS";

  public IntentsManager(UmbrellaApplication application) {
    this.application = application;
  }

  public Intent checkWeatherService(boolean forceRefresh) {
    Intent intent = new Intent(application, CheckWeatherService.class);
    intent.putExtra(EXTRA_FORCE_REFRESH, forceRefresh);
    return intent;
  }

  public Intent syncBroadcast(CheckWeatherService.SyncStatus syncStatus) {
    Intent intent = new Intent(BROADCAST_ACTION_FINISHED_SYNCING);
    intent.putExtra(EXTRA_SYNC_STATUS, syncStatus);
    return intent;
  }

  public PendingIntent checkWeatherReceiver() {
    Intent intent = new Intent(application, CheckWeatherService.class);
    return PendingIntent.getBroadcast(application, 0, intent, 0);
  }

  public PendingIntent showMainActivity(boolean dismissTakeUmbrella) {
    Intent intent = new Intent(application, ForecastActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
    intent.setAction(Intent.ACTION_MAIN);
    intent.addCategory(Intent.CATEGORY_LAUNCHER);
    intent.putExtra(EXTRA_DISSMIS_TAKE_UMBRELLA, dismissTakeUmbrella);
    return PendingIntent.getActivity(application, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
  }

  public PendingIntent dismissTakeUmbrellaNotificationReceiver() {
    Intent intent = new Intent(application, DissmisedTakeUmbrellaNotificationReceiver.class);
    return PendingIntent.getBroadcast(application, 0, intent, 0);
  }

  public IntentFilter syncBroadcastFilter() {
    return new IntentFilter(BROADCAST_ACTION_FINISHED_SYNCING);
  }
}
