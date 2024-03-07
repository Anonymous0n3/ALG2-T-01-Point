package zmolik.Polynom;

public class Polynom {
    private int[] coeficients;

    public Polynom(int[] coeficients) {
        this.coeficients = coeficients;
    }

    public Polynom(int degree) {
        coeficients = new int[degree + 1];
    }

    public int[] getCoeficients() {
        return coeficients;
    }

    public void setCoeficients(int[] coeficients) {
        this.coeficients = coeficients;
    }

    public int degree() {
        return coeficients.length - 1;
    }

    public int evaluate(int x) {
        int result = 0;
        for (int i = 0; i < coeficients.length; i++) {
            result += coeficients[i] * Math.pow(x, i);
        }
        return result;
    }

    public void print() {
        for (int i = coeficients.length - 1; i >= 0; i--) {
            if (coeficients[i] != 0) {
                if (i == 0) {
                    System.out.print(coeficients[i]);
                } else if (i == 1) {
                    System.out.print(coeficients[i] + "x + ");
                } else {
                    System.out.print(coeficients[i] + "x^" + i + " + ");
                }
            }
        }
        System.out.println();
    }

    public int getCoeficient(int i) {
        return coeficients[i];
    }

    public int horner(int x) {
        int result = coeficients[coeficients.length - 1];
        for (int i = coeficients.length - 2; i >= 0; i--) {
            result = result * x + coeficients[i];
        }
        return result;
    }

    public Polynom derivative() {
        int[] result = new int[coeficients.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = coeficients[i + 1] * (i + 1);
        }
        return new Polynom(result);
    }
}
