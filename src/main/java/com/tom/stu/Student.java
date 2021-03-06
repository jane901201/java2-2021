package com.tom.stu;

public abstract class Student {

    String id;
    String name;
    int math;
    int english;

    public Student() {
        super();
    }

   public Student(String id, String name, int math, int english) {
       this.id = id;
       this.name = name;
       this.english = english;
       this.math = math;
   }

   public abstract void mail();

   public void print() {
       System.out.println(id + "\t" + name + "\t" + english + "\t" + (english + math)/2);
   }

}
