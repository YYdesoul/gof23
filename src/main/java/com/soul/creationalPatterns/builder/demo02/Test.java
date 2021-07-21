package com.soul.creationalPatterns.builder.demo02;

public class Test {
    public static void main(String[] args) {
        Builder builder = new Worker();
        Product product = builder.buildA("Chicken Wings")
                                .getProduct();
        System.out.println(product);
    }
}
