package practice.pr1;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println(brand + " " + model + " завёл двигатель.");
    }

    public void stopEngine() {
        System.out.println(brand + " " + model + " заглушил двигатель.");
    }

    public String getInfo() {
        return brand + " " + model + " (" + year + ")";
    }
}
