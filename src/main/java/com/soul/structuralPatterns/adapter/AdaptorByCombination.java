package com.soul.structuralPatterns.adapter;

// 常用
public class AdaptorByCombination implements NetToUsb{
    Adaptee adaptee;

    public AdaptorByCombination(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
