package zmolik.NShape;

import java.util.ArrayList;

public class NShape {
    private ArrayList<Point> points = new ArrayList<Point>();

    public NShape(Point... points) {
        for (Point point : points) {
            this.points.add(point);
        }
    }

    // Circumference of NShape
    public double circumference() {
        double circumference = 0;
        for (int i = 0; i < points.size(); i++) {
            if (i == points.size() - 1) {
                circumference += Math.sqrt(Math.pow(points.get(i).getX() - points.get(0).getX(), 2) + Math.pow(points.get(i).getY() - points.get(0).getY(), 2));
            } else {
                circumference += Math.sqrt(Math.pow(points.get(i).getX() - points.get(i + 1).getX(), 2) + Math.pow(points.get(i).getY() - points.get(i + 1).getY(), 2));
            }
        }
        return circumference;
    }

    // Area of NShape
    public double area() {
        double area = 0;
        for (int i = 0; i < points.size(); i++) {
            if (i == points.size() - 1) {
                area += points.get(i).getX() * points.get(0).getY() - points.get(i).getY() * points.get(0).getX();
            } else {
                area += points.get(i).getX() * points.get(i + 1).getY() - points.get(i).getY() * points.get(i + 1).getX();
            }
        }
        return Math.abs(area) / 2;
    }

    //Get Point with largest distance to origin
    public Point maxDistance() {
        Point max = points.get(0);
        for (Point point : points) {
            if (point.distance() > max.distance()) {
                max = point;
            }
        }
        return max;
    }

    //Get Point with smallest distance to origin
    public Point minDistance() {
        Point min = points.get(0);
        for (Point point : points) {
            if (point.distance() < min.distance()) {
                min = point;
            }
        }
        return min;
    }

    //Get weighted center of gravity
    public Point centerOfGravity() {
        int x = 0;
        int y = 0;
        int weight = 0;
        for (Point point : points) {
            x += point.getX() * point.getWeight();
            y += point.getY() * point.getWeight();
            weight += point.getWeight();
        }
        return new Point(x / weight, y / weight, weight);
    }
    

}
