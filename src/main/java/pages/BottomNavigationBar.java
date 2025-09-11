package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class BottomNavigationBar extends BasePage {

    public BottomNavigationBar(AppiumDriver driver) {
        super(driver);
    }

    public void openLogin() {
        driver.findElement(AppiumBy.accessibilityId("Login")).click();
    }
}
