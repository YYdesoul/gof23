package com.soul.creationalPatterns.abstractFactory;

public class HuaweiFactory implements ProductFactory{
    @Override
    public PhoneProduct getPhoneProduct() {
        return new HuaweiPhoneProduct();
    }

    @Override
    public RouterProduct getRouterProduct() {
        return new HuaweiRouterProduct();
    }
}
