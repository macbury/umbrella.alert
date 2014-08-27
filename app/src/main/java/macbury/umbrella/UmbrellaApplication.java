package macbury.umbrella;

import android.app.Application;
import android.app.Notification;

import macbury.umbrella.managers.AlarmsManager;
import macbury.umbrella.managers.IntentsManager;
import macbury.umbrella.managers.NotificationsManager;
import macbury.umbrella.managers.ServicesManager;
import macbury.umbrella.managers.StoreManager;

/**
 * Created by macbury on 26.08.14.
 */
public class UmbrellaApplication extends Application {
  public AlarmsManager alarms;
  public ServicesManager services;
  public IntentsManager intents;
  public NotificationsManager notifications;
  public StoreManager store;

  @Override
  public void onCreate() {
    super.onCreate();
    store         = new StoreManager(this);
    alarms        = new AlarmsManager(this);
    services      = new ServicesManager(this);
    intents       = new IntentsManager(this);
    notifications = new NotificationsManager(this);

    alarms.setup();
    services.checkWeather();
  }
}
