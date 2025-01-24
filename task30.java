package assignment3_1;
public class t12 {
    private static boolean hasEggs = true;

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Bought 10 loaves");
        } else {
            System.out.println("Bought 1 loaf");
        }
    }

    public static void main(String[] args) {
        makePurchases(false);
    }
}
