package com.soul.creationalPatterns.factory.simple;

// 简单工厂模式，又称静态工厂模式（使用静态方法）
// 缺点：当要增加一种新的产品时，必须修改工厂里的代码，不符合开闭原则

/**
 * 对比简单工厂模式和工厂方法模式：
 * 结构复杂度：simple好
 * 代码复杂度：simple好
 * 编程复杂度：simple好
 * 管理上的复杂度：simple好
 * 根据设计原则：methode好
 * 根据实际业务一般选择：简单工厂模式
 */

public class CarFactory {
    // 方法一
    // 缺点：如果这个时候新增加一种车，那么就要修改这里的代码，不符合开闭原则
    public static Car getCar(String carName) {
        if (carName.equals("Benz")) {
            return new Benz();
        } else if (carName.equals("BMW")) {
            return new BMW();
        } else if (carName.equals("Audi")) {
            return new Audi();
        } else {
            return null;
        }
    }
}
