package com.example.a23design.jianzaozhe;

/**
 * create by 许家豪 on 2023/10/19
 * time:21:35
 **/
public class Person {

    private int age;
    private String name;
    private String sex;

    public Person(Builder builder){
        this.age = builder.age;
        this.name = builder.name;
        this.sex = builder.sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static class Builder{
        private int age;
        private String name;
        private String sex;

        public Builder setage(int age){
            this.age = age;
            return this;
        }
        public Builder setname(String name){
            this.name = name;
            return this;
        }
        public Builder setsex(String sex){
            this.sex = sex;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
