package com.example.a23design.Factory;

/**
 * create by 许家豪 on 2023/10/18
 * time:22:35
 **/
public class FactoryCreate {

    private static FactoryCreate factoryCreate;

    public static FactoryCreate getInstance() {
        if (factoryCreate == null) {
            synchronized (FactoryCreate.class) {
                if (factoryCreate == null) {
                    factoryCreate = new FactoryCreate();
                }
            }
        }
        return factoryCreate;
    }

    public Function CreateFunction(ABC abc){
        switch (abc){
            case A:
                return new A();
            case B:
                return new B();
            case C:
                return new C();
            default:
                break;
        }
        return null;

    }

    public enum ABC{
        A, B, C;

    }
}
