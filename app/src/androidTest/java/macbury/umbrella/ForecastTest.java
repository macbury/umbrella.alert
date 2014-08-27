package macbury.umbrella;

import android.test.ApplicationTestCase;

import junit.framework.TestCase;

import macbury.umbrella.factories.WeatherForecastFactory;
import macbury.umbrella.model.Forecast;

/**
 * Created by macbury on 27.08.14.
 */
public class ForecastTest extends TestCase {

  public void testItShouldHaveParsedRainDataWithDate() {
    Forecast forecast = new Forecast();
    forecast.parse(WeatherForecastFactory.rainNext6Hours());

    assertNotNull(forecast.getFromDate());
    assertNotNull(forecast.getToDate());
    assertNotNull(forecast.getCity());
    assertNotSame(forecast.getFromDate(), forecast.getToDate());
    assertEquals(true, forecast.getFromDate().before(forecast.getToDate()));
  }

  public void testItShouldTakeUmbrellaIfThereIsAnyChanceOfRainInNext6Hrs() {
    Forecast forecast = new Forecast();
    forecast.parse(WeatherForecastFactory.rainNext6Hours());
    assertEquals(true, forecast.takeUmbrella());
  }
}
