package com.demo.hidden;

import com.demo.visible.SoftwareProduct;

public class SoftwareProductImpl implements SoftwareProduct {
    @Override
    public String getVersion() {
        return "1.2.3";
    }
}
