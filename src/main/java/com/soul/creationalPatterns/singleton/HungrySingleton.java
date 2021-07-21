package com.soul.creationalPatterns.singleton;

// 饿汉式单例
// 缺点：如果这个单例中占用内存较大（比如存在很多个数组），那么一开始就创建它是很消耗内存的
public class HungrySingleton {

    // 只要是单例模式，构造器一定要私有
    private HungrySingleton() {
    }

    private static final  HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    public static HungrySingleton getHungrysingleton() {
        return HUNGRY_SINGLETON;
    }
}
