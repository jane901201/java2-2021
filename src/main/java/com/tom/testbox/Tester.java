package com.tom.testbox;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes = {
                new Box1(),
                new Box2(),
                new Box3(),
        };

        System.out.println(boxes[0].validate(2,2,2));
    }
}
