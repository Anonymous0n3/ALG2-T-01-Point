package zmolik.u012;

public class Point {
    private int x;
    private int y;


    //Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //Methods
    public double distanceFromOrigin() {
        return Math.hypot(x, y);
    }

    public double distanceFromPoint(Point p) {
        return Math.hypot(x - p.x, y - p.y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }


    //Getters and Setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
