package ru.test.pck1;

/**
 * Created by Аяз on 10.02.2016.
 */
public class Bat extends Animal implements IFlyable {
    @Override
    public void fly() {
        System.out.println("Bat is flying");
    }

    @Override
    void sound() {
        System.out.println("Bat makes non hearable ultrasound");
    }
}
