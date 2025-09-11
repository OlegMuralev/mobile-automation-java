package steps;

import org.testng.annotations.BeforeTest;
import pages.BottomNavigationBar;
import pages.LoginPage;
import tests.BaseTest;

public class LoginSteps extends BaseTest {


    private final LoginPage loginPage = new LoginPage(driver);


    @BeforeTest
    public void setUp(){
        super.setUp();
        BottomNavigationBar bottom = new BottomNavigationBar(driver);
        bottom.clickLoginLabel();
    }

    public void setEmailAndPassword(String email, String password) {
        loginPage.fillEmailField(email);
        loginPage.fillPasswordField(password);
    }

}
