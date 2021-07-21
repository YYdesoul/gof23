package com.soul.creationalPatterns.factory.method;

public class Consumer {
    public static void main(String[] args) {
        Car car1 = new AudiFactory().getCar();
        Car car2 = new BenzFactory().getCar();

        car1.name();
        car2.name();

        Car car3 = new BMWFactory().getCar();

        car3.name();
    }
}
