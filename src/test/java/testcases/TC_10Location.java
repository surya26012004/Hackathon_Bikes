package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.CarsPage;
import testbase.BaseTest;

public class TC_10Location extends BaseTest {
    @Test
    public void locationCheck(){
        CarsPage cp=new CarsPage(driver);
        boolean loc=cp.chennai.isDisplayed();
        Assert.assertTrue(loc);
    }
}