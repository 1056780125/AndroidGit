package com.example.a23design.zhuangshizhe;

/**
 * create by 许家豪 on 2023/10/21
 * time:18:47
 **/
public class DeCompoent implements Compoent{

    private Compoent mRoom;//持有被装饰者的引用，这里是需要装修的房间

    public DeCompoent(Compoent room) {
        this.mRoom = room;
    }

    @Override
    public void fitment() {
        mRoom.fitment();//调用被装饰者的方法
    }

}
