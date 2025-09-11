package tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testOpenLoginScreen() {
        WebElement loginLabel = driver.findElement(AppiumBy.accessibilityId("Login"));
        loginLabel.click();
    }
}
