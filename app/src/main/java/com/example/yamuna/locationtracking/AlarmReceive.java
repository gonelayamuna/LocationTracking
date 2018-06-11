package com.example.yamuna.locationtracking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/**
 * Created by Yamuna on 6/10/2018.
 */

public class AlarmReceive extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("Service_call_"  , "You are in AlarmReceive class.");
        Intent background = new Intent(context, LocationService.class);
//        Intent background = new Intent(context, GoogleService.class);
        Log.e("AlarmReceive ","testing called broadcast called");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            context.startService(background);
        }
    }
}
