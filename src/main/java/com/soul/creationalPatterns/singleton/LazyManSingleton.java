package com.soul.creationalPatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// DCL懒汉式
public class LazyManSingleton {

    // 防止两个对象都是用反射创建的
    private static boolean flag = false;

    private LazyManSingleton() {
//        System.out.println(Thread.currentThread().getName() + "ok");
        synchronized (LazyManSingleton.class) {
            if (flag == false){
                flag = true;
            } else {
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }
    }

    private volatile static LazyManSingleton lazyManSingleton;

    // 在多线程下，懒汉单例可能会失败，所以：
    // 双重检测锁模式的 懒汉单例 DCL懒汉式
    // 但是依旧不符合原子性
    // 要加上volatile关键字
    public static LazyManSingleton getInstance() {
        if (lazyManSingleton == null) {
            synchronized (LazyManSingleton.class){
                if (lazyManSingleton == null) {
                    /**
                     * 1. 分配内存空间
                     * 2. 执行构造方法，初始化对象
                     * 3. 把这个对象指向这个空间
                     *
                     * 如果CPU执行顺序为123就没问题
                     * 但是如果执行顺序为132就有可能出现现成A分配了内存空间但是没有初始化对象，而线程B任务已经执行了
                     */
                    lazyManSingleton = new LazyManSingleton();  // 不是一个原子性操作
                }
            }
        }
        return lazyManSingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LazyManSingleton instance = LazyManSingleton.getInstance();
        // 用反射创建第二个对象
        Constructor<LazyManSingleton> declaredConstructor = LazyManSingleton.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        LazyManSingleton instance2 = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(instance2);
    }
}
