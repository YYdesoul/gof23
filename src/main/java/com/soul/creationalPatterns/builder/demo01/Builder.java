package com.soul.creationalPatterns.builder.demo01;

public abstract class Builder {
    abstract void BuildA(); // 打地基
    abstract void BuildB(); // 钢筋工程
    abstract void BuildC(); // 铺电线
    abstract void BuildD(); // 粉刷

    // 完工，得到产品
    abstract Product getProduct();
}
