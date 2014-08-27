package macbury.umbrella.providers;

/**
 * Created by macbury on 27.08.14.
 */
public class ForecastProviderError extends Exception {

  public ForecastProviderError(String detailMessage) {
    super(detailMessage, null);
  }
}
