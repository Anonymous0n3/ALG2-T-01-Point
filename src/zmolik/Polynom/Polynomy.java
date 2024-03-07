package zmolik.Polynom;

public class Polynomy {
    //Sčítání libovolného počtu polynomů
    public static Polynom add(Polynom... polynoms) {
        int maxDegree = 0;
        for (Polynom polynom : polynoms) {
            if (polynom.degree() > maxDegree) {
                maxDegree = polynom.degree();
            }
        }
        int[] resultCoeficients = new int[maxDegree + 1];
        for (Polynom polynom : polynoms) {
            for (int i = 0; i < polynom.getCoeficients().length; i++) {
                resultCoeficients[i] += polynom.getCoeficient(i);
            }
        }
        return new Polynom(resultCoeficients);
    }
    //Násobení polynomů
    public static Polynom multiply(Polynom p1, Polynom p2) {
        int[] resultCoeficients = new int[p1.degree() + p2.degree() + 1];
        for (int i = 0; i < p1.getCoeficients().length; i++) {
            for (int j = 0; j < p2.getCoeficients().length; j++) {
                resultCoeficients[i + j] += p1.getCoeficient(i) * p2.getCoeficient(j);
            }
        }
        return new Polynom(resultCoeficients);
    }

}
