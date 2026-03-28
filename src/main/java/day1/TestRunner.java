package main.java.day1;

public class TestRunner {

    public static void main(String[] args) {
        FrameworkConfig config = new FrameworkConfig();
            config.printConfig();

        DriverFactory driver = new DriverFactory();
        driver.launchBrowser("chrome");
        driver.maximizeWindow();
        driver.closeBrowser();

    }
}
