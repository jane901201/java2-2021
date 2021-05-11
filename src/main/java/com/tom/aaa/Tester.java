package com.tom.aaa;

public class Tester {
    public static void main(String[] args) {
        Reporter reporter = new HeheheReporter();
        Reporter reporter1 = new WeatherReporter();
        System.out.println(reporter.getName());
        System.out.println(reporter1.getName());
    }
}
