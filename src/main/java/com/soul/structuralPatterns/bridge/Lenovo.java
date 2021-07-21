package com.soul.structuralPatterns.bridge;

public class Lenovo implements Brand{
    @Override
    public void info() {
        System.out.print("Lenovo ");
    }
}
