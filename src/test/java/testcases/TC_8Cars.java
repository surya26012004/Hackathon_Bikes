package testcases;

import org.testng.annotations.Test;
import pageobjects.CarsPage;
import pageobjects.HomePage;
import testbase.BaseTest;
import java.io.IOException;

public class TC_8Cars extends BaseTest {
    HomePage hp;
    CarsPage cp;
    @Test
    public void m2() throws IOException {
        hp=new HomePage(driver);
        hp.clickMore();
        hp.clickUsedCars();
        cp=new CarsPage(driver);
        cp.setChennai();
        cp.clickReadMore();
//        cp.printCarNames();
        cp.exportCarDetails();
    }
}