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
        ArrayList<Customer> copy = new ArrayList<>(customers);
        return copy;
    }

    public int countCustomersOnRide(){

        return this.customers.size();
    }

    public boolean customerCanRide(Customer customer){
        if((customer.getMoney() >= this.price) && (customer.getHeight() >= this.minHeight) && (countCustomersOnRide() < this.capacity)){
            return true;
        }
        else return false;
    }

    public void addCustomerToRide(Customer customer){
        if(customerCanRide(customer)){
            customer.money -= this.price;
            this.customers.add(customer);
        }
    }


    }

