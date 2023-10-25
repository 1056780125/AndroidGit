package com.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.a23design.R;
import com.example.a23design.beiwanglu.Memory;
import com.example.a23design.beiwanglu.Ori;
import com.example.a23design.beiwanglu.Person;
import com.example.a23design.celve.Abuss;
import com.example.a23design.celve.Bbuss;
import com.example.a23design.celve.CustomPrice;
import com.example.a23design.celve.Strage;
import com.example.a23design.event.LiveDataBusUtil;

import com.example.a23design.shipeiqi.IUsb;
import com.example.a23design.shipeiqi.UsbImpl;
import com.example.a23design.zhuangshizhe.Compoent;
import com.example.a23design.zhuangshizhe.CompoentJt;
import com.example.a23design.zhuangshizhe.DeCompoent;
import com.example.a23design.zhuangshizhe.DecompentJt;
import com.example.a23design.zhuangtai.State;
import com.example.a23design.zhuangtai.StateControl;
import com.example.a23design.zhuangtai.loginFail;
import com.example.a23design.zhuangtai.loginSuccess;
import com.example.rxjava3.RxjavaTest;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LiveDataBusUtil.sendStick("123","dsadas");





    }

    public void caca(View view) {
          ///工厂
//        FactoryCreate.getInstance().CreateFunction(FactoryCreate.ABC.A).add();
//        FactoryCreate.getInstance().CreateFunction(FactoryCreate.ABC.B).add();
//        FactoryCreate.getInstance().CreateFunction(FactoryCreate.ABC.C).add();

          //观察者
//        ObserSub m = new ObserSub();
//        Observer a = new AO();
//        Observer b = new BO();
//        m.addObserver(a);
//        m.addObserver(b);
//        m.notyfiy();

          //外观
//        Mangger mangger = new Mangger();
//        mangger.open();

          //桥接
//        Color color = new Green();
//        Color color1 = new Red();
//        Ball ball = new Basketball();
//        Ball ball1 = new Football();
//
//        ball.setBall(color);
//        ball1.setBall(color1);
//
//        Sharp sharp = new CirCle();
//        Sharp sharp1 = new Trance();
//
//        sharp.setball(ball);
//        sharp1.setball(ball1);
//
//        sharp.ShapeName();
//        sharp1.ShapeName();

        //代理
//        MediaJie mediaJie = new MediaJie();
//        mediaJie.rent();


//        Person c = new Person.Builder().setage(11).setname("sadas").setsex("dsaa").build();
//        System.out.println(c.toString());

        //策略
//        CustomPrice customPrice = new Abuss();
//        Strage c = new Strage(customPrice);
//        c.setCustomPrice(20);
//
//        Strage c1 = new Strage(new Bbuss());
//        c1.setCustomPrice(10);

        //状态
//        State a = new loginSuccess();
//        StateControl control = new StateControl(a);
//        control.add();

//        //适配器
//        IUsb s = new UsbImpl();
//        s.usb();
//
//
//        //装饰者
//        Compoent newRoom = new CompoentJt();//有一间新房间
//        DeCompoent bedroom = new DecompentJt(newRoom);
//        bedroom.fitment();//装修成卧室


//        //备忘录
//       Ori ori = new Ori("dsaas ");
//       Person mm = new Person();
//       mm.addMemento(ori.saveState());
//       ori.getStateFromMemento(mm.getMemento(1));

//        Stack stack = new Stack();
//
//        stack.push("ccc");
//        stack.push("ccc1");
//        stack.push("ccc2");
//
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.search("ccc1"));
//        System.out.println(stack.pop());


//        ArrayDeque s = new ArrayDeque();
//        s.add("111");
//        s.add("222");
//        s.add("333");
//        s.add("333");
//
//        System.out.println(s);
//        System.out.println(s.peek());
//
//        s.addFirst("0000");
//
//        System.out.println(s);
//
//        System.out.println(s.peek());


//        LinkedList linkedList = new LinkedList();
//        linkedList.add("1111");
//        linkedList.add("2222");
//        linkedList.add("3333");
//        linkedList.add("4444");
//        System.out.println("linkedList = " + linkedList);

//        RxjavaTest.getmInstance().Test1();


        System.out.println();

        System.out.println("MainActivity.caca11111");
        System.out.println("MainActivity.caca11111");
        System.out.println("MainActivity.caca11111");
        System.out.println("MainActivity.caca11111");
        System.out.println("MainActivity.caca11111");








    }



}