package zmolik.NShape;

import java.util.ArrayList;
import java.util.Scanner;

public class SomeApp {
    private static ArrayList<Point> points = new ArrayList<Point>();

    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        do{
            PrintMenu();
            Choice(sc.nextInt());
        }while (run);
    }

    //Menu
    public static void PrintMenu(){
        System.out.println("1. Add point");
        System.out.println("2. Corelation coefficient");
        System.out.println("3. Coeficients a, b");
        System.out.println("4. Approximation line");
    }
    //Choice
    public static void Choice(int choice){
        switch (choice){
            case 1:
                AddPoint();
                break;
            case 2:
                CorelationCoefficient();
                break;
            case 3:
                CoeficientsAB();
                break;
            case 4:
                ApproximationLine();
                break;
        }
    }
    //Add point
    public static void AddPoint(){
        System.out.println("Enter x and y");
        int x = 0;
        int y = 0;
        points.add(new Point(x, y));
    }
    //Corelation coefficient
    public static void CorelationCoefficient(){
double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumX2 = 0;
        double sumY2 = 0;
        for (Point point : points){
            sumX += point.getX();
            sumY += point.getY();
            sumXY += point.getX() * point.getY();
            sumX2 += Math.pow(point.getX(), 2);
            sumY2 += Math.pow(point.getY(), 2);
        }
        double n = points.size();
        double r = (n * sumXY - sumX * sumY) / (Math.sqrt((n * sumX2 - Math.pow(sumX, 2)) * (n * sumY2 - Math.pow(sumY, 2))));
        System.out.println("Corelation coefficient: " + r);
    }
    //Coeficients a, b
    public static void CoeficientsAB(){
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumX2 = 0;
        for (Point point : points){
            sumX += point.getX();
            sumY += point.getY();
            sumXY += point.getX() * point.getY();
            sumX2 += Math.pow(point.getX(), 2);
        }
        double n = points.size();
        double a = (n * sumXY - sumX * sumY) / (n * sumX2 - Math.pow(sumX, 2));
        double b = (sumY - a * sumX) / n;
        System.out.println("Coeficients a, b: " + a + ", " + b);
    }
    //Approximation line
    public static void ApproximationLine(){
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumX2 = 0;
        for (Point point : points){
            sumX += point.getX();
            sumY += point.getY();
            sumXY += point.getX() * point.getY();
            sumX2 += Math.pow(point.getX(), 2);
        }
        double n = points.size();
        double a = (n * sumXY - sumX * sumY) / (n * sumX2 - Math.pow(sumX, 2));
        double b = (sumY - a * sumX) / n;
        System.out.println("Approximation line: y = " + a + "x + " + b);
    }
}
