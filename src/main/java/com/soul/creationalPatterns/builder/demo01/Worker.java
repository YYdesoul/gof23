package com.soul.creationalPatterns.builder.demo01;

public class Worker extends Builder{
    private Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    void BuildA() {
        product.setBuildA("地基");
        System.out.println(product.getBuildA());
    }

    @Override
    void BuildB() {
        product.setBuildB("钢筋");
        System.out.println(product.getBuildB());
    }

    @Override
    void BuildC() {
        product.setBuildC("铺电线");
        System.out.println(product.getBuildC());
    }

    @Override
    void BuildD() {
        product.setBuildD("粉刷");
        System.out.println(product.getBuildD());
    }

    @Override
    Product getProduct() {
        return product;
    }
}
