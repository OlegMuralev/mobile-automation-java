import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

import java.net.MalformedURLException;

public class LaunchApp {
    public static void main(String[] args) throws MalformedURLException {
       AppiumDriver driver = DriverFactory.getDriver();

        WebElement loginLabel = driver.findElement(AppiumBy.accessibilityId("Login"));
        loginLabel.click();

    }
}
