package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BottomNavigationBar;
import pages.LoginPage;
import steps.LoginSteps;

import java.time.Duration;

public class LoginTest extends BaseTest {


    @Test
    public void testSuccessLogin() {

        LoginSteps steps = new LoginSteps(driver);
        steps.login("dskskd", "dsd");
    }
}
