package com.example.a23design.qiaojie;

import android.util.Log;

/**
 * create by 许家豪 on 2023/10/19
 * time:19:51
 **/
public class Trance extends Sharp{
    private static final String TAG = "Trance";

    @Override
    public void ShapeName() {
        Log.i(TAG, "ShapeName: 这是一个方形"+  ball.ballName());
    }
}
