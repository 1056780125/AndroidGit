package com.example.rxjava3;/**
 *create by 许家豪 on 2023/10/21 
 *time:23:01
**/public class AAA {

    private String name;

    public AAA(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AAA{" +
                "name='" + name + '\'' +
                '}';
    }
}
