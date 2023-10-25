package com.example.a23design.waiguan;

import android.util.Log;

/**
 * create by 许家豪 on 2023/10/19
 * time:2:05
 **/
public class light {
    private static final String TAG = "WG light";

    public light() {

    }


    public void open(){
        Log.i(TAG, "open: d打开灯");
    }
    public void close(){
        Log.i(TAG, "close: 关闭灯");
    }
}
