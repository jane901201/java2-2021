package com.tom;

public class HelloWorld {


    public static void main(String[] args) {
        Student[] students = {
                new Student("0001", "Jack", 30, 40),
                new Student("0002", "June", 30, 40),
                new Student("0003", "Tina", 30, 40),
                new Student("0004", "Bobo", 30, 40)

        };

        for(int i =0; i < students.length; i++) {
            students[i].print();
        }


//        System.out.println("Hello World");
    }
}
