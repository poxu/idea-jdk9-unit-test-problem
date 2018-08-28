package com.demo;

import com.demo.visible.SoftwareProduct;

import java.util.ServiceLoader;

public class Application {
    public static void main(String[] args) {
        System.out.println(findSoftware().getVersion());
    }

    public static SoftwareProduct findSoftware() {
        return ServiceLoader.load(SoftwareProduct.class).findFirst().orElse(null);
    }
}
