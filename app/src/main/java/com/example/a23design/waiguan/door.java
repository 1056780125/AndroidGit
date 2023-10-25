package com.example.a23design.waiguan;

import android.util.Log;

/**
 * create by 许家豪 on 2023/10/19
 * time:2:05
 **/
public class door {
    private static final String TAG = "WG door";

    public door() {

    }


    public void open(){
        Log.i(TAG, "open: 打开门");
    }
    public void close(){
        Log.i(TAG, "close: 关闭门");
    }
}
