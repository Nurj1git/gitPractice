package com.digital;

import com.digital.driver.Driver;
import com.digital.helper.AlertHelper;
import com.digital.helper.FrameHelper;
import com.digital.helper.ScreenShotMethods;
import com.digital.pages.TextBoxPage;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class Main {

//    public static void main(String[] args) {
//
//    Student student = new Student("john","Doe","john@gmail.com","+9967673882", "Bishkek132");
//
//    }
//    @Test
//    public void tst(){
//        driver = Driver.getDriver();
//        driver.get("https://demoqa.com/automation-practice-form");
//        PracticeFormPage practiceFormPage = new PracticeFormPage();
//
//    }
WebDriver driver;

    @Test
    void test10() throws InterruptedException {
        driver = Driver.getDriver();

        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        driver. findElement(By.id("timerAlertButton")).click();

        WebDriverWait wait = new WebDriverWait (Driver.getDriver(), Duration.ofSeconds (5));
        wait.until (ExpectedConditions.alertIsPresent());
        alert.accept();

        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();

        driver.findElement(By.id("promtButton")).click();

        alert.sendKeys("Nur");
        alert.accept();
    }

    @Test
    public  void  testAlert() throws InterruptedException, IOException {
        ScreenShotMethods screenShotMethods = new ScreenShotMethods();
        WebDriver driver = Driver.getDriver();
        AlertHelper alertHelper = new AlertHelper();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(5000);
        alertHelper.acceptAlert();
        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAl();
        driver.findElement(By.id("promtButton")).click();
        alertHelper.SenKeysAl("NUR");
        screenShotMethods.takeScreenShot();





    }
    @Test
    public void iframeTST() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");


        Thread.sleep(4000);
        WebElement txt = driver.findElement(By.id("sampleHeading"));
        Assert.assertTrue(txt.getText().contains("This is a sample page"));
        Thread.sleep(3000);
        System.out.println(txt.getText());

        driver.switchTo().defaultContent();
        WebElement div = driver. findElement(By .xpath( "//div[@id='framesWrapper']/div")) ;
        System.out.println(div.getText());
//        driver.navigate().back();
        Thread.sleep(2000);



        driver.switchTo().frame("frame2");
        Thread.sleep(2000);
        WebElement txt2 = driver.findElement(By.id("sampleHeading"));
        Thread.sleep(1000);
        Assert.assertTrue(txt2.getText().contains("This is a sample page"));
        System.out.println(txt2.getText()+"2222");




    }
    @Test
    public void Test12() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/nestedframes");
        FrameHelper frameHelper = new FrameHelper();
        frameHelper.switchToFrameWithId("frame1");
        Thread.sleep(2000);
        frameHelper.switchToFrameWithIndex(0);
        WebElement text = driver. findElement(By .tagName("p")) ;

        Assert.assertEquals(text.getText(),"Child Iframe");
        Thread.sleep(2000);
        System.out.println(text.getText());
        frameHelper.switchToDefaultContent();
        Thread.sleep(2000);
        WebElement vbn = driver.findElement(By.xpath("//div[text() = \"Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.\"]"));
        Assert.assertEquals(vbn.getText(),"Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.");
        System.out.println(vbn.getText());







    }








    @Test
    public void testTextBoxPage (){
        driver = Driver.getDriver();
        driver.get("https://demoqa.com/text-box");
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.fillUpTheFullName("Nurik").fillUpTheEmail("nurik@mail.ru").fillUpTheCurrentAddress("Bishkek").fillUpThePermanentAddress("Bishkek").submitClick().testTextBoxPage();
    }


}


