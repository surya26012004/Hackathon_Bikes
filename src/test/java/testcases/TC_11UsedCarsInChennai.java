package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.CarsPage;
import pageobjects.HomePage;
import testbase.BaseTest;

public class TC_11UsedCarsInChennai extends BaseTest {
    @Test
    public void verifyusedCarsInChennai(){
        HomePage hp=new HomePage(driver);
        hp.clickMore();
        hp.clickUsedCars();
        CarsPage cp=new CarsPage(driver);
        cp.setChennai();
        boolean usedCars=cp.usedCarsInChennai.isDisplayed();
        Assert.assertTrue(usedCars);
    }
}