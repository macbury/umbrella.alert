package macbury.umbrella.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.androidquery.AQuery;

import it.gmariotti.cardslib.library.internal.Card;
import macbury.umbrella.R;

/**
 * Created by macbury on 28.08.14.
 */
public class AboutCard extends Card {
  private AQuery query;

  public AboutCard(Context context) {
    super(context, R.layout.about_card_view);
  }

  @Override
  public void setupInnerViewElements(ViewGroup parent, View view) {
    super.setupInnerViewElements(parent, view);
    query                 = new AQuery(view);
  }
}
