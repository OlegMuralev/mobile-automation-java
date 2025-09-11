package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {
    private final By emailField = AppiumBy.accessibilityId("input-email");
    private final By passwordField = AppiumBy.accessibilityId("input-password");
    private final By loginButton = AppiumBy.accessibilityId("button-LOGIN");

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    private WebElement getEmailField() {
        return driver.findElement(emailField);
    }

    private WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    private WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public void loginWithCredentials(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }
}
