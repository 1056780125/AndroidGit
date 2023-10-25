package com.example.a23design.daili;

import android.util.Log;

/**
 * create by 许家豪 on 2023/10/19
 * time:20:18
 **/
public class Master implements RentHose{

    private static final String TAG = "Master";

    @Override
    public void rent() {
        Log.i(TAG, "rent: 房东收取房租");
    }
}
