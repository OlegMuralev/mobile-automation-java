package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    private final WebElement emailField = driver.findElement(AppiumBy.accessibilityId("input-email"));
    private final WebElement passwordField = driver.findElement(AppiumBy.accessibilityId("input-password"));

    private WebElement getEmailField() {
        return driver.findElement(AppiumBy.accessibilityId("input-email"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(AppiumBy.accessibilityId("input-password"));
    }

    public void fillEmailField(String email) {
        emailField.click();
        emailField.sendKeys(email);
    }

    public void fillPasswordField(String password) {
        passwordField.click();
        passwordField.sendKeys(password);
    }
}
