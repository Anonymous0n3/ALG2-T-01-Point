package zmolik.Bus;

public class Bus {
    private String owner;
    private int num;
    private int capacity;
    private int currentPassengers = 0;

    public Bus(String owner, int num, int capacity){
        this.owner = owner;
        this.num = num;
        this.capacity = capacity;
    }

    public Bus(){
        this.owner = "unknown";
        this.num = 0;
        this.capacity = 40;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int getCapacity(){
        return capacity;
    }

    public void currentStatus(){
        System.out.println("Bus " + num + " is owned by " + owner + ", has " + getCapacity() + " seats and currently has " + currentPassengers + " passengers.");
    }

    public void addPassengers(int passengers){
        if (currentPassengers + passengers <= capacity){
            currentPassengers += passengers;
        } else {
            System.out.println("Bus " + num + " is full.");
            System.out.println(currentPassengers + passengers - capacity + " passengers are not allowed to enter the bus.");
            currentPassengers = capacity;
        }
    }

    public void removePassengers(int passengers) {
        if (currentPassengers - passengers >= 0) {
            currentPassengers -= passengers;
        } else {
            currentPassengers = 0;
        }
    }

    public void removeAllPassengers(){
        currentPassengers = 0;
        System.out.println("Bus " + num + " has no passengers.");
    }

}
