package com.example.a23design.beiwanglu;

import java.util.ArrayList;
import java.util.List;

/**
 * create by 许家豪 on 2023/10/21
 * time:22:00
 **/
public class Person {
    private List<Memory> mementos = new ArrayList<>();

    public void addMemento(Memory memento) {
        mementos.add(memento);
    }

    public Memory getMemento(int index) {
        return mementos.get(index);
    }


}
