package com.soul.structuralPatterns.adapter;

public class AdaptorByInheritance extends Adaptee implements NetToUsb{
    @Override
    public void handleRequest() {
        super.request();    // 可以上网了
    }
}
