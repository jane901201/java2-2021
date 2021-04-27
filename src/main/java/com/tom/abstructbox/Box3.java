package com.tom.abstructbox;

public class Box3 extends Box{

    public Box3(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    @Override
    public String getName() {
        return "Box3";
    }
}
