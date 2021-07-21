package com.soul.creationalPatterns.abstractFactory;

public class XiaomiRouterProduct implements RouterProduct{
    @Override
    public void openWifi() {
        System.out.println("Xiao Mi router opens Wifi");
    }
}
