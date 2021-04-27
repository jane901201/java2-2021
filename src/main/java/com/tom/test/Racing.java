package com.tom.test;

public class Racing {

    public static void main(String[] args) {
        boolean win = false;
        int finalStep = 9999;
        Horse[] horses = {
            new Horse("horse1"),
            new Horse("hourse2"),
            new Horse("horse3")
        };

        for (int i = 0; i < horses.length; i++) {
            horses[i].start();
        }

        /*Horse horse1 = new Horse("horse1");
        Horse horse2 = new Horse("horse2");
        horse1.start();
        horse2.start();*/
        while(!win) {

            for (int i = 0; i < horses.length; i++) {
                if(horses[i].getStep() == finalStep) {
                    System.out.println(horses[i].name + " wins");
                    for (int i1 = 0; i1 < horses.length; i1++) {
                        horses[i].setIsContinue(false);
                    }
                    win = true;
                    break;
                }

            }

            /*if(horse1.getStep() == 4) {
                horse1.setIsContinue(false);
                horse2.setIsContinue(false);
                System.out.println(horse1.name + " win");
                break;
            }
            if(horse2.getStep() == 4) {
                horse1.setIsContinue(false);
                horse2.setIsContinue(false);
                System.out.println(horse2.name + " win");
                break;
            }*/
        }

    }
}
