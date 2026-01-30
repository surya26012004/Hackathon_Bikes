package testcases;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseTest;

public class TC_19VPhnoInvalidPwd extends BaseTest {
    @Test
    public void enterVPhonoInPwd(){
        HomePage hp=new HomePage(driver);
        hp.clickLogin();
        LoginPage lp=new LoginPage(driver);
        lp.clickGoogle();
        lp.enterEmail("9381504154");
        lp.enterPwd("sri");
        lp.clickNext();
    }
}