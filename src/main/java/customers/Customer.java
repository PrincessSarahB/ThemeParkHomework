package customers;

public abstract class Customer {

    private String name;
    private int height;
    private double money;

    public Customer(String name, int height, double money) {
        this.name = name;
        this.height = height;
        this.money = money;
    }
}
