package tests;

import org.junit.jupiter.api.Test;

import steps.LoginSteps;


public class LoginTest extends BaseTest {
    @Test
    public void testSuccessLogin() {
        LoginSteps steps = new LoginSteps(driver);
        steps.login("dskskd", "dsd");
    }
}
