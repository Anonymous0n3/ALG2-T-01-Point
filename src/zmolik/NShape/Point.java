package zmolik.NShape;

public class Point {
    private int x;
    private int y;
    private int weight;

    public Point(int x, int y, int weight) {
        this.x = x;
        this.y = y;
        this.weight = weight;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.weight = 1;
    }

    // Distance between two points
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
    }

    //Distance between two points with weight
    public double distanceWeight(Point p) {
        return Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2) + Math.pow(p.getWeight() - weight, 2));
    }

    //Distance to origin
    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + ", weight=" + weight + '}';
    }
}
