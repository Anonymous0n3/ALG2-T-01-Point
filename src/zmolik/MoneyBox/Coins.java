package zmolik.MoneyBox;

public enum Coins {
    ONE(1), TWO(2);

    private int value;

    Coins(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void toString(int value) {
        System.out.println(value + "CZK");
    }
}
