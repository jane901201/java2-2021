package com.tom.box;

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

    public Box() {

    }

    public void arraySort() {
        array[0] = length;
        array[1] = width;
        array[2] = weight;
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
}
