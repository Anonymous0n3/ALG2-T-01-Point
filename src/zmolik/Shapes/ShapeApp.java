package zmolik.Shapes;

import zmolik.Shapes.Shapes.Circle;
import zmolik.Shapes.Shapes.Rectangle;
import zmolik.Shapes.Shapes.Shape;
import zmolik.Shapes.Shapes.Triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeApp {
    private static String line = "----------Menu----------";
    private static String[] choices = {"Add shape", "Print shape details", "Print area of all shapes combined", "Print circumference of largest shape", "Sort by cicumference", "Sort by area", "Exit"};
    private static ArrayList<Shape> shapes = new ArrayList<Shape>();
    private static Scanner scanner = new Scanner(System.in);
    private static boolean run = true;
    public static void main(String[] args) {
        System.out.println("Welcome to the shape app");
        while (run) {
            printMenu();
            int choice = new Scanner(System.in).nextInt();
            switch(choice){
                case 1:
                    addShape();
                    break;
                case 2:
                    printShapeDetails();
                    break;
                case 3:
                    printAreaOfAllShapesCombined();
                    break;
                case 4:
                    printCircumferenceOfLargestShape();
                    break;
                case 5:
                    sortByCircumference();
                    break;
                case 6:
                    sortByArea();
                    break;
                case 7:
                    exit();
                    break;
            }
        }
        System.out.println("Goodbye");
    }

    private static void printMenu(){
        System.out.println(line);
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }

    private static void addShape(){
        System.out.println("Select shape: ");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                addRectangle();
                break;
            case 2:
                addCircle();
                break;
            case 3:
                addTriangle();
                break;
            case 4:
                addSquare();
                break;
        }
    }

    private static void addSquare() {
        shapes.add(new Rectangle(getPoints()));
    }

    private static void addTriangle() {
        shapes.add(new Triangle(getPoints()));
    }

    private static void addCircle() {
        shapes.add(new Circle(getPoints()));
    }

    private static void addRectangle() {
        shapes.add(new Rectangle(getPoints()));
    }

    private static ArrayList<Point> getPoints(){
        System.out.println("Zadejte body ve tvaru x1 y1, x2 y2, ...");
        String[] points = scanner.nextLine().split(", ");
        ArrayList<Point> result = new ArrayList<Point>();
        for (String point : points) {
            String[] coordinates = point.split(" ");
            result.add(new Point(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1])));
        }
        return result;
    }

    private static void printShapeDetails(){
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    private static void printAreaOfAllShapesCombined(){
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        System.out.println("Area of all shapes combined: " + area);
    }

    private static void printCircumferenceOfLargestShape(){
        double max = 0;
        for (Shape shape : shapes) {
            if (shape.getCircumference() > max) {
                max = shape.getCircumference();
            }
        }
        System.out.println("Circumference of largest shape: " + max);
    }

    private static void sortByCircumference(){
        shapes.sort((o1, o2) -> (int) (o1.getCircumference() - o2.getCircumference()));
    }

    private static void sortByArea(){
        shapes.sort((o1, o2) -> (int) (o1.getArea() - o2.getArea()));
    }

    private static void exit(){
        run = false;
    }


}
