import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LaunchApp {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "uiautomator2");
        caps.setCapability("appium:deviceName", "emulator-5554");
        caps.setCapability("appium:appPackage", "com.wdiodemoapp");
        caps.setCapability("appium:appActivity", "com.wdiodemoapp.MainActivity");

        AppiumDriver driver =
                new AndroidDriver(new URL("http://127.0.0.1:4725"), caps);

        System.out.println("App launched!");
        driver.quit();
    }
}
