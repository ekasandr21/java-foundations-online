package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Figure {

    private double radius;
    public final static double PI = 3.1415926;

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

}
