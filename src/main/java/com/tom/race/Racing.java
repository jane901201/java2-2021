package com.tom.race;

public class Racing {
    public static void main(String[] args) {

        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        HorseRunnble h3 = new HorseRunnble();
        Thread thread = new Thread(h3);
        horse1.start();
        horse2.start();
        thread.start();


        /*for (int i = 0; i < 10000; i++) {
            System.out.println("horse1 " + i);
            System.out.println("horse2 " + i);
        }*/
    }
}
