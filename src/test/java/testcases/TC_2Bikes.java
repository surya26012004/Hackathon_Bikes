package testcases;

import org.testng.annotations.Test;
import pageobjects.BikesPage;
import pageobjects.HomePage;
import testbase.BaseTest;
import java.io.IOException;

public class TC_2Bikes extends BaseTest {

    @Test
    public void m1() throws IOException {
        HomePage hp=new HomePage(driver);
        hp.clickNewBikes();
        hp.clickUpcmngBikes();
        BikesPage bp=new BikesPage(driver);
        bp.clickUpcmngBikesUndr5lkhs();
        bp.clickRoyalEnfield();
//        bp.printDetails();
        bp.exportDetailsToExcel();
    }
}