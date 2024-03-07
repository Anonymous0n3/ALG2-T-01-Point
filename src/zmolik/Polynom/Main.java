package zmolik.Polynom;

public class Main {
    public static void main(String[] args) {
        Polynom p1 = new Polynom(new int[]{1, 2, 3});
        Polynom p2 = new Polynom(new int[]{3, 2, 1});
        Polynom p3 = new Polynom(new int[]{1, 2, 3, 4});
        Polynom p4 = new Polynom(new int[]{4, 3, 2, 1});
        Polynom finalPolynom = Polynomy.add(p1, p2, p3, p4);
        finalPolynom.print();
        System.out.println(finalPolynom.horner(1));
    }
}
