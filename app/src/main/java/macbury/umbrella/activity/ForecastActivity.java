package macbury.umbrella.activity;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import macbury.umbrella.R;
import macbury.umbrella.UmbrellaApplication;
import macbury.umbrella.fragments.LoadingFragment;
import macbury.umbrella.managers.IntentsManager;
import macbury.umbrella.model.Forecast;

public class ForecastActivity extends Activity {
  private UmbrellaApplication app;
  private Forecast currentForecast;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.app = (UmbrellaApplication)getApplication();
    setContentView(R.layout.activity_forecast);
  }

  @Override
  protected void onResume() {
    super.onResume();
    Intent intent = getIntent();

    currentForecast = app.store.getForecast();

    if (currentForecast == null || currentForecast.isNotFresh()) {
      app.services.checkWeather();
      startLoading();
    } else {
      
    }

    if (intent != null && intent.getBooleanExtra(IntentsManager.EXTRA_DISSMIS_TAKE_UMBRELLA, false)) {
      app.store.setUmbrellaNotificationDismissed(true);
      app.notifications.hideTakeUmbrella();
    }


  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.forecast, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();
    if (id == R.id.action_refresh) {
      app.services.checkWeather();
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

  private void startLoading() {
    Fragment loadingFragment = getFragmentManager().findFragmentById(R.id.frame_loading);
    if (loadingFragment == null) {
      getFragmentManager().beginTransaction()
              .replace(R.id.container, new LoadingFragment())
              .commit();
    }

  }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_forecast, container, false);
            return rootView;
        }
    }
}
