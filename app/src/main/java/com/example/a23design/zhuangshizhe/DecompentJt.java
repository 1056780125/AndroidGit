package com.example.a23design.zhuangshizhe;

/**
 * create by 许家豪 on 2023/10/21
 * time:18:49
 **/
public class DecompentJt extends DeCompoent {


    public DecompentJt(Compoent room) {
        super(room);
    }

    @Override
    public void fitment() {
        super.fitment();
        addBedding();
    }

    private void addBedding() {
        System.out.println("装修成卧室：添加卧具");
    }


}
