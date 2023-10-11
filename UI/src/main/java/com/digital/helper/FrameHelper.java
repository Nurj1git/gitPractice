package com.digital.helper;

import com.digital.driver.Driver;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

import static com.digital.driver.Driver.driver;


public class FrameHelper {
//    public FrameHelper waitFrameToBePresent(){
//        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
//                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt());
//        return this;
//    }
    Frame frame;
    public FrameHelper switchToFrameWithId(String idOfIframe){
        WebDriver driver = Driver.getDriver();

        driver.switchTo().frame(idOfIframe);
        return this;

    }

    public FrameHelper switchToFrameWithIndex(int indexOfIframe){
        WebDriver driver = Driver.getDriver();

        driver.switchTo().frame(indexOfIframe);
        return this;

    }
    public FrameHelper switchToFrameWebElement (WebElement frameElement){
        WebDriver driver = Driver.getDriver();

        driver.switchTo().frame(frameElement);
        return this;}

    public FrameHelper switchToDefaultContent() {
        WebDriver driver = Driver.getDriver();

        driver.switchTo().defaultContent();

        return this;

    }
    public FrameHelper switchToParent() {
        WebDriver driver = Driver.getDriver();

        driver.switchTo().parentFrame();

        return this;

    }



}
