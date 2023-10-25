package com.example.a23design.Factory;

import android.util.Log;

/**
 * create by 许家豪 on 2023/10/18
 * time:22:34
 **/
public class B implements Function{
    private static final String TAG = "ABC";
    public B(){
        Log.i(TAG, "add: gc b");
    }
    @Override
    public void add() {
        Log.i(TAG, "add: ADD======b");
    }

    @Override
    public void jian() {
        Log.i(TAG, "add: ADD======b");
    }

    @Override
    public void cheng() {
        Log.i(TAG, "add: ADD======b");
    }

    @Override
    public void chu() {
        Log.i(TAG, "add: ADD======b");
    }
}