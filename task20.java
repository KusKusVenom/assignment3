package assignment3_1;


public class t2 {
    public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Skyscraper is built. The number of floors - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Skyscraper is built. Developer - ";

    public t2() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public t2(int floors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    public t2(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        t2 skyscraper = new t2();
        t2 skyscraperTower = new t2(50);
        t2 skyscraperSkyline = new t2("JavaRushDevelopment");
    }
}
