package com.soul.creationalPatterns.abstractFactory;

public class HuaweiRouterProduct implements RouterProduct{
    @Override
    public void openWifi() {
        System.out.println("Huawei router opens Wifi");
    }
}
