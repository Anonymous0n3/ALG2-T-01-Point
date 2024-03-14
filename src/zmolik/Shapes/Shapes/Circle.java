package zmolik.Shapes.Shapes;

import zmolik.Shapes.Point;

import java.util.ArrayList;

public class Circle extends Shape{
    private double radius;

    public Circle(ArrayList<Point> points) {
        super("Rectangle", points);
    }

    @Override
    public void area() {
        setArea(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void circumference() {
        setCircumference(2 * Math.PI * radius);
    }

    public double getRadius() {
        return radius;
    }

    private void computeRadius() {
        radius = getPoints().get(0).distance(getPoints().get(1));
    }
}
