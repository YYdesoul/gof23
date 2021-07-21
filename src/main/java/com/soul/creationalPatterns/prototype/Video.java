package com.soul.creationalPatterns.prototype;

import java.util.Date;

/**
 * 原型模式步骤
 * 1. implements一个接口：Cloneable
 * 2. 实现一个方法：clone
 */

public class Video implements Cloneable{
    private String name;
    private Date date;

    public Video(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // 浅克隆
//        return super.clone();

        // 深克隆
        Object obj = super.clone();
        Video v = (Video) obj;
        v.date = (Date) this.date.clone();  // 将这个对象的属性也克隆
        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
