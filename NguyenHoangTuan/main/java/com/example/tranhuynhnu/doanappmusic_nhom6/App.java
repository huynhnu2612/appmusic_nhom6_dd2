package com.example.tranhuynhnu.doanappmusic_nhom6;

import android.app.Application;
import android.content.Context;

/**
 * Created by BigBoss on 4/5/2018.
 */

public class App extends Application {
    private static Context context;


    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
