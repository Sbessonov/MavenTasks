package com.code.geometry;

public class Square extends AbstractShape{

    private final double sideLength;

    public Square(double sideLength) {
        if (sideLength <= 0){
            throw new IllegalArgumentException();
        }
        this.sideLength = sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
