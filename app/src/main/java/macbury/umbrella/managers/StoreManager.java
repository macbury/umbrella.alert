package macbury.umbrella.managers;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.Gson;

import macbury.umbrella.model.Forecast;

/**
 * Created by macbury on 27.08.14.
 */
public class StoreManager {
  private static final int CONFIG_VERSION                             = 24;
  private static final String PREFERENCE_NAME                         = "PREFERENCE_NAME";
  private static final String KEY_FORECAST                            = "KEY_FORECAST";
  private static final String KEY_VERSION                             = "KEY_VERSION";
  private static final String KEY_DISMISSED_NOTIFICATION_UMBRELLA     = "KEY_DISMISSED_NOTIFICATION_UMBRELLA";
  private static final String TAG                                     = "StoreManager";
  private final Context context;
  private final SharedPreferences preferences;

  public StoreManager(Context context) {
    this.context = context;
    preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    checkIntegrity();
  }

  private void checkIntegrity() {
    if (preferences.getInt(KEY_VERSION, -1) != CONFIG_VERSION) {
      Log.i(TAG, "Clearing");
      preferences.edit().clear().putInt(KEY_VERSION, CONFIG_VERSION).commit();
    } else {
      Log.i(TAG, "Done");
    }
  }

  public void put(Forecast forecast) {
    preferences.edit().putString(KEY_FORECAST, forecast.toJSON()).commit();
  }

  public void setUmbrellaNotificationDismissed(boolean dismissed) {
    Log.v(TAG, "Umbrella Notification Dismissed="+dismissed);
    preferences.edit().putBoolean(KEY_DISMISSED_NOTIFICATION_UMBRELLA, dismissed).commit();
  }

  public boolean isUmbrellaNotificationDismissed() {
    return preferences.getBoolean(KEY_DISMISSED_NOTIFICATION_UMBRELLA, false);
  }

  public Forecast getForecast() {
    Forecast forecast = null;
    if (preferences.contains(KEY_FORECAST)) {
      String forecastJSON = preferences.getString(KEY_FORECAST, null);
      if (forecastJSON != null) {
        Gson g   = new Gson();
        forecast = g.fromJson(forecastJSON, Forecast.class);
      }
    }
    return forecast;
  }
}
