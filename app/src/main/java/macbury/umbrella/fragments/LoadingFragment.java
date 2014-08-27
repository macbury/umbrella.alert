package macbury.umbrella.fragments;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidquery.AQuery;

import macbury.umbrella.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class LoadingFragment extends Fragment {
  private AQuery query;

  public LoadingFragment() {
      // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_loading, container, false);
  }

  @Override
  public void onResume() {
    query = new AQuery(this.getView());
    super.onResume();
    query.find(R.id.loading_progressbar).getProgressBar().setIndeterminate(true);
  }
}
