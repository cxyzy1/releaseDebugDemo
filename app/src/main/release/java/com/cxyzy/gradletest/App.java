package com.cxyzy.gradletest;

import android.app.Application;

public class App extends Application {
    private static App instance;
    private static final String TAG = App.class.getSimpleName();
    public static App getInstance()
    {
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
    public String getVersion()
    {
        return "release";
    }
}
