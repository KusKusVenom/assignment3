package assignment3_1;

public class t3 {
    private int floorsCount;
    private String developer;

    public t3() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
        System.out.println("Skyscraper is built. Developer - " + developer + ". Number of floors - " + floorsCount);

    }
    public t3(int floorsCount, String developer) {
            this.developer = developer;
            this.floorsCount = floorsCount;
            System.out.println("Skyscraper is built. Developer - " + developer + ". Number of floors - " + floorsCount);

    }
    public static void main(String [] args){
        t3 Skyscraper = new t3();
        t3 SkyscraperUnknown  = new t3(50, "Unknown");
    }
}
