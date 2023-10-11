package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class  BrowserWindows extends BaseTest{
//    @Test
//    public void windowsTest() throws InterruptedException {
//        driver.get("https://demoqa.com/browser-windows");
//        new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.id("tabButton")))
//                .click();
//        Thread.sleep(5000);
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles()) ;
//        System.out.println(tabs.get(0));
//        System.out.println(tabs.get(0));
//        driver.switchTo().window(tabs.get(0));
//        driver.switchTo().window(tabs.get(1));
//        WebElement samle = driver.findElement(By.id("sampleHeading"));
//        Thread.sleep(1000);
//        Assert.assertEquals(samle.getText(), "This is a sample page");
//        Thread.sleep(3000);
//
//
//
//    }
//    @Test
//    void newWindowBtn() throws InterruptedException {
//        driver.get("https://demoqa.com/browser-windows");
//        new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.id("windowButton"))).click();
//        ArrayList<String> win = new ArrayList<>(driver.getWindowHandles()) ;
//        driver .switchTo().window(win.get (1)) ;
//        WebElement sample = driver.findElement(By.id("sampleHeading" ));
//        Assert.assertEquals (sample.getText(), "This is a sample page");
//        Thread. sleep( 5000) ;
//        driver .switchTo() .window (win.get(0)) ;
//        Thread.sleep(4000);
//
//
//
//
//    }

    @Test
    void messageWindowButton() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        String switchTabs = driver.getWindowHandle();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("messageWindowButton"))).click();
        String switchTabs2 = driver.getWindowHandle();

        Thread.sleep(1000);

        driver.switchTo().window(switchTabs);
        Thread.sleep(1000);
        driver.switchTo().window(switchTabs2);
        Thread.sleep(1000);





        WebElement txt = driver.findElement(By.xpath("/html/body"));

        Assert.assertTrue(txt.getText().contains("Knowledge"));




    }
}
