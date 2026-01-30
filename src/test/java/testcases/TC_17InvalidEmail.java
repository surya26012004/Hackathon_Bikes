package testcases;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseTest;

public class TC_17InvalidEmail extends BaseTest {
    @Test
    public void enterInvalidEmail(){
        HomePage hp=new HomePage(driver);
        hp.clickLogin();
        LoginPage lp=new LoginPage(driver);
        lp.clickGoogle();
        lp.enterEmail("sri@gmail.com");
        lp.clickNext();
    }
}