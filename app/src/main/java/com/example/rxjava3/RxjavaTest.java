package com.example.rxjava3;

import android.util.Log;

import com.example.a23design.Factory.A;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/**
 * create by 许家豪 on 2023/10/21
 * time:22:49
 **/
public class RxjavaTest {

    private volatile static RxjavaTest mInstance;
    private static final String TAG = "RxjavaTest";

    private RxjavaTest() {

    }

    public static RxjavaTest getmInstance() {
        if (mInstance == null) {
            synchronized (RxjavaTest.class) {
                if (mInstance == null) {
                    mInstance = new RxjavaTest();
                }
            }
        }
        return mInstance;
    }


    public void Test1() {

        Observer observer = new Observer() {
            private Disposable disposable;
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                Log.i(TAG, "onSubscribe11: "+d);
                disposable = d;
            }

            @Override
            public void onNext(Object o) {
                Log.i(TAG, "onSubscribe: "+o);
                if (o.equals("王五")){
//                    disposable.dispose();

                }

            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.i(TAG, "onSubscribe: "+e.toString());

            }

            @Override
            public void onComplete() {
                Log.i(TAG, "onComplete213213: ");

            }
        };

        Subscriber<String> subscriber = new Subscriber<String>() {
            private Subscription subscription;

            @Override
            public void onSubscribe(Subscription s) {
                Log.d("TAG", "onSubscribe");
                s.request(Long.MAX_VALUE);
                subscription = s;
            }

            @Override
            public void onNext(String s) {
                Log.d("TAG", "onNext:" + s);
                if (s.equals("王五")) {
//                    subscription.cancel();
                }
            }

            @Override
            public void onError(Throwable t) {
                Log.d("TAG", "onError" + t);
            }

            @Override
            public void onComplete() {
                Log.d("TAG", "onComplete");
            }
        };


        //方式1
//        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
//            @Override
//            public void subscribe(@NonNull ObservableEmitter<String> emitter) throws Throwable {
//                emitter.onNext("张三");
//                emitter.onNext("李四");
//                emitter.onNext("王五");
//                emitter.onNext("赵六");
//                emitter.onNext("孙七");
//                // 调用出错方法
//                //emitter.onError(new IllegalArgumentException("Test Exception!"));
//                // 调用完成方法
//                emitter.onComplete();
//            }
//        });

        //方式2
//        Observable observable2 = Observable.just("2312sd",111,new AAA("ewqeq"),"dsadas",111,222,333,444,555
//        ,777);

        //方式3

//        String[] dsa = new String[]{"dsadas","dsadas","AAAA"};
//
//        Observable observable3 = Observable.fromArray(dsa);
//
//        observable3.subscribe(observer);


//        Flowable<String> flowable = Flowable.create(new FlowableOnSubscribe<String>() {
//            @Override
//            public void subscribe(@NonNull FlowableEmitter<String> emitter) throws Throwable {
//                emitter.onNext("张三");
//                emitter.onNext("李四");
//                emitter.onNext("王五");
//                emitter.onNext("赵六");
//                emitter.onNext("孙七");
//                // 调用出错方法
//                //emitter.onError(new IllegalArgumentException("Test Exception!"));
//                // 调用完成方法
//                emitter.onComplete();
//            }
//        }, BackpressureStrategy.ERROR);
//
//        flowable.subscribe(subscriber);

    }
}
