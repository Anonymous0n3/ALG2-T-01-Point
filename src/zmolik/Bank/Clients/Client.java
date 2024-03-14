package zmolik.Bank.Clients;

import zmolik.Bank.Account;

import java.util.ArrayList;

public abstract class Client {
    protected String name;
    private ArrayList<Account> accounts;

    public Client(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public double totalSum(){
        double sum = 0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        return sum;
    }

    public abstract String fullAdress();

    public String getName() {
        return name;
    }


}
