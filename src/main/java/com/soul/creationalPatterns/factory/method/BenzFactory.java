package com.soul.creationalPatterns.factory.method;

public class BenzFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Benz();
    }
}
