package macbury.umbrella.managers;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

import macbury.umbrella.R;
import macbury.umbrella.UmbrellaApplication;


/**
 * Created by macbury on 27.08.14.
 */
public class NotificationsManager {
  private static final int NOTIFICATION_COLOR = 0x3498db;
  private static final int NOTIFICATION_TAKE_UMBRELLA_ID = 69;
  private final Context context;
  private final NotificationManager manager;
  private final Uri notificationSound;
  private final UmbrellaApplication app;

  public NotificationsManager(Context context) {
    this.app       = (UmbrellaApplication)context.getApplicationContext();
    this.context   = context;
    this.manager   = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

    this.notificationSound = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://macbury.umbrella/raw/"+R.raw.notification);
  }

  public void showTakeUmbrella() {
    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context);
    mBuilder.setSmallIcon(R.drawable.ic_launcher);
    mBuilder.setContentTitle(context.getString(R.string.take_your_umbrella_notification_title));
    mBuilder.setContentText(context.getString(R.string.take_your_umbrella_notification_message_rain));
    mBuilder.setLights(NOTIFICATION_COLOR, 500, 100);
    mBuilder.setSound(notificationSound);
    mBuilder.setAutoCancel(true);
    mBuilder.setSmallIcon(R.drawable.ic_stat_umbrella);
    mBuilder.setContentIntent(app.intents.showMainActivity(true));
    mBuilder.setDeleteIntent(app.intents.dismissTakeUmbrellaNotificationReceiver());

    Notification notification = mBuilder.build();
    manager.notify(NOTIFICATION_TAKE_UMBRELLA_ID, notification);
  }

  public void hideTakeUmbrella() {
    manager.cancel(NOTIFICATION_TAKE_UMBRELLA_ID);
  }
}
