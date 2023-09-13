package com.serenitydojo;

public abstract class Pet {
    private String name;
    public String getName(){
        return this.name;
    }
    private int age;
    public int getAge(){
        return this.age;
    }

    public Pet(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public abstract String play();
}
