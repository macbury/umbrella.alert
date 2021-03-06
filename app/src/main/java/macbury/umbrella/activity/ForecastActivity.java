package macbury.umbrella.activity;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Toast;

import macbury.umbrella.R;
import macbury.umbrella.UmbrellaApplication;
import macbury.umbrella.fragments.ForecastFragment;
import macbury.umbrella.fragments.LoadingFragment;
import macbury.umbrella.managers.IntentsManager;
import macbury.umbrella.model.Forecast;
import macbury.umbrella.receiver.SyncStatusBroadcastReceiver;
import macbury.umbrella.service.CheckWeatherService;

public class ForecastActivity extends Activity {
  private static final String TAG = "ForecastActivity";
  private UmbrellaApplication app;
  private final static String ABOUT_PAGE_URL  = "http://macbury.ninja";
  private final static String DONTAE_PAGE_URL = "http://macbury.ninja/donate/bitcoin";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.app = (UmbrellaApplication)getApplication();
    setContentView(R.layout.activity_forecast);
  }

  @Override
  protected void onResume() {
    super.onResume();
    registerReceiver(syncReceiver, app.intents.syncBroadcastFilter());

    Forecast currentForecast = app.store.getForecast();

    if (currentForecast == null || currentForecast.isNotFresh()) {
      app.services.checkWeather(false);
    } else {
      showForecast();
      app.store.setUmbrellaNotificationDismissed(true);
      app.notifications.hideTakeUmbrella();
    }
  }

  @Override
  protected void onPause() {
    super.onPause();
    unregisterReceiver(syncReceiver);
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
      app.services.checkWeather(true);
      return true;
    }

    if (id == R.id.action_about) {
      openAboutPage();
      return true;
    }

    if (id == R.id.action_donate) {
      openDonationPage();
      return true;
    }

    if (id == R.id.action_settings) {
      startActivity(new Intent(this, SettingsActivity.class));
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  private void openDonationPage() {
    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(DONTAE_PAGE_URL));
    startActivity(browserIntent);
  }

  private void openAboutPage() {
    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(ABOUT_PAGE_URL));
    startActivity(browserIntent);
  }

  private void startLoading() {
    Fragment loadingFragment = getFragmentManager().findFragmentById(R.id.frame_loading);
    if (loadingFragment == null) {
      getFragmentManager().beginTransaction()
              .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
              .replace(R.id.container, new LoadingFragment())
              .commit();
    }

  }

  private void showForecast() {
    ForecastFragment forecastFragment = (ForecastFragment)getFragmentManager().findFragmentById(R.id.forecast_fragment);
    if (forecastFragment == null) {
      forecastFragment = new ForecastFragment();
    }

    getFragmentManager().beginTransaction()
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .replace(R.id.container, forecastFragment)
            .commit();
  }

  SyncStatusBroadcastReceiver syncReceiver = new SyncStatusBroadcastReceiver() {
    @Override
    public void onSyncStatus(CheckWeatherService.SyncStatus status) {
      if (status == CheckWeatherService.SyncStatus.Started) {
        startLoading();
      } else if(status == CheckWeatherService.SyncStatus.Error) {
        Log.e(TAG, "Status: " + status);
        Toast.makeText(ForecastActivity.this, "Could not fetch data...", Toast.LENGTH_LONG);
      } else {
        showForecast();
      }
    }
  };
}
