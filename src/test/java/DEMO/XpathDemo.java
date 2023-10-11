package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XpathDemo extends BaseTest {
    @Test
    void absolutXpath() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstNameInputField = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        firstNameInputField.sendKeys("Nur");
        Thread.sleep(7000);
    }
    @Test
    void relativeXpath(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement lastNameInputField = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        lastNameInputField.sendKeys("Jigit");

        WebElement userEmailField = driver.findElement(By.xpath("//input[@placeholder= 'name@example.com']"));

        WebElement userNumberField = driver.findElement(By.xpath("//*[@id = 'userNumber']"));

        WebElement SRF = driver.findElement(By.xpath("//*[text() = 'Student Registration Form']"));

        WebElement contains = driver.findElement(By.xpath("//*[contains(text(),'Student ')]"));

//        WebElement currentAddress = driver.findElement(By.xpath("(//*[@id = 'currentAddress'])[2]"));
//        WebElement currentAddressss = driver.findElement(By.xpath("(//*[@id = 'currentAddress'])[2]/../.."));

    }
}
//