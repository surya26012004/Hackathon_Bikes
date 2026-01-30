package pageobjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public JavascriptExecutor js;
    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js=(JavascriptExecutor) driver;
    }

    public void scrollIntoView(WebElement element) {

        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickByJS(WebElement element) {

        js.executeScript("arguments[0].click();", element);
    }
}