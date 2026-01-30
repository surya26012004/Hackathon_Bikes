package pageobjects;
import utilities.BikeDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BikesPage extends BasePage{
    public BikesPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "(//a[@class='lnk-c'])[4]")
    public WebElement upcmngBikesUndr5lkhs;

    @FindBy(xpath = "(//img[@class='pt-10'])[3]")
    public WebElement royalEnfield;

    @FindBy(xpath = "//strong[contains(text(),'50') or contains(text(),'C6')]")
    public List<WebElement> bikeNames;

    @FindBy(xpath = "(//div[@class='b fnt-15'])[position()<=5]")
    public List<WebElement> bikePrice;

    @FindBy(xpath = "(//div[@class='clr-try fnt-14'])[position()<=5]")
    List<WebElement> expctdLaunchDate;

    @FindBy(xpath = "(//span[text()='Alert Me When Launched'])")
    public List<WebElement> alertme;

    @FindBy(xpath = "//strong[contains(text(), 'Royal Enfield')]")
    public List<WebElement> allBikeNames;

    public void clickUpcmngBikesUndr5lkhs(){
        super.scrollIntoView(upcmngBikesUndr5lkhs);
        super.clickByJS(upcmngBikesUndr5lkhs);
    }
    public void clickRoyalEnfield(){
        super.scrollIntoView(royalEnfield);
        super.clickByJS(royalEnfield);
    }

//    public void printDetails(){
//        for(int i=0;i<5;i++) {
//            String bikenames = bikeNames.get(i).getText();
//            String bikeprice = bikePrice.get(i).getText();
//            String expectedLaunchDate = expctdLaunchDate.get(i).getText();
//            System.out.println("Bike Name : " +bikenames);
//            System.out.println(("Bike Price : " +bikeprice));
//            System.out.println("Launch Date : " +expectedLaunchDate);
//        }

    public void exportDetailsToExcel() throws IOException {
        List<String> names = new ArrayList<>();
        List<String> prices = new ArrayList<>();
        List<String> dates = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            names.add(allBikeNames.get(i).getText());
            prices.add(bikePrice.get(i).getText());
            dates.add(expctdLaunchDate.get(i).getText());
        }
        BikeDetails.writeBikeDetailsToExcel(names, prices, dates);
    }

    public void exportAllBikeDetails() throws IOException {
        List<String> allBikenames = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            allBikenames.add(allBikeNames.get(i).getText());
        }
        BikeDetails.writeAllBikeDetailsToExcel(allBikenames);
    }
}