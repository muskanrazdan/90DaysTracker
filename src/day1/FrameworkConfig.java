package day1;

public class FrameworkConfig {
    String browser = "chrome";
    String env = "qa";
    int timeout = 30;
    String baseUrl = "https://api.test.com";
    boolean headless = true;

    public void printConfig()
    {
        System.out.println(browser);
        System.out.println(env);
        System.out.println(timeout);
        System.out.println(baseUrl);
        System.out.println(headless);
    }
}
