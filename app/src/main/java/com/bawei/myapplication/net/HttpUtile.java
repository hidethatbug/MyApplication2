package com.bawei.myapplication.net;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.bawei.myapplication.MyApplication;

public class HttpUtile {
    private static final HttpUtile ourInstance = new HttpUtile();

    public static HttpUtile getInstance() {
        return ourInstance;
    }

    private HttpUtile() {
    }

    public void getData_GET(String path, final DataCallBack dataCallBack) {
        StringRequest request = new StringRequest(Request.Method.GET,
                path,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        dataCallBack.Success(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        dataCallBack.Error(error.getMessage());
                    }
                });
        request.setTag("get");
        MyApplication.getQueue().add(request);
    }
}
