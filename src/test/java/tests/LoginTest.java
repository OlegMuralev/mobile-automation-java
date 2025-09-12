package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
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
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 0)
    void testSuccessLoginWithCsvFile(String email, String password) {
        LoginSteps steps = new LoginSteps(driver);
        steps.login(email, password);
        steps.assertSuccessLogin();
    }
}
