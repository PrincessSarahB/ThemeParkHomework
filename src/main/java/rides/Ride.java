package rides;

import customers.Customer;

import java.util.ArrayList;

public abstract class Ride {
    public int minHeight;
    public double price;
    private String name;
    public int capacity;
    private ArrayList<Customer> customers;

    public Ride(String name, int minHeight, double price, int capacity) {
        this.name = name;
        this.minHeight = minHeight;
        this.price = price;
        this.capacity = capacity;
        this.customers = new ArrayList<>();
    }

    public int getMinHeight() {
        return minHeight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

//    public boolean customerCanRide(){
//        if()
//    }



    }

