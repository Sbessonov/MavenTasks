package com.code.geometry;

public class Triangle extends AbstractShape {

    private final double a,b,c;

    public Triangle(double firstSideLength, double secondSideLengthSideLength, double thirdSideLength) {
        this.a = firstSideLength;
        this.b = secondSideLengthSideLength;
        this.c = thirdSideLength;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double p = perimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void draw() {
        System.out.println("Triangle");;
    }
}
