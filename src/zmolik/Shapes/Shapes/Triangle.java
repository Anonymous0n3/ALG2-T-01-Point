package zmolik.Shapes.Shapes;

import zmolik.Shapes.Point;

import java.util.ArrayList;

public class Triangle extends Shape{

    public Triangle(ArrayList<Point> points) {
        super("Rectangle", points);
    }

    @Override
    public void area() {
        double a = getPoints().get(0).distance(getPoints().get(1));
        double b = getPoints().get(1).distance(getPoints().get(2));
        double c = getPoints().get(2).distance(getPoints().get(0));
        double s = (a + b + c) / 2;
        setArea(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    @Override
    public void circumference() {
        double a = getPoints().get(0).distance(getPoints().get(1));
        double b = getPoints().get(1).distance(getPoints().get(2));
        double c = getPoints().get(2).distance(getPoints().get(0));
        setCircumference(a + b + c);
    }
}
