package macbury.umbrella.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import macbury.umbrella.UmbrellaApplication;

public class CheckWeatherReceiver extends BroadcastReceiver {
  private static final String TAG = "CheckWeatherReceiver";

  public CheckWeatherReceiver() {
  }

  @Override
  public void onReceive(Context context, Intent intent) {
    Log.i(TAG, "Recived trigger from: " + intent.getAction());
    UmbrellaApplication application = (UmbrellaApplication)context.getApplicationContext();
    application.services.checkWeather();
  }
}
