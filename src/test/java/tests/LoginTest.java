package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BottomNavigationBar;
import pages.LoginPage;
import steps.LoginSteps;

public class LoginTest extends BaseTest {

    private LoginSteps steps;


    @BeforeTest
    public void setUp() {
        super.setUp();
        BottomNavigationBar bottom = new BottomNavigationBar(driver);
        bottom.clickLoginLabel();
        new LoginPage(driver);
    }

    @Test
    public void testSuccessLogin() {
        steps.setEmailAndPassword("dskskd", "dsd");

    }
}
