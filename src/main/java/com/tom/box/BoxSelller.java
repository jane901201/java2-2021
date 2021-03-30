package com.tom.box;

import java.util.Scanner;

public class BoxSelller {



    public static void main(String[] args) {

        BoxSelller boxSelller = new BoxSelller();

        Scanner scanner = new Scanner(System.in);

        int item[] = {0, 0, 0};

        Box box3 = new Box("box3", 10,10,10, 60);
        Box box5 = new Box("box5",10,20,20,90);
        Box boxes[] = {box3, box5};
        box3.arraySort();
        box5.arraySort();

        //box3.printArray();
        //box5.printArray();

        //System.out.println("Please enter your object size");
        for(int i = 0; i < item.length; i++) { //enter number
            switch (i) {
                case 0:
                    System.out.println("Please enter your object length");
                    break;
                case 1:
                    System.out.println("Please enter your object width");
                    break;
                case 2:
                    System.out.println("Please enter your object weight");
            }
            item[i] = scanner.nextInt();
        }

        for(int i = 0; i < item.length; i++) { //sortitem
            for(int j = i; j < item.length; j++) {
                if(item[i] > item[j]) {
                    int num = item[i];
                    item[i] = item[j];
                    item[j] = num;
                }
            }
        }

        for(int i = 0; i < boxes.length; i++) { //priceSort
            for(int j = i; j < boxes.length; j++) {
                if(boxes[i].price > boxes[j].price) {
                    Box b = boxes[i];
                    boxes[i] = boxes[j];
                    boxes[j] = b;
                }
            }

        }

        for (int i = 0; i < boxes.length; i++) { //compare
            boolean check = boxes[i].compareToItem(item);
            if(check == true) {
                System.out.println("Your best choose is " + boxes[i].getName() + ", the total is " + boxes[i].price);
                break;
            }
            if(i == (boxes.length) - 1 && check == false) {
                System.out.println("Sorry, We don't have your request");
            }
        }


    }




}
