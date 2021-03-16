package com.tom;

public class Box {


    public int length;
    public int width;
    public int weight;
    public int[] array = new int[3];
    public  int price;

    public Box(int length, int width, int weight, int price) {
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.price = price;
    }

    public void Box() {

    }

    public void array() {
        array[0] = length;
        array[1] = width;
        array[2] = weight;
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {

                }
            }
        }
    }
}
