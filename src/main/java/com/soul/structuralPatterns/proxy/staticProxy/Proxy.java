package com.soul.structuralPatterns.proxy.staticProxy;

public class Proxy implements Rent{
    Host host;

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rentHouse() {
        this.visitHouse();
        host.rentHouse();
        this.makeContract();
    }

    public void visitHouse() {
        System.out.println("Agent lead renter to visit house.");
    }

    public void makeContract() {
        System.out.println("Agent makes a contract with renter. ");
    }
}
