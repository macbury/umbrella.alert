package macbury.umbrella;

import android.app.Application;

import macbury.umbrella.managers.AlarmsManager;
import macbury.umbrella.managers.IntentsManager;
import macbury.umbrella.managers.ServicesManager;

/**
 * Created by macbury on 26.08.14.
 */
public class UmbrellaApplication extends Application {
  public AlarmsManager alarms;
  public ServicesManager services;
  public IntentsManager intents;

  @Override
  public void onCreate() {
    super.onCreate();
    alarms    = new AlarmsManager(this);
    services  = new ServicesManager(this);
    intents   = new IntentsManager(this);

    alarms.setup();
    services.checkWeather();
  }
}
