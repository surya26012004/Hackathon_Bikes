package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class LoginPage extends BasePage{

    public  LoginPage(WebDriver driver){
        super(driver);
    }
//    @FindBy(xpath = "//*[@class='fnt-14' and contains(text(),'Google')]")
    @FindBy(xpath  ="(//span[contains(text(),'Google')])[1]")
     public WebElement google;

    @FindBy(xpath = "//*[@type='email']")
    WebElement txtEmail;

    @FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[1]")
    WebElement clickNextBtn;

    @FindBy(xpath = "(//*[@class='whsOnd zHQkBf'])[1]")
    WebElement pwd;

    public void clickGoogle(){
        super.clickByJS(google);
    }

    public void enterEmail(String email){
        String mainWindow=driver.getWindowHandle();
        Set<String> allWindows=driver.getWindowHandles();
        for(String window:allWindows){
            if(!window.equals(mainWindow)){
                driver.switchTo().window(window);
                System.out.println("Switched to the new window: " + window);
                break;
            }
        }
        txtEmail.sendKeys(email);
    }

    public void enterPwd(String password){
        pwd.sendKeys(password);
        super.clickByJS(pwd);
    }

    public void clickNext(){

        super.clickByJS(clickNextBtn);
    }

}