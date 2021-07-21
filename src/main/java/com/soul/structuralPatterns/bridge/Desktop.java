package com.soul.structuralPatterns.bridge;

public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    public void info() {
        super.info();
        System.out.println("desktop.");
    }

}
