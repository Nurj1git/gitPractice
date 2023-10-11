package com.digital.homeWork;
import com.digital.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
public class DynamicPropertiesPage {
    @FindBy(id = "enableAfter")
    public WebElement enableAfter;
    @FindBy(xpath = "//button[@id='colorChange']")
    public WebElement colorChange;
    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter;

    public DynamicPropertiesPage clickClick() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until((ExpectedConditions.elementToBeClickable(By.id("enableAfter"))))
                .click();
        return this;
    }

    public DynamicPropertiesPage setVisibleA() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")))
                .click();
        return this;
    }
//    public DynamicPropertiesPage color() {
//        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15)).
//                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='colorChange']")));
//        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].style.backgroundColor = 'red';", colorChange);
//        return this;
//    }
}























