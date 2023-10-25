package com.example.a23design.qiaojie;

import android.util.Log;

/**
 * create by 许家豪 on 2023/10/19
 * time:19:49
 **/
public class Basketball extends Ball {
    private static final String TAG = "Basketball";

    @Override
    public String ballName() {
        return color.ColorName() + "篮球";
    }
}
