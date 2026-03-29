package day2;

public class TestRunner {

        public static void main(String[] args) {

            // Inheritance
            LoginTest test = new LoginTest();
            test.setup();
            test.testLogin();
            test.tearDown();

            // Abstraction
            ChromeBrowser browser = new ChromeBrowser();
            browser.launchBrowser();

            // Interface
            LoginPage page = new LoginPage();
            page.click();
            page.type();
        }

}
