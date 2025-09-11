package tests;

import org.junit.jupiter.api.Test;

import steps.LoginSteps;


public class LoginTest extends BaseTest {
    @Test
    public void testSuccessLogin() {
        LoginSteps steps = new LoginSteps(driver);
        // TODO: add parameterized data
        steps.login("something@new.com", "dsd12343123");
        steps.assertSuccessLogin();
    }
}
