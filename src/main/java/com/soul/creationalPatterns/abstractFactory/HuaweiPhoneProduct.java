package com.soul.creationalPatterns.abstractFactory;

public class HuaweiPhoneProduct implements PhoneProduct{
    @Override
    public void callUp() {
        System.out.println("Huawei smartphone call up");
    }

    @Override
    public void sendSMS() {
        System.out.println("Huawei smartphone sends SMS");
    }
}
