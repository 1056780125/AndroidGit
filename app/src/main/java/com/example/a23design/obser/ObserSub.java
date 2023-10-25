package com.example.a23design.obser;

import android.util.Log;

import java.util.ArrayList;

/**
 * create by 许家豪 on 2023/10/19
 * time:1:36
 **/
public class ObserSub implements Subject{
    private static final String TAG = "OBS";
    ArrayList<Observer> mlist = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        Log.i(TAG, "addObserver:");
        mlist.add(observer);
        notyfiy();

    }

    @Override
    public void deleteObserver(Observer observer) {
        Log.i(TAG, "deleteObserver:");
        mlist.remove(observer);
        notyfiy();
    }

    @Override
    public void notyfiy() {
        Log.i(TAG, "notyfiy:");
        for (Observer a :mlist) {
            a.updata();
        }

    }
}
