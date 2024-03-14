package zmolik.Bank;

import zmolik.Bank.Clients.Client;
import zmolik.Bank.Clients.Person;

import java.util.ArrayList;
import java.util.Comparator;

public class BankApp {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        Client pekar = new Person("Pekar");
        Client skoda = new Person("Skoda");
        Client svecova = new Person("Svecova");

        pekar.addAccount(new Account(generateBankAccountNumber(), 1000));
        pekar.addAccount(new Account(generateBankAccountNumber(), 500));
        svecova.addAccount(new Account(generateBankAccountNumber(), 1200));
        skoda.addAccount(new Account(generateBankAccountNumber(), 120));

        clients.add(pekar);
        clients.add(skoda);
        clients.add(svecova);

        printClientsWithTotalMoney(clients);
        sortAndPrintClientsBySumOnAccounts(clients);
        printClientsByName(clients);
    }

    private static int generateBankAccountNumber(){
        return (int) (Math.random() * 1000000000);
    }

    private static void sortAndPrintClientsBySumOnAccounts(ArrayList<Client> clients){
        clients.sort((c1, c2) -> (int) (c2.totalSum() - c1.totalSum()));
        for (Client client : clients) {
            System.out.println(client.fullAdress() + " " + client.totalSum());
        }
    }

    private static void printClientsWithTotalMoney(ArrayList<Client> clients){
        for (Client client : clients) {
            System.out.println(client.fullAdress() + " " + client.totalSum());
        }
    }

    private static void printClientsByName(ArrayList<Client> clients){
        clients.sort(Comparator.comparing(Client::getName));
        for (Client client : clients) {
            System.out.println(client.fullAdress());
        }
    }
}
