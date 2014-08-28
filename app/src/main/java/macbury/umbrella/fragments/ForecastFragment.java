package macbury.umbrella.fragments;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.androidquery.AQuery;

import it.gmariotti.cardslib.library.view.CardView;
import macbury.umbrella.R;
import macbury.umbrella.UmbrellaApplication;
import macbury.umbrella.cards.AboutCard;
import macbury.umbrella.cards.CityCard;
import macbury.umbrella.cards.PrecipitationCard;
import macbury.umbrella.model.Forecast;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class ForecastFragment extends Fragment {
  private AQuery query;
  private ScrollView scrollView;
  private CardView cityCardView;
  private CardView chanceOfRain;

  public ForecastFragment() {

  }

  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    query             = new AQuery(getActivity());
    scrollView        = (ScrollView)query.id(R.id.card_scrollview).getView();
    cityCardView      = (CardView)query.id(R.id.city_card_container_view).getView();
    chanceOfRain      = (CardView)query.id(R.id.chance_of_rain_container_view).getView();
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_forecast, container, false);
    return view;
  }

  @Override
  public void onResume() {
    super.onResume();
    loadForecast();
  }

  public void loadForecast() {
    UmbrellaApplication app = (UmbrellaApplication)getActivity().getApplication();

    Forecast currentForecast = app.store.getForecast();

    if (currentForecast != null) {
      cityCardView.setCard(new CityCard(getActivity(), currentForecast));
      chanceOfRain.setCard(new PrecipitationCard(getActivity(), currentForecast));
    }

    //aboutCardView.setCard(new AboutCard(getActivity()));
  }
}
