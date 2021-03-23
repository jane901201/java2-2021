package com.tom.stu;

public class GraduateStudent extends Student{

    int thesis;

    public GraduateStudent(String id, String name, int math, int english, int thesis) {
        super(id, name, math, english);
        this.thesis = thesis;

    }

    @Override
    public void print() {
        System.out.println(id + "\t" + name + "\t" + english + "\t" + (english + math)/2 + "\t" + thesis);
    }
}
