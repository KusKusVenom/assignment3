package assignment3_1;

public class t9 {
    private String model;
    private String color;
    private int price;

    public t9(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        t9 iphone = (t9) obj;
        return price == iphone.price &&
                model.equals(iphone.model) &&
                color.equals(iphone.color);
    }

    public static void main(String[] args) {
        t9 iphone1 = new t9("X", "Black", 999);
        t9 iphone2 = new t9("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}
