package com.example.a23design.obser;


/**
 * create by 许家豪 on 2023/10/19
 * time:1:33
 **/
public interface Subject {

    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notyfiy();
}
