package macbury.umbrella.activity;

import android.app.Activity;
import android.os.Bundle;

import macbury.umbrella.R;
import macbury.umbrella.fragments.SettingsFragment;

/**
 * Created by macbury on 28.08.14.
 */
public class SettingsActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_settings);

    getFragmentManager().beginTransaction()
            .replace(R.id.container, new SettingsFragment())
            .commit();

  }
}
