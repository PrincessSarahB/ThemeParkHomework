package rides;

public abstract class Ride {
    private int minHeight;
    private double price;
    private String name;

    public Ride(String name, int minHeight, double price) {
        this.name = name;
        this.minHeight = minHeight;
        this.price = price;
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
}
