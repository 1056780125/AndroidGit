package com.example.a23design.Factory;

import android.util.Log;

/**
 * create by 许家豪 on 2023/10/18
 * time:22:34
 **/
public class A implements Function{
    private static final String TAG = "ABC";

    public A(){
        Log.i(TAG, "add: gc a");
    }
    @Override
    public void add() {
        Log.i(TAG, "add: ADD======A");
    }

    @Override
    public void jian() {
        Log.i(TAG, "add: ADD======A");
    }

    @Override
    public void cheng() {
        Log.i(TAG, "add: ADD======A");
    }

    @Override
    public void chu() {
        Log.i(TAG, "add: ADD======A");
    }
}
