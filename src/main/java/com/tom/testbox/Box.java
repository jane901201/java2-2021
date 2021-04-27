package com.tom.testbox;

public class Box {
    int length;
    int width;
    int height;

    public boolean validate(int a, int b, int c) {
        if(length >= a && width >= b && height >= c) {
            return true;
        }else return false;
    }
}
