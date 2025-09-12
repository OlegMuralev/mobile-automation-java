package tests;

import data.UserEmails;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import steps.LoginSteps;


public class LoginTest extends BaseTest {
    @ParameterizedTest
    @ValueSource(strings = {"something@new.com", "test@domain.com", "user@mail.com"})
    public void testSuccessLoginWithValueSource(String email) {
        LoginSteps steps = new LoginSteps(driver);
        steps.login(email, "dsd12343123");
        steps.assertSuccessLogin();
    }

    @ParameterizedTest
    @CsvSource({
            "something@new.com, dsd12343123",
            "test@domain.com, pass12345678",
            "user@mail.com, qwerty12345678"
    })
    public void testSuccessLoginWithCsvSource(String email, String password){
        LoginSteps steps = new LoginSteps(driver);
        steps.login(email, password);
        steps.assertSuccessLogin();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv")
    void testSuccessLoginWithCsvFile(String email, String password) {
        LoginSteps steps = new LoginSteps(driver);
        steps.login(email, password);
        steps.assertSuccessLogin();
    }

    @ParameterizedTest
    @MethodSource("data.LoginData#loginData")
    void testSuccessLoginWithMethodSource(String email, String password) {
        LoginSteps steps = new LoginSteps(driver);
        steps.login(email, password);
        steps.assertSuccessLogin();
    }

    @ParameterizedTest
    @EnumSource(UserEmails.class)
    void testLoginWithEnum(UserEmails user) {
        LoginSteps steps = new LoginSteps(driver);
        steps.login(user.getEmail(), "dsd12343123");
        steps.assertSuccessLogin();
    }
}
