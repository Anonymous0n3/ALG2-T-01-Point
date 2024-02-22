package zmolik.Fractions;

import java.util.Scanner;

public class FractionTools {
    public Fraction add(Fraction a, Fraction b) {
        int newNumerator = a.getNumerator() * b.getDenominator() + b.getNumerator() * a.getDenominator();
        int newDenominator = a.getDenominator() * b.getDenominator();
        return simplify(new Fraction(newNumerator, newDenominator));
    }

    public Fraction subtract(Fraction a, Fraction b) {
        int newNumerator = a.getNumerator() * b.getDenominator() - b.getNumerator() * a.getDenominator();
        int newDenominator = a.getDenominator() * b.getDenominator();
        return simplify(new Fraction(newNumerator, newDenominator));
    }

    public Fraction multiply(Fraction a, Fraction b) {
        int newNumerator = a.getNumerator() * b.getNumerator();
        int newDenominator = a.getDenominator() * b.getDenominator();
        return simplify(new Fraction(newNumerator, newDenominator));
    }

    public Fraction divide(Fraction a, Fraction b) {
        int newNumerator = a.getNumerator() * b.getDenominator();
        int newDenominator = a.getDenominator() * b.getNumerator();
        return simplify(new Fraction(newNumerator, newDenominator));
    }

    public Fraction simplify(Fraction a) {
        int gcd = gcd(a.getNumerator(), a.getDenominator());
        return new Fraction(a.getNumerator() / gcd, a.getDenominator() / gcd);
    }

    //Get Fraction from String in format of a b, a/b, or a
    public Fraction getFractionFromDouble(String input) {
        if (input.contains(" ")) {
            String[] fractionTemp = input.split(" ");
            int whole = Integer.parseInt(fractionTemp[0]);
            String[] fraction = fractionTemp[1].split("/");
            int numerator = Integer.parseInt(fraction[0]);
            int denominator = Integer.parseInt(fraction[1]);
            return new Fraction(whole * denominator + numerator, denominator);
        } else if (input.contains("/")) {
            String[] fraction = input.split("/");
            int numerator = Integer.parseInt(fraction[0]);
            int denominator = Integer.parseInt(fraction[1]);
            return simplify(new Fraction(numerator, denominator));
        } else {
            return new Fraction(Integer.parseInt(input), 1);

        }
    }

    //Private Methods
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
