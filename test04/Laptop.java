package test04;

public class Laptop extends Computer {
    private double inches;

    public Laptop(String brand, String model, double price, double inches) {
        super(brand, model, price);
        this.inches = inches;
    }

    @Override
    public void printInfo() {
        System.out.printf("Brand: %s, Model: %s, Price: %.2f, Inches: %.2f%n", brand, model, price, inches);
    }
}
