package com.tom.stu;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students = {
                new Student("0001", "Jack", 30, 40),
                new Student("0002", "June", 30, 40),
                new Student("0003", "Tina", 30, 40),
                new Student("0004", "Bobo", 30, 40)

        };

        GraduateStudent[] graduateStudents = {
                new GraduateStudent("0000", "Mario", 33, 40, 70),
                new GraduateStudent("1111", "Weegee", 80, 40, 70),
        };


        for(int i =0; i < students.length; i++) {
            students[i].print();
        }
        for(int i = 0; i < graduateStudents.length; i++) {
            graduateStudents[i].print();
        }
    }
}
