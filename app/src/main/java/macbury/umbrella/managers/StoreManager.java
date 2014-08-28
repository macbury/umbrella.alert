package macbury.umbrella.managers;

import android.app.AlarmManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.google.gson.Gson;

import macbury.umbrella.R;
import macbury.umbrella.model.Forecast;

/**
 * Created by macbury on 27.08.14.
 */
public class StoreManager {
  private static final int CONFIG_VERSION                             = 86;
  private static final String SETTINGS_STORE                          = "preference_synchronization_settings";
  private static final String FORECAST_STORE                          = "FORECAST_STORE";
  public  static final String KEY_SYNC_EVERY                          = "sync_every";
  private static final String KEY_FORECAST                            = "KEY_FORECAST";
  private static final String KEY_VERSION                             = "KEY_VERSION";
  private static final String KEY_DISMISSED_NOTIFICATION_UMBRELLA     = "KEY_DISMISSED_NOTIFICATION_UMBRELLA";
  private static final String TAG                                     = "StoreManager";
  private final Context context;
  private final SharedPreferences preferences;
  private final SharedPreferences settings;

  public StoreManager(Context context) {
    this.context = context;
    preferences  = context.getSharedPreferences(FORECAST_STORE, Context.MODE_PRIVATE);
    settings     = PreferenceManager.getDefaultSharedPreferences(context);
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

  public long getSyncEveryInMiliseconds() {// Because fuck you im android
    String defaultVal = context.getResources().getString(R.string.refresh_rate_hour);
    String rawMili    = settings.getString(KEY_SYNC_EVERY, defaultVal);
    return rawMili == defaultVal ? AlarmManager.INTERVAL_HOUR : Integer.parseInt(rawMili);
  }

  public String getHumanReadableSynceEvery() {
    String labels[]     = context.getResources().getStringArray(R.array.refresh_rate_labels);
    String values[]     = context.getResources().getStringArray(R.array.refresh_rate_values);
    long currentVal     = getSyncEveryInMiliseconds();
    for(int i = 0; i < labels.length; i++) {
      if (Long.parseLong(values[i]) == currentVal) {
        return labels[i];
      }
    }

    return "Error";
  }
}
