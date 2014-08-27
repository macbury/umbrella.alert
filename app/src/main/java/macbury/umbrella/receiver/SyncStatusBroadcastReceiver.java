package macbury.umbrella.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import macbury.umbrella.managers.IntentsManager;
import macbury.umbrella.service.CheckWeatherService;

/**
 * Created by macbury on 27.08.14.
 */
public abstract class SyncStatusBroadcastReceiver extends BroadcastReceiver {
  @Override
  public void onReceive(Context context, Intent intent) {
    CheckWeatherService.SyncStatus status  = (CheckWeatherService.SyncStatus)intent.getSerializableExtra(IntentsManager.EXTRA_SYNC_STATUS);
    onSyncStatus(status);
  }

  public abstract void onSyncStatus(CheckWeatherService.SyncStatus status);
}
