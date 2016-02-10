package ru.test.pck1;

/**
 * Created by Аяз on 10.02.2016.
 */
public abstract class Animal {
    String name;
    int age;

    void sleep() {
        System.out.println("I'm sleeping");
    }

    abstract void sound();
}
