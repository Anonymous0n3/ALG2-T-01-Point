package zmolik.Bus;

import java.util.Scanner;

public class BusApp {
    public static void main(String[] args) {
        Bus line15 = new Bus("DPMLJ", 15, 41);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            line15.currentStatus();
            System.out.println("Stop " + (i + 1));
            System.out.println("Enter disembarking and embarking passanger");
            line15.removePassengers(sc.nextInt());
            line15.addPassengers(sc.nextInt());
        }
        System.out.println("Final destination");
        line15.removeAllPassengers();
    }
}
