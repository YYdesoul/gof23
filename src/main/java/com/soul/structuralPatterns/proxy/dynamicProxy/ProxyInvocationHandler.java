package com.soul.structuralPatterns.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    Object target;  // 被代理对象

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.visitHouse();
        Object result = method.invoke(target, args);
        this.makeContract();
        return result;
    }

    public void visitHouse() {
        System.out.println("Agent lead renter to visit house.");
    }

    public void makeContract() {
        System.out.println("Agent makes a contract with renter. ");
    }
}
