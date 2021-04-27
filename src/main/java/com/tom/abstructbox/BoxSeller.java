package com.tom.abstructbox;

public class BoxSeller {

    public static void main(String[] args) {
        Box box3 = new Box3(3,5,6);
        Box box5 = new Box5(3, 3, 3);

        System.out.println(box3.getName());
        System.out.println(box5.getName());
    }

}
