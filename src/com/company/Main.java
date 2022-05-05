package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 2.4;
        triangle.b = 2.6;
        triangle.c = 1.5;
        System.out.println(triangle.area());
    }
}
