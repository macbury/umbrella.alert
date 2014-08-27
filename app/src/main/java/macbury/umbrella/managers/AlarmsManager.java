package macbury.umbrella.managers;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
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
  private final AlarmManager manager;

  public AlarmsManager(UmbrellaApplication application) {
    this.application = application;
    this.manager     = (AlarmManager)application.getSystemService(Context.ALARM_SERVICE);
  }

  public void setup() {
    Log.i(TAG, "Setup alarms");
    manager.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, AlarmManager.INTERVAL_HOUR, AlarmManager.INTERVAL_HALF_DAY, application.intents.checkWeatherReceiver());
  }
}
