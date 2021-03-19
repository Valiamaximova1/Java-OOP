package test04;

public class PC extends Computer{
    private String color;

    public PC(String brand, String model, double price, String color) {
        super(brand, model, price);
        this.color = color;
    }

    @Override
    public void printInfo() {
        System.out.printf("Brand: %s, Model: %s, Price: %.2f, Color: %s%n", brand, model, price, color);
    }
}
