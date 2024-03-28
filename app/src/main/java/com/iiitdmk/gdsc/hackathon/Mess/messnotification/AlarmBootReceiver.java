package com.iiitdmk.gdsc.hackathon.Mess.messnotification;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;

import java.util.Objects;


public class AlarmBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            BreakfastAlarmMaker.makeAlarm(context);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                LunchAlarmMaker.makeAlarm(context);
            }
            TiffinAlarmMaker.makeAlarm(context);
            DinnerAlarmMaker.makeAlarm(context);
            ComponentName receiver = new ComponentName(context, AlarmBootReceiver.class);
            PackageManager pm = context.getPackageManager();
            pm.setComponentEnabledSetting(receiver,
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP);
        }
    }

}
