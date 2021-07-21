package com.soul.creationalPatterns.abstractFactory;

public class XiaomiFactory implements ProductFactory{
    @Override
    public PhoneProduct getPhoneProduct() {
        return new XiaomiPhoneProduct();
    }

    @Override
    public RouterProduct getRouterProduct() {
        return new XiaomiRouterProduct();
    }
}
