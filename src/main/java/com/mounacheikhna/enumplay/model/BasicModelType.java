package com.mounacheikhna.enumplay.model;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public enum BasicModelType implements ModelType {
    FL("fl");

    private String category;

    BasicModelType(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    private static Map<String, ModelType> map = new TreeMap<>();

    static {
        for (ModelType modelType : values()) {
            map.put(modelType.getCategory(), modelType);
        }
    }

    public static ModelType modelTypeFor(String category) {
        return map.get(category);
    }

    public static void addNewModelType(ModelType type) {
        if (!map.containsKey(type.getCategory())) {
            map.put(type.getCategory(), type);
        }
    }

    public static Collection<ModelType> models() {
        return map.values();
    }

}
