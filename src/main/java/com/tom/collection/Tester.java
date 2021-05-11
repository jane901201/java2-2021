package com.tom.collection;

import java.util.ArrayList;
import java.uitl.*;

public class Tester {


    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(3);
        t.add(4);
        t.add(2);
        System.out.println(t.size());
        ArrayList list = new ArrayList();//異質
        ArrayList<Integer> nums = new ArrayList<Integer>();//要使用原本的Class，不能用簡便的primitive

        Box box = new Box();
        Tester tester = new Tester();
        Integer integer = new Integer(12);
        Float f = new Float(2.4f);
        Double d = new Double(3.2d);
        Long l = new Long(343242);
        Byte aByte = new Byte(Byte.MAX_VALUE);
        //System.out.println(Byte.MAX_VALUE);
        Boolean aBoolean = new Boolean(true);
        Character character = new Character('c');
        String s = new String("Hello World");

        list.add("June");
        list.add(true);
        list.add(123);
        list.add(box);
        list.add(tester);

        String name = (String)list.get(0);
        System.out.println(name);

    }
}
