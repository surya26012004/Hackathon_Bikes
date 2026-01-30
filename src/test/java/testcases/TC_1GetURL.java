package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import testbase.BaseTest;

public class TC_1GetURL extends BaseTest {
    @Test
    public void verify_url(){
        String url="https://www.zigwheels.com/";
        String baseUrl= driver.getCurrentUrl();
        Assert.assertEquals(baseUrl, url);

        HomePage hp=new HomePage(driver);
        hp.clickNewBikes();
        hp.clickUpcmngBikes();
        String url1="https://www.zigwheels.com/upcoming-bike";
        String baseUrl1= driver.getCurrentUrl();
        Assert.assertNotEquals(baseUrl1, url1);
    }
}