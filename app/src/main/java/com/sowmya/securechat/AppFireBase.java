package com.sowmya.securechat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by sowmya on 5/12/17.
 */

























































































































































































































































































public class AppFireBase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}