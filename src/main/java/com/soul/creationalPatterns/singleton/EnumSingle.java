package com.soul.creationalPatterns.singleton;

import java.lang.reflect.Constructor;

// 枚举单例
// 最安全
// 反射无法破坏枚举的单例
public enum EnumSingle {
    INSTANCE;

    public EnumSingle getInstance() {
        return INSTANCE;
    }
}

class Test{
    public static void main(String[] args) throws Exception {
        EnumSingle instance1 = EnumSingle.INSTANCE;
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle instance2 = declaredConstructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
