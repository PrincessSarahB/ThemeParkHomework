package rides;

public abstract class Ride {
    private int minHeight;
    private double price;

    public Ride(int minHeight, double price) {
        this.minHeight = minHeight;
        this.price = price;
    }
}
