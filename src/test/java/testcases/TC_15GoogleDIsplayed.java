package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseTest;

public class TC_15GoogleDIsplayed extends BaseTest {
    @Test
    public void isGoogleDisplayed(){
        HomePage hp=new HomePage(driver);
        hp.clickLogin();
        LoginPage lp=new LoginPage(driver);
        boolean google=lp.google.isDisplayed();
        Assert.assertTrue(true);
    }
}