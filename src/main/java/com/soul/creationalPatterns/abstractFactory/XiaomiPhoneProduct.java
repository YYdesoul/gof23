package com.soul.creationalPatterns.abstractFactory;

public class XiaomiPhoneProduct implements PhoneProduct{
    @Override
    public void callUp() {
        System.out.println("Xiao Mi Smartphone call up.");
    }

    @Override
    public void sendSMS() {
        System.out.println("Xiao Mi Smartphone sends SMS");
    }
}
