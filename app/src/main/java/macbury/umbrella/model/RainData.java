package macbury.umbrella.model;

import java.util.Date;

/**
 * Created by macbury on 27.08.14.
 */
public class RainData {
  private int volume;
  private Date at;

  public RainData() {

  }

  public Date getAt() {
    return at;
  }

  public void setAt(Date at) {
    this.at = at;
  }

  public void setAt(int t) {
    at = new Date();
    at.setTime((long)t*1000);
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public boolean isRaining() {
    return volume > 0;
  }
}
