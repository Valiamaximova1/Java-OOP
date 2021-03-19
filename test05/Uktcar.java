package test05;

public class Uktcar implements IStudent{
    private String name;

    public Uktcar(String name) {
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.printf("%s is sleeping%n", name);
    }

    @Override
    public void eat() {
        System.out.printf("%s is eating%n", name);
    }

    @Override
    public void walk() {
        System.out.printf("%s is walking%n", name);
    }

    @Override
    public void study() {
        System.out.printf("%s is studying%n", name);
    }
}
