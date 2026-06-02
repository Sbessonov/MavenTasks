package com.code.geometry;

public class Circle extends AbstractShape {

    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.sqrt(radius);
    }

    @Override
    public void draw() {
        System.out.println("Circle");;
    }
}
