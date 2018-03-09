package com.mounacheikhna.enumplay.model;

public class ModelManager {

    public ModelManager() {
        for (AppModelType type : AppModelType.values()) {
            BasicModelType.addNewModelType(type);
        }

        // can now use BasicModelType type to get all enums values
    }

    public void printAllValues(){
        for (ModelType type : BasicModelType.models()) {
            System.out.println(type);
        }
    }
}
