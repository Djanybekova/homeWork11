package com.company;

public class Triangle {
    double a;
    double b;
    double c;

    double area() {
        double p;
        p = (a + b + c) / 2;
        double S;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника: " );
        return S;
    }
}
