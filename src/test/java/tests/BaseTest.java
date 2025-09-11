package tests;


import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import utils.DriverFactory;

public class BaseTest {

    protected static AppiumDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = DriverFactory.getDriver();
    }

    @AfterAll
    public static void tearDown() {
        DriverFactory.quitDriver();
    }

}
