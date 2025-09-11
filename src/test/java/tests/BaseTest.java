package tests;


import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.DriverFactory;

public class BaseTest {

    protected AppiumDriver driver;

    @BeforeTest
    public void setUp() {
        driver = DriverFactory.getDriver();
    }

    @AfterTest
    public void tearDown() {
        DriverFactory.quitDriver();
    }

}
