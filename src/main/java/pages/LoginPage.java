package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {
    private final By emailField = AppiumBy.accessibilityId("input-email");
    private final By passwordField = AppiumBy.accessibilityId("input-password");


    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    private WebElement getEmailField() {
        return waitForElement(emailField);
    }

    private WebElement getPasswordField() {
        return waitForElement(passwordField);
    }

    private WebElement getLoginButton() {
        return driver.findElement(AppiumBy.accessibilityId("button-LOGIN"));
    }

    public void loginWithCredentials(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }
}
