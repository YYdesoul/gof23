package com.soul.structuralPatterns.bridge;

public class Apple implements Brand{
    @Override
    public void info() {
        System.out.print("Apple ");
    }
}
