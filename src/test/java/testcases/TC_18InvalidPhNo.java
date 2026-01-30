package testcases;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseTest;

public class TC_18InvalidPhNo extends BaseTest {
    @Test
    public void enterPhoneNum(){
        HomePage hp=new HomePage(driver);
        hp.clickLogin();
        LoginPage lp=new LoginPage(driver);
        lp.clickGoogle();
        lp.enterEmail("9876543219");
        lp.clickNext();
    }
}