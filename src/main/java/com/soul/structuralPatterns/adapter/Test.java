package com.soul.structuralPatterns.adapter;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 通过继承上网
        NetToUsb adaptorByInheritance = new AdaptorByInheritance();

        computer.net(adaptorByInheritance);

        // 通过组合上网
        Adaptee adaptee = new Adaptee();
        NetToUsb adaptor = new AdaptorByCombination(adaptee);
        computer.net(adaptor);
    }
}
