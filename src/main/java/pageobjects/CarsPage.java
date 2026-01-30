package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BikeDetails;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarsPage extends BasePage{

    public CarsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Chennai']")
    public WebElement chennai;

    @FindBy(xpath = "//h1[@id='usedcarttlID']")
    public WebElement usedCarsInChennai;

    @FindBy(xpath = "//span[text()='Read More']")
    WebElement readMore;

    @FindBy(xpath = "//tbody/tr/td[1]")
    List<WebElement> carNames;

    public void setChennai(){
        super.clickByJS(chennai);
    }

    public void clickReadMore(){
        super.clickByJS(readMore);
    }

//    public void printCarNames(){
//        for(int i=0;i<5;i++){
//            String carnames=carNames.get(i).getText();
//            System.out.println("Car Names : " + carnames);
//        }
//    }

    public void exportCarDetails() throws IOException {
        List<String> carDetails = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            carDetails.add(carNames.get(i).getText());
    }
        BikeDetails.writeCarDetails(carDetails);
   }
}