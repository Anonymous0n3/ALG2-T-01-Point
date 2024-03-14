package zmolik.Shapes.Shapes;

import zmolik.Shapes.Point;

import java.util.ArrayList;

public class Rectangle extends Shape{

    public Rectangle(ArrayList<Point> points) {
        super("Rectangle", points);
    }

    @Override
    public void area() {
        double a = getPoints().get(0).distance(getPoints().get(1));
        double b = getPoints().get(1).distance(getPoints().get(2));
        setArea(a * b);
    }

    @Override
    public void circumference() {
        double a = getPoints().get(0).distance(getPoints().get(1));
        double b = getPoints().get(1).distance(getPoints().get(2));
        setCircumference(2 * (a + b));
    }

}
