package assignment3_1;

public class t10 {
    private String model;
    private int year;

    public t10(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return model.hashCode() * 31 + year;
    }

    public static void main(String[] args) {
        t10 lamborghini = new t10("Lamborghini", 2020);
        t10 ferrari = new t10("Ferrari", 2020);
        System.out.println(lamborghini.hashCode() == new t10("Lamborghini", 2020).hashCode());
        System.out.println(ferrari.hashCode() == new t10("Ferrari", 2020).hashCode());
    }
}
