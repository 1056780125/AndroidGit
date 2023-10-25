package com.example.a23design.event;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * create by 许家豪 on 2023/10/21
 * time:17:39
 **/
public class LiveDataBusUtil {
    private final ConcurrentHashMap<String, MutableLiveData<Object>> mLiveDataMap;

    private LiveDataBusUtil() {
        this.mLiveDataMap = new ConcurrentHashMap();
    }

    private static LiveDataBusUtil getInstance() {
        return LiveDataBusHolder.INSTANCE;
    }

    public static LiveData<Object> with(int tag) {
        return with(String.valueOf(tag));
    }

    public static LiveData<Object> with(String tag) {
        MutableLiveData<Object> mutableLiveData = new MutableLiveData();
        getInstance().mLiveDataMap.put(tag, mutableLiveData);
        return mutableLiveData;
    }

    public static LiveDataSticky withStick(int tag) {
        return withStick(String.valueOf(tag));
    }

    public static LiveDataSticky withStick(String tag) {
        return new LiveDataSticky(tag, getInstance().mLiveDataMap);
    }

    public static <T> void send(int tag, T t) {
        send(String.valueOf(tag), t);
    }

    public static <T> void send(String tag, T t) {
        if (getInstance().mLiveDataMap.containsKey(tag) && getInstance().mLiveDataMap.get(tag) != null) {
            ((MutableLiveData) Objects.requireNonNull(getInstance().mLiveDataMap.get(tag))).setValue(t);
        }
    }

    public static <T> void sendPost(int tag, T t) {
        sendPost(String.valueOf(tag), t);
    }

    public static <T> void sendPost(String tag, T t) {
        if (getInstance().mLiveDataMap.containsKey(tag) && getInstance().mLiveDataMap.get(tag) != null) {
            ((MutableLiveData)Objects.requireNonNull(getInstance().mLiveDataMap.get(tag))).postValue(t);
        }
    }

    public static <T> void sendStick(int tag, T t) {
        sendStick(String.valueOf(tag), t);
    }

    public static <T> void sendStick(String tag, T t) {
        if (!getInstance().mLiveDataMap.containsKey(tag) || getInstance().mLiveDataMap.get(tag) == null) {
            getInstance().mLiveDataMap.put(tag, new MutableLiveData());
        }

        ((MutableLiveData)Objects.requireNonNull(getInstance().mLiveDataMap.get(tag))).setValue(t);
    }

    public static <T> void sendStickPost(int tag, T t) {
        sendStickPost(String.valueOf(tag), t);
    }

    public static <T> void sendStickPost(String tag, T t) {
        if (!getInstance().mLiveDataMap.containsKey(tag) || getInstance().mLiveDataMap.get(tag) == null) {
            getInstance().mLiveDataMap.put(tag, new MutableLiveData());
        }

        ((MutableLiveData)Objects.requireNonNull(getInstance().mLiveDataMap.get(tag))).postValue(t);
    }

    private static class LiveDataBusHolder {
        private static final LiveDataBusUtil INSTANCE = new LiveDataBusUtil();

        private LiveDataBusHolder() {
        }
    }
}