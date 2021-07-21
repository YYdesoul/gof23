package com.soul.structuralPatterns.bridge;

public class Laptop extends Computer{
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("laptop.");
    }
}
