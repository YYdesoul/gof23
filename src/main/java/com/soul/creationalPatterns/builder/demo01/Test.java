package com.soul.creationalPatterns.builder.demo01;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.build(new Worker());
        System.out.println(product.toString());
    }
}
