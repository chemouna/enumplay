package com.mounacheikhna.enumplay.model;

public enum AppModelType implements ModelType {
    TL("tl"),
    EM("em");

    private String category;

    AppModelType(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }
}
