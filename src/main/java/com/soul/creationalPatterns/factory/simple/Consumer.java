package com.soul.creationalPatterns.factory.simple;

public class Consumer {
    public static void main(String[] args) {
        // 需要消费者自己new， 不好
//        Car car1 = new Audi();
//        Car car2 = new Benz();
//
//        car1.name();
//        car2.name();

        Car car1 = CarFactory.getCar("Benz");
        Car car2 = CarFactory.getCar("Audi");

        car1.name();
        car2.name();

        Car car3 = CarFactory.getCar("BMW");
        car3.name();
    }
}
