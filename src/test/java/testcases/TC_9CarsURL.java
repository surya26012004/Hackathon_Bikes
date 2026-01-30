package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import testbase.BaseTest;

public class TC_9CarsURL extends BaseTest {
    @Test
    public void verify_carsUrl(){
        HomePage hp=new HomePage(driver);
        hp.clickMore();
        hp.clickUsedCars();

        String url="https://www.zigwheels.com/used-car";
        String baseUrl= driver.getCurrentUrl();
        Assert.assertEquals(baseUrl, url);

        String url1="https://www.zigwheels.com/used-ca";
        String baseUrl1= driver.getCurrentUrl();
        Assert.assertNotEquals(baseUrl1, url1);

    }
}