package assignment3_1;

public class t4 {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;
    public t4 (String model, int year, String color) {
        this.color = color;
        this.model = model;
        this.year = year;
        System.out.println("Manufacturer: " + manufacturer + ", Model: " + model + ", Year: " + year + ", Color: " + color);

    }
    public t4 (String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Orange";
        System.out.println("Manufacturer: " + manufacturer + ", Model: " + model + ", Year: " + year + ", Color: " + color);

    }
    public t4(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Orange";
        System.out.println("Manufacturer: " + manufacturer + ", Model: " + model + ", Year: " + year + ", Color: " + color);

    }
}
