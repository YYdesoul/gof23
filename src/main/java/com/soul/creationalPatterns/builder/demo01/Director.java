package com.soul.creationalPatterns.builder.demo01;

public class Director {
    public Product build(Builder builder) {
        builder.BuildA();
        builder.BuildB();
        builder.BuildC();
        builder.BuildD();
        return builder.getProduct();
    }
}
