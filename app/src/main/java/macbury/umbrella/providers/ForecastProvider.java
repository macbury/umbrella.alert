package macbury.umbrella.providers;

import android.content.Context;
import android.location.Location;
import android.util.Log;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxStatus;
import com.androidquery.callback.LocationAjaxCallback;

import org.json.JSONObject;

import macbury.umbrella.model.Forecast;

/**
 * Created by macbury on 27.08.14.
 */
public class ForecastProvider {
  private static final String TAG = "ForecastProvider";
  private final Context context;
  private final AQuery query;
  private ForecastProviderListener listener;
  private boolean running;
  private LocationAjaxCallback locationCallback;

  private Forecast currentForecast;

  private static final long  LOCATION_TIMEOUT   = 40 * 1000;
  private static final float LOCATION_ACCURACY  = 100;
  private static final float LOCATION_TOLERANCE = 10;
  private Location currentLocation;

  public ForecastProvider(Context context) {
    this.context = context;
    this.query   = new AQuery(context);
    Log.d(TAG, "Initialized...");
  }

  public void fetch() {
    if (this.running) {
      return;
    }
    this.running = true;

    this.locationCallback = new LocationAjaxCallback();
    locationCallback.weakHandler(this, "locationFoundCallback").timeout(LOCATION_TIMEOUT).accuracy(LOCATION_ACCURACY).iteration(2).tolerance(LOCATION_TOLERANCE).async(context);
  }

  public void locationFoundCallback(String url, Location loc, AjaxStatus status) {
    locationCallback.stop();
    if (loc == null) {
      Log.d(TAG, "Location not found!");
      error(new ForecastProviderError("Location not found"));
    } else {
      Log.i(TAG, "Located user " + loc.toString());
      currentLocation = loc;
      fetchWeatherForecast();
    }
  }

  private void fetchWeatherForecast() {
    Log.i(TAG, "Fetching forecast for current location");
    String url = "http://api.openweathermap.org/data/2.5/forecast?cnt=1&type=accurace&lat="+currentLocation.getLatitude()+"&lon="+currentLocation.getLongitude();
    Log.d(TAG, "GET: "+url);
    query.ajax(url, JSONObject.class, this, "forecastCallback");
  }

  public void forecastCallback(String url, JSONObject forecast, AjaxStatus status) {
    if (forecast == null) {
      Log.e(TAG, "forecast not found!");
      error(new ForecastProviderError("Forecast not found"));
    } else {
      Log.v(TAG, "Retrived forecast data: " + forecast.toString());
      currentForecast = new Forecast();
      currentForecast.parse(forecast);
      success();
    }
  }

  private void success() {
    Log.i(TAG, "Success!");
    listener.onForecastSuccess(this, currentForecast);
    complete();
  }

  private void error(ForecastProviderError error) {
    running = false;
    Log.e(TAG, error.getMessage());
    listener.onForecastError(this, error);
    complete();
  }

  private void complete() {
    listener.onForecastComplete(this);
  }

  public Forecast getCurrentForecast() {
    return currentForecast;
  }

  public ForecastProviderListener getListener() {
    return listener;
  }

  public void setListener(ForecastProviderListener listener) {
    this.listener = listener;
  }

  public boolean isRunning() {
    return running;
  }
}
