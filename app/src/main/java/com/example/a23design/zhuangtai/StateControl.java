package com.example.a23design.zhuangtai;

/**
 * create by 许家豪 on 2023/10/20
 * time:21:21
 **/
public class StateControl {

    private State state;

    public StateControl(State state) {
        this.state = state;
    }

    public void add(){
        state.add();
    }


    public void jian(){
        state.jian();
    }

}
