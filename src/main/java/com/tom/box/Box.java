package com.tom.box;

public class Box {

    public String name;
    public int length;
    public int width;
    public int height;
    public int[] array = new int[3];
    public  int price;

    public Box(String name, int length, int width, int height, int price) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.price = price;
    }

    public Box() {

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
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
    }

    public boolean compareToItem(int[] item) {
        for(int i = 0; i < item.length; i++) {
            if(item[i] <= array[i]) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }
}
