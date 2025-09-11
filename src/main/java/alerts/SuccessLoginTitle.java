package alerts;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class SuccessLoginTitle extends BasePage {
    private final By successLoginTitle = AppiumBy.id("android:id/alertTitle");

    public SuccessLoginTitle(AppiumDriver driver) {
        super(driver);
    }
    public WebElement getSuccessLoginTitle() {
        return driver.findElement(successLoginTitle);
    }
}
