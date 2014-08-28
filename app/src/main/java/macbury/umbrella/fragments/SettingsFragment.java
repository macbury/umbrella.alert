package macbury.umbrella.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.util.Log;

import macbury.umbrella.R;
import macbury.umbrella.UmbrellaApplication;
import macbury.umbrella.managers.StoreManager;

/**
 * Created by macbury on 28.08.14.
 */
public class SettingsFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {

  private static final String TAG = "SettingsFragment";
  private UmbrellaApplication app;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    app = (UmbrellaApplication)getActivity().getApplication();
    addPreferencesFromResource(R.xml.settings);

    getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
  }
  @Override
  public void onResume() {
    super.onResume();
    updateUI();
  }

  private void updateUI() {
    PreferenceScreen screen         = getPreferenceScreen();
    Preference syncEveryPreference  = screen.findPreference(StoreManager.KEY_SYNC_EVERY);
    syncEveryPreference.setSummary(app.store.getHumanReadableSynceEvery());
  }

  @Override
  public void onDestroy() {
    getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    super.onDestroy();
  }

  @Override
  public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
    Log.d(TAG, "Key changed: " + key);
    updateUI();
    app.alarms.setup();
  }
}
