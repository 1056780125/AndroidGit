package com.example.a23design.daili;

import android.util.Log;

/**
 * create by 许家豪 on 2023/10/19
 * time:20:19
 **/
public class MediaJie {
    private static final String TAG = "MediaJie";

    private Master master;

    public MediaJie() {
        master = new Master();
    }


    public void rent() {
        Log.i(TAG, "rent: 挂租赁合同");
        master.rent();
        Log.i(TAG, "rent: 受中介费");
    }
}
