package com.example.suhanshu.kvz.Services;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import com.example.suhanshu.kvz.Common;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
         handleNotification(remoteMessage.getNotification().getBody());
     }

    private void handleNotification(String body) {
        Intent pushNotification=new Intent(Common.STR_PUSH);
        pushNotification.putExtra("message",body);
        LocalBroadcastManager.getInstance(this).sendBroadcast(pushNotification);
    }
}
