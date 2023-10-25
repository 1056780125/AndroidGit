package com.example.a23design.qiaojie;

/**
 * create by 许家豪 on 2023/10/19
 * time:19:47
 **/
public abstract class Ball {
    public Color color;

    public void setBall(Color color) {
        this.color = color;
    }

    public abstract String ballName();

}
