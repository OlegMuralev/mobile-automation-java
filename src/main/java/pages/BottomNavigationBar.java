package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class BottomNavigationBar extends BasePage {

    public BottomNavigationBar(AppiumDriver driver) {
        super(driver);
    }

    private final WebElement loginLabel = driver.findElement(AppiumBy.accessibilityId("Login"));

    public void clickLoginLabel() {
        loginLabel.click();
    }
}
