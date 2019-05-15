package com.bawei.myapplication;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.util.Queue;

/**
 * 作者程金柱
 * 时间：2019年5月15日21:11:16
 * 功能：把queue变成全局
 */
public class MyApplication extends Application {
    private static RequestQueue queue;

    @Override
    public void onCreate() {
        super.onCreate();
        queue= Volley.newRequestQueue(getApplicationContext());
    }
    public static RequestQueue getQueue(){
        return queue;
    }
}
