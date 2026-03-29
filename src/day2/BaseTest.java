package day2;

public class BaseTest {

    public BaseTest() {
        System.out.println("BaseTest initialized");
    }

    public void setup() {
        System.out.println("Launching browser...");
    }

    public void tearDown() {
        System.out.println("Closing browser...");
    }

}
