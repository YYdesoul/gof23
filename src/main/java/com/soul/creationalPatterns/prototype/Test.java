package com.soul.creationalPatterns.prototype;

import java.util.Date;

// Spring Bean: 单例模式， 原型模式
// 原型模式 + 工厂模式 ==> new <=> 原型模式
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v1 = new Video("Star Trek", date);


        System.out.println("v1: " + v1);
        System.out.println("v1 hashcode: " + v1.hashCode());

        Video v2 = (Video) v1.clone();
        System.out.println("v2: " + v2);
        System.out.println("v2 hashcode: " + v2.hashCode());

        v2.setName("Clone Star Trek");
        System.out.println("v2: " + v2);

        // 比较浅克隆和克隆
        // 浅克隆，改变引用对象的值，克隆对象也会变；深克隆不会变
        System.out.println("浅克隆 vs 深克隆");
        date.setTime(23234324);
        System.out.println(v1);
        System.out.println(v2);
    }
}
