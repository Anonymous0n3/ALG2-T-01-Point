package zmolik.Fractions;

public class FractionMenu {
    private String firstLine = "Welcome to the Fraction Calculator!";
    private String secondLine = "Enter operation:";
    private String line = "------------------------";
    private String thanks = "Thank you for using the Fraction Calculator!";

    public void printFirstOne() {
        System.out.println(firstLine);
    }

    public void printThanks() {
        System.out.println(thanks);
    }
    public void printMenu() {
        System.out.println(line);
        System.out.println(secondLine);
    }
}
