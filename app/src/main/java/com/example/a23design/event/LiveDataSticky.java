package com.example.a23design.event;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * create by 许家豪 on 2023/10/21
 * time:17:40
 **/
public class LiveDataSticky {
    private final ConcurrentHashMap<String, MutableLiveData<Object>> mLiveDataMap;
    private final String mTag;

    public LiveDataSticky(String tag, ConcurrentHashMap<String, MutableLiveData<Object>> liveDataMap) {
        this.mTag = tag;
        this.mLiveDataMap = liveDataMap;
    }

    public void observe(LifecycleOwner owner, Observer<Object> observer) {
        if (!this.mLiveDataMap.containsKey(this.mTag) || this.mLiveDataMap.get(this.mTag) == null) {
            this.mLiveDataMap.put(this.mTag, new MutableLiveData());
        }

        ((MutableLiveData) Objects.requireNonNull(this.mLiveDataMap.get(this.mTag))).observe(owner, (o) -> {
            observer.onChanged(o);
            this.mLiveDataMap.put(this.mTag, new MutableLiveData());
            this.observe(owner, observer);
        });
    }
}
