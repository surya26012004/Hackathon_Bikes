package testcases;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseTest;

public class TC_16VEmailInPwd extends BaseTest {
    @Test
    public void ValidAndInvalid(){
        HomePage hp=new HomePage(driver);
        hp.clickLogin();
        LoginPage lp=new LoginPage(driver);
        lp.clickGoogle();
        lp.enterEmail("srilaxmi1104@gmail.com");
        lp.clickNext();
        lp.enterPwd("srilaxmi");
    }
}