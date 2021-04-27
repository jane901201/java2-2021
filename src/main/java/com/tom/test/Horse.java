package com.tom.test;

public class Horse extends Thread{

    String name;
    int step;
    int finalStep = 9999;
    boolean isContinue = true;

    public Horse(String name) {
        this.name = name;
    }



    @Override
    public void run() {
        while(isContinue) {
            for (int i = 0; i < finalStep; i++) {
                step = i;
                System.out.println(name  + " " +  (i + 1));
            }
        }

    }


    public int getStep() {
        return step;
    }

    public void setIsContinue(boolean isContinue) {
        this.isContinue = isContinue;
    }

}
