package zmolik.MoneyBox;

import java.util.ArrayList;

public class MoneyBox {

    private String owner;
    private ArrayList<Coins> coins = new ArrayList<Coins>();

    public MoneyBox(String owner){
        this.owner = owner;
    }

    public void addCoin(Coins coin){
        coins.add(coin);
    }

    public ArrayList<Coins> getCoins(){
        return coins;
    }

    public void removeAllCoins(){
        coins.clear();
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public int getSum(){
        int sum = 0;
        for (Coins coin : coins){
            sum += coin.getValue();
        }
        return sum;
    }

    public void printContent(){
        System.out.println("Pokladnička uživatele " + owner + " obsahuje:");
        System.out.println(owner + " má " + getSum() + " CZK v těchto mincích:");
        System.out.println(numberOfONECoins() + " jednokorunových mincí a " + numberOfTWOCoins() + " dvoukorunových mincí.");
    }

    public int numberOfONECoins(){
        int count = 0;
        for (Coins coin : coins){
            if (coin == Coins.ONE){
                count++;
            }
        }
        return count;
    }

    public int numberOfTWOCoins(){
        int count = 0;
        for (Coins coin : coins){
            if (coin == Coins.TWO){
                count++;
            }
        }
        return count;
    }

    public void insertCoins(int ones, int twos){
        for (int i = 0; i < ones; i++) {
            addCoin(Coins.ONE);
        }
        for (int i = 0; i < twos; i++) {
            addCoin(Coins.TWO);
        }
    }

    public boolean moreThan(int value){
        return getSum() > value;
    }
}
