package com.example.a23design.waiguan;

/**
 * create by 许家豪 on 2023/10/19
 * time:2:06
 **/
public class Mangger {

    private light light;
    private door door;

    public Mangger() {
        light =  new light();
        door = new door();
    }

    public void open(){
        light.open();
        door.open();
    }
}
