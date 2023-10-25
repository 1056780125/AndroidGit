package com.example.a23design.beiwanglu;

/**
 * create by 许家豪 on 2023/10/21
 * time:21:48
 **/
public class Ori {
    private String state;

    public Ori(String state) {
        this.state = state;
    }

    public Memory saveState(){
        return  new Memory(state);
    }

    public void getStateFromMemento(Memory memory){
        state = memory.getState();
    }


}
