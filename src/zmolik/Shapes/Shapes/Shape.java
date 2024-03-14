package zmolik.Shapes.Shapes;

import zmolik.Shapes.Point;
import java.util.ArrayList;

public abstract class Shape {
    private ArrayList<Point> points;
    private String name;
    private double area;
    private double circumference;

    public Shape(String name, ArrayList<Point> points) {
        this.name = name;
        this.points = points;
    }

    //Počítání obsahu
    public abstract void area();

    //Počítání obvodu
    public abstract void circumference();

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
}
