package com.haru.test;

import android.app.Notification;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.haru.push.Push;
import com.haru.push.PushReceiver;

/**
 *
 */
public class TestPushReceiver extends PushReceiver {
    @Override
    public Notification onNotification(Context context, Push push) {
        return super.onNotification(context, push);
    }

    @Override
    public void onMessage(Context context, Push push) {
        Log.i("HaruTest", "Push Received => " + push.getMessage());
        Toast.makeText(context, push.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
