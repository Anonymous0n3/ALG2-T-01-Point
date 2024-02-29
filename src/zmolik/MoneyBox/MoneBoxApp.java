package zmolik.MoneyBox;

public class MoneBoxApp {
    public static void main(String[] args) {
        MoneyBox moneyBoxAlice = new MoneyBox("Alice");
        MoneyBox moneyBoxBob = new MoneyBox("Bob");

        moneyBoxBob.insertCoins(2,0);
        moneyBoxBob.insertCoins(0,3);
        moneyBoxBob.insertCoins(5,10);

        System.out.println("Pokladnička Boba obsahuje " + moneyBoxBob.getSum() + " CZK.");
        System.out.println("Pokladnička Alice obsahuje " + moneyBoxAlice.getSum() + " CZK.");
        System.out.println();

        moneyBoxBob.printContent();
        System.out.println();

        moneyBoxAlice.printContent();
        System.out.println();

        canBuyHamburger(39, moneyBoxAlice);
        System.out.println();
        canBuyHamburger(39, moneyBoxBob);
        System.out.println();

        moreMoney(moneyBoxAlice, moneyBoxBob);

    }

    public static String canBuyHamburger(int price, MoneyBox moneyBox){
        if (moneyBox.moreThan(price)){
            return "Ano, " + moneyBox.getOwner() + " si může koupit hamburger.";
        } else {
            return "Ne, " + moneyBox.getOwner() + " si nemůže koupit hamburger.";
        }

    }

    public static String moreMoney(MoneyBox moneyBox1, MoneyBox moneyBox2){
        if (moneyBox1.getSum() > moneyBox2.getSum()){
            return moneyBox1.getOwner() + " má víc peněz než " + moneyBox2.getOwner() + ".";
        } else if (moneyBox1.getSum() < moneyBox2.getSum()){
            return moneyBox2.getOwner() + " má víc peněz než " + moneyBox1.getOwner() + ".";
        } else {
            return "Oba mají stejně peněz.";
        }
    }
}
