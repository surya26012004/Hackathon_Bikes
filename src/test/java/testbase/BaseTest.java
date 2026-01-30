package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
//    public WebDriverWait wait;
    @BeforeClass
    public void setDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.zigwheels.com/");
        driver.manage().window().maximize();
//        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}