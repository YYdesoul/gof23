package com.soul.structuralPatterns.adapter;

// 客户端类：想上网，但是插不上网线，需要适配器
public class Computer {

    // 电脑连接上转接器才能上网
    public void net(NetToUsb adaptor) {
        adaptor.handleRequest();
    }
}
