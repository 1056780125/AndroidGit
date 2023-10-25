package com.example.a23design.qiaojie;

import android.util.Log;

/**
 * create by 许家豪 on 2023/10/19
 * time:19:51
 **/
public class CirCle extends Sharp{
    private static final String TAG = "CirCle";


    @Override
    public void ShapeName() {
        Log.i(TAG, "ShapeName: 这是一个圆形"+ball.ballName());
    }
}
