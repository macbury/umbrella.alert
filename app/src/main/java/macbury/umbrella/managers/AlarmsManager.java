package macbury.umbrella.managers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;

import java.util.Calendar;

import macbury.umbrella.UmbrellaApplication;
import macbury.umbrella.receiver.CheckWeatherReceiver;

/**
 * Created by macbury on 26.08.14.
 */
public class AlarmsManager {
  private static final String TAG = "AlarmsManager";
  private final UmbrellaApplication application;
  private AlarmManager manager;

  public AlarmsManager(UmbrellaApplication application) {
    this.application = application;
    this.manager     = (AlarmManager)application.getSystemService(Context.ALARM_SERVICE);
  }

  public void setup() {
    Log.i(TAG, "Setup alarms");
    Log.d(TAG, "Refresh Every: " + application.store.getHumanReadableSynceEvery());
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(System.currentTimeMillis());
    calendar.set(Calendar.HOUR_OF_DAY, 7); // Read this from config etc...

    PendingIntent refreshIntent = application.intents.checkWeatherReceiver();

    manager.cancel(refreshIntent);
    manager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), application.store.getSyncEveryInMiliseconds(), refreshIntent);
  }
}
