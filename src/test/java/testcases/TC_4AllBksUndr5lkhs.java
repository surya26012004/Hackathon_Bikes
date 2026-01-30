package testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BikesPage;
import pageobjects.HomePage;
import testbase.BaseTest;

public class TC_4AllBksUndr5lkhs extends BaseTest {

    @Test
    public void verifyBikesPrice(){
        HomePage hp=new HomePage(driver);
        hp.clickNewBikes();
        hp.clickUpcmngBikes();
        BikesPage bp=new BikesPage(driver);
        if(bp.alertme != null && !bp.alertme.isEmpty()) {
            for (WebElement bikePrice : bp.bikePrice) {
                String priceText = bikePrice.getText().replaceAll("[^0-9]", ""); // remove non-numeric chars
                int price = Integer.parseInt(priceText);
                Assert.assertTrue(price < 500000,
                        "Found a bike with price >= 5 lakhs: " + bikePrice.getText());
            }
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case Failed");
        }
    }
}