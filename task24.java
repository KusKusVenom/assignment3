package assignment3_1;

public class t5 {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        t5 building = new t5();
        building.initialize("Barbershop");
    }
}
