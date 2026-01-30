package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BikesPage;
import testbase.BaseTest;

public class TC_3UpcomingDisplayed extends BaseTest {
    @Test
    public void upcomingBikesRange(){
        BikesPage bp=new BikesPage(driver);
        boolean val=bp.upcmngBikesUndr5lkhs.isDisplayed();
        Assert.assertTrue(val,"Upcoming Bikes Under 5 Lakhs");
    }
}