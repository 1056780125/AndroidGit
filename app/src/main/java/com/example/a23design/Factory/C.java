package com.example.a23design.Factory;

import android.util.Log;

/**
 * create by 许家豪 on 2023/10/18
 * time:22:34
 **/
public class C implements Function{
    private static final String TAG = "ABC";

    public C() {
        Log.i(TAG, "gc c");
    }

    @Override
    public void add() {
        Log.i(TAG, "add: ADD======c");
    }

    @Override
    public void jian() {
        Log.i(TAG, "add: ADD======c");
    }

    @Override
    public void cheng() {
        Log.i(TAG, "add: ADD=====c");
    }

    @Override
    public void chu() {
        Log.i(TAG, "add: ADD======c");
    }
}