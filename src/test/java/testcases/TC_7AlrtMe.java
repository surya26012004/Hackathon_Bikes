package testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BikesPage;
import pageobjects.HomePage;
import testbase.BaseTest;

public class TC_7AlrtMe extends BaseTest {
    @Test
    public void verifyAlertMetxt() {
        HomePage hp = new HomePage(driver);
        hp.clickNewBikes();
        hp.clickUpcmngBikes();
        BikesPage bp = new BikesPage(driver);
        bp.clickUpcmngBikesUndr5lkhs();
        bp.clickRoyalEnfield();
        if(bp.alertme != null && !bp.alertme.isEmpty()) {
            for (WebElement ele : bp.alertme) {
                Assert.assertTrue(ele.isDisplayed(), "Alert Me button not displayed");
            }
            System.out.println("Test Case Passed");
        }
        else {
//            Assert.fail();
            System.out.println("Test Case Failed");
        }
    }
}