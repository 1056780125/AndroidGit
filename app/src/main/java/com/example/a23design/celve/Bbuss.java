package com.example.a23design.celve;

/**
 * create by 许家豪 on 2023/10/20
 * time:20:12
 **/
public class Bbuss implements CustomPrice{
    @Override
    public void setPrice(double price) {
        System.out.println(0.5 * price);
    }
}
