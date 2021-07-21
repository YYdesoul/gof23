package com.soul.creationalPatterns.factory.method;

public class BMWFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BMW();
    }
}
