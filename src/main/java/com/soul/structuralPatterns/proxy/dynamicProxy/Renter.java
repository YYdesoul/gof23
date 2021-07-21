package com.soul.structuralPatterns.proxy.dynamicProxy;

public class Renter {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        // 生成代理角色Handler
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host);    // 设置被代理类
        Rent proxy = (Rent) pih.getProxy(); // 生成代理角色
        proxy.rentHouse();
    }

}
