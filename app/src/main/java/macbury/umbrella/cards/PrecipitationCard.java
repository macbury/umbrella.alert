package macbury.umbrella.cards;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.androidquery.AQuery;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.prototypes.CardWithList;
import macbury.umbrella.R;
import macbury.umbrella.model.Forecast;
import macbury.umbrella.model.RainData;

/**
 * Created by macbury on 27.08.14.
 */
public class PrecipitationCard extends CardWithList {
  private final Forecast currentForecast;

  public PrecipitationCard(Context context, Forecast currentForecast) {
    super(context);
    this.currentForecast = currentForecast;
    init();
  }

  @Override
  protected CardHeader initCardHeader() {
    CardHeader cardHeader = new CardHeader(getContext());
    cardHeader.setTitle(getContext().getString(R.string.precipitation_card_title));
    return cardHeader;
  }

  @Override
  protected void initCard() {

  }

  @Override
  protected List<ListObject> initChildren() {
    ArrayList<ListObject> objects = new ArrayList<ListObject>();

    for (RainData rd : currentForecast.getRainData()) {
      PrecipitationListObject listObject = new PrecipitationListObject(this, rd);
      objects.add(listObject);
    }

    return objects;
  }

  @Override
  public View setupChildView(int i, ListObject listObject, View view, ViewGroup viewGroup) {
    AQuery query                  = new AQuery(view);
    PrecipitationListObject item  = (PrecipitationListObject)listObject;
    SimpleDateFormat format       = new SimpleDateFormat("hh:mm");
    query.id(R.id.timeTextView).text(format.format(item.data.getAt()));
    query.id(R.id.humidityTextView).text("Humidity: "+ item.data.getHumidity()+" %");
    return view;
  }

  @Override
  public int getChildLayoutId() {
    return R.layout.card_precipitation_list_view;
  }

  public class PrecipitationListObject extends DefaultListObject {
    private final RainData data;

    public PrecipitationListObject(Card parentCard, RainData data) {
      super(parentCard);
      this.data = data;
    }
  }
}
