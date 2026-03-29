package day2;

public class LoginPage implements WebActions {

    @Override
    public void click() {
        System.out.println("Login Page: Click action performed");
    }

    @Override
    public void type() {
        System.out.println("Login Page: Typing action performed");
    }
}
