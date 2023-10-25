package com.example.a23design.celve;

/**
 * create by 许家豪 on 2023/10/20
 * time:20:12
 **/
public class Strage {

    private CustomPrice customPrice;

    public Strage(CustomPrice customPrice) {
        this.customPrice = customPrice;
    }

    public void setCustomPrice(int price){
        customPrice.setPrice(price);
    }



}
