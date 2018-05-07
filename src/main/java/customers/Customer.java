package customers;

import rides.Ride;

public class Customer {

    private String name;
    private int height;
    private double money;

    public Customer(String name, int height, double money) {
        this.name = name;
        this.height = height;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean meetsHeightRestriction(Ride ride) {
        if(this.height >= ride.minHeight){
            return true;
    }
    else return false;
    }

    public boolean canPayForRide(Ride ride){
        if(this.money >= ride.price){
            return true;
        }

        else return false;
    }


    public void canRide(Ride ride) {
        if ((meetsHeightRestriction(ride)) && (canPayForRide(ride))) {
            this.money -= ride.price;
        }
    }

}
