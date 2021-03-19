package test06;

public class Car implements Comparable {
    //марка, година на производство и цена
    private String brand;
    private int year;
    private double price;

    public Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, Year: %d, Price: %.2f", brand, year, price);
    }

    @Override
    public int compareTo(Object car) {

        Car other = (Car) car;
        if (this.price > other.price) {
            return -1;
        } else if (this.price < other.price) {
            return 1;
        }
        return 0;
    }


}
