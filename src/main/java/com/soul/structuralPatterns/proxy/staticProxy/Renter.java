package com.soul.structuralPatterns.proxy.staticProxy;

public class Renter {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.setHost(new Host());

        proxy.rentHouse();
    }
}
