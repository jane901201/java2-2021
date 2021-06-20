package com.tom.abstructbox;

public abstract class Box {
    public String name;
    public int length;
    public int width;
    public int height;
    public int[] array = new int[3];
    public  int price;

    public boolean validate(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }

    public void arraySort() {
        array[0] = length;
        array[1] = width;
        array[2] = height;
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
        }
    }

    public void printArray() {
        for (int i : array) {
            System.out.println(i);
        }
    }


    public abstract String getName();

}
