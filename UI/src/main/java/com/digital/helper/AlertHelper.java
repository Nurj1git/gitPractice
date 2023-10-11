package com.digital.helper;

import com.digital.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {
    Alert alert;

    public AlertHelper acceptAlert(){
        waitAlertToBePresent();
        switchTo();

        alert.accept();
        return this;

    }

    public AlertHelper dismissAl(){
        waitAlertToBePresent();
        switchTo();

        alert.dismiss();
        return this;

    }

    public AlertHelper SenKeysAl(String txt){
        switchTo();
        waitAlertToBePresent();
        alert.sendKeys(txt);
        alert.accept();
        return this;


    }
    public AlertHelper switchTo(){
        alert = Driver.getDriver().switchTo().alert();
        return this;


    }
    public AlertHelper waitAlertToBePresent(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        return this;
    }




}
