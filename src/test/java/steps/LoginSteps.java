package steps;

import io.appium.java_client.AppiumDriver;
import pages.BottomNavigationBar;
import pages.LoginPage;


public class LoginSteps {
    private final AppiumDriver driver;

    public LoginSteps(AppiumDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        BottomNavigationBar bottom = new BottomNavigationBar(driver);
        bottom.openLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials(email, password);
    }
}
