package DEMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {
    public  WebDriver driver;
    private org.openqa.selenium.support.PageFactory PageFactory;

    @BeforeClass
    public void setupBrowser(){

        System.setProperty("webdriver.chrome.driver","/Users/nurjigit.0808gmail.com/Desktop/DRT/SummerSDET2023/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // make full screen

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // setup the time;
        PageFactory.initElements(driver, this);

    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }


}
