package macbury.umbrella.providers;

import macbury.umbrella.model.Forecast;

/**
 * Created by macbury on 27.08.14.
 */
public interface ForecastProviderListener {

  public void onForecastComplete(ForecastProvider forecastProvider);
  public void onForecastError(ForecastProvider forecastProvider, ForecastProviderError error);


  public void onForecastSuccess(ForecastProvider forecastProvider, Forecast currentForecast);
}
