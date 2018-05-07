package customers;

import rides.Ride;

public class Customer {

    private String name;
    private int height;
    public double money;
    private int age;

    public Customer(String name, int height, double money, int age) {
        this.name = name;
        this.height = height;
        this.money = money;
        this.age = age;
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

    public int getAge(){
        return age;
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




}
