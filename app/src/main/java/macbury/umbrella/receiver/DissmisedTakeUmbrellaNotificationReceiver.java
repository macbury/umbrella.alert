package macbury.umbrella.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import macbury.umbrella.UmbrellaApplication;

public class DissmisedTakeUmbrellaNotificationReceiver extends BroadcastReceiver {
  private static final String TAG = "DissmisedTakeUmbrellaNotificationReceiver";

  public DissmisedTakeUmbrellaNotificationReceiver() {
  }

  @Override
  public void onReceive(Context context, Intent intent) {
    Log.d(TAG, "Dismissed take umbrella notification");
    UmbrellaApplication app = (UmbrellaApplication)context.getApplicationContext();
    app.store.setUmbrellaNotificationDismissed(true);
  }
}
