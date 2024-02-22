package zmolik.Fractions;

import java.util.ArrayList;
import java.util.Scanner;

public class FractionApp {
    private static FractionTools ft = new FractionTools();
    private static FractionMenu fm = new FractionMenu();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            fm.printFirstOne();
        while (true) {
            fm.printMenu();
            String input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            if (input.contains("+")) {
                String[] fractionTemp = input.split("\\+");
                Fraction a = ft.getFractionFromDouble(fractionTemp[0].trim());
                Fraction b = ft.getFractionFromDouble(fractionTemp[1].trim());
                System.out.println(ft.add(a, b));
            } else if (input.contains("-")) {
                String[] fractionTemp = input.split("-");
                Fraction a = ft.getFractionFromDouble(fractionTemp[0].trim());
                Fraction b = ft.getFractionFromDouble(fractionTemp[1].trim());
                System.out.println(ft.subtract(a, b));
            } else if (input.contains("*")) {
                String[] fractionTemp = input.split("\\*");
                Fraction a = ft.getFractionFromDouble(fractionTemp[0].trim());
                Fraction b = ft.getFractionFromDouble(fractionTemp[1].trim());
                System.out.println(ft.multiply(a, b));
            } else if (input.contains(":")) {
                String[] fractionTemp = input.split(":");
                Fraction a = ft.getFractionFromDouble(fractionTemp[0].trim());
                Fraction b = ft.getFractionFromDouble(fractionTemp[1].trim());
                System.out.println(ft.divide(a, b));
            } else
                System.out.println(ft.getFractionFromDouble(input.trim()));
            }
            fm.printThanks();
        }
    }

