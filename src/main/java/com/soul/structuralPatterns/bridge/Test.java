package com.soul.structuralPatterns.bridge;

public class Test {
    public static void main(String[] args) {
        Computer computer1 = new Desktop(new Apple());
        computer1.info();

        Computer computer2 = new Laptop(new Lenovo());
        computer2.info();
    }
}
