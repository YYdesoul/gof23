package com.soul.creationalPatterns.abstractFactory;

public interface ProductFactory {
    PhoneProduct getPhoneProduct();

    RouterProduct getRouterProduct();
}
