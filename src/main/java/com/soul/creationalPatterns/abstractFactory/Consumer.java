package com.soul.creationalPatterns.abstractFactory;

public class Consumer {
    public static void main(String[] args) {
        ProductFactory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.getPhoneProduct().callUp();
        xiaomiFactory.getRouterProduct().openWifi();

        ProductFactory huweiFactory = new HuaweiFactory();
        huweiFactory.getPhoneProduct().callUp();
        huweiFactory.getRouterProduct().openWifi();
    }
}
