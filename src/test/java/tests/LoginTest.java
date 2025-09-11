package tests;

import org.testng.annotations.Test;
import steps.LoginSteps;


public class LoginTest extends BaseTest {

    @Test
    public void testSuccessLogin() {
        LoginSteps steps = new LoginSteps(driver);
        steps.login("dskskd", "dsd");
    }
}
