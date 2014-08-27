package macbury.umbrella.model;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by macbury on 26.08.14.
 */
public class Forecast {
  private ArrayList<RainData> data;
  private Date fromDate;
  private Date toDate;
  private String city;
  private float totalRainVolume;
  private boolean notFresh;

  public Forecast() {
    data = new ArrayList<RainData>();
  }

  public void parse(JSONObject object) {
    data.clear();
    totalRainVolume = 0;
    fromDate        = null;
    toDate          = null;
    try {
      getAllInfo(object);
    } catch (JSONException e) {
      e.printStackTrace();
    }
  }

  private void getAllInfo(JSONObject root) throws JSONException {
    JSONObject cityJson = root.getJSONObject("city");
    city                = cityJson.getString("name");
    
    JSONArray listJSON  = root.getJSONArray("list");
    for(int i = 0; i < Math.min(listJSON.length(), 6); i++) {
      RainData rainData      = new RainData();
      JSONObject rawRainData = listJSON.getJSONObject(i);
      rainData.setAt(rawRainData.getInt("dt"));

      if (rawRainData.has("rain")) {
        JSONObject rain = rawRainData.getJSONObject("rain");
        rainData.setVolume((float)rain.getDouble("3h"));
      } else {
        rainData.setVolume(0);
      }

      totalRainVolume += rainData.getVolume();

      if (fromDate == null || rainData.getAt().before(fromDate)) {
        fromDate = rainData.getAt();
      }

      if (toDate == null || rainData.getAt().after(toDate)) {
        toDate   = rainData.getAt();
      }

      data.add(rainData);
    }
  }

  public boolean takeUmbrella() {
    return totalRainVolume > 0.0;
  }

  public float getTotalRainVolume() {
    return totalRainVolume;
  }

  public Date getToDate() {
    return toDate;
  }

  public Date getFromDate() {
    return fromDate;
  }

  public String getCity() {
    return city;
  }

  public String toJSON() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  public boolean isFresh() {
    Date currentDate = new Date();
    return fromDate.after(currentDate) && toDate.before(currentDate);
  }

  public boolean isNotFresh() {
    return !isFresh();
  }
}
