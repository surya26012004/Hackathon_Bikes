package testcases;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseTest;

public class TC_20EmptyEmail extends BaseTest {
    HomePage hp;
    LoginPage lp;
    @Test
    public void m4(){
        hp=new HomePage(driver);
        hp.clickLogin();
        lp=new LoginPage(driver);
        lp.clickGoogle();
        lp.enterEmail("");
        lp.clickNext();
    }
}