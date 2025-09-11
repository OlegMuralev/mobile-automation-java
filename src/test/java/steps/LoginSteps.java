package steps;

import alerts.SuccessLoginTitle;
import io.appium.java_client.AppiumDriver;
import pages.BottomNavigationBar;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.assertTrue;



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

    public void assertSuccessLogin() {
        SuccessLoginTitle title = new SuccessLoginTitle(driver);
        assertTrue(title.getSuccessLoginTitle().isDisplayed(), "Success login title is not displayed!");
    }
}
