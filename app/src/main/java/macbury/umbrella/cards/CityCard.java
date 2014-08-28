package macbury.umbrella.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidquery.AQuery;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import it.gmariotti.cardslib.library.internal.Card;
import macbury.umbrella.R;
import macbury.umbrella.model.Forecast;

/**
 * Created by macbury on 27.08.14.
 */
public class CityCard extends Card {
  private final static char DEGREES_SYMBOL = (char) 0x00B0;
  private final Forecast forecast;
  private AQuery query;
  private TextView cityTextView;
  private TextView temperatureTextView;

  public CityCard(Context context, Forecast forecast) {
    super(context, R.layout.city_card_layout);
    this.forecast = forecast;
  }

  @Override
  public void setupInnerViewElements(ViewGroup parent, View view) {
    super.setupInnerViewElements(parent, view);
    query                 = new AQuery(view);
    cityTextView          = query.id(R.id.cityTextView).getTextView();
    temperatureTextView   = query.id(R.id.temperatureTextView).getTextView();

    query.id(R.id.cityTextView).text(forecast.getCity());
    query.id(R.id.temperatureTextView).text(String.format("%.02f "+ DEGREES_SYMBOL + "C", forecast.getTemperature()));

    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
    query.id(R.id.updatedAtTextView).text(format.format(forecast.getLastUpdate()));
  }
}
