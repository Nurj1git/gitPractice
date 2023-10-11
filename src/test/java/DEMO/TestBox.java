package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;

public class TestBox extends BaseTest {



    @Test
    void fillUpTheFormTest() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        String expectedFullName = "John Doe";

        fullNameInputField.sendKeys(expectedFullName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
        String expectedAddress = "Biskek";

        currentAddressField.sendKeys(expectedAddress);

        WebElement permamentField = driver.findElement(By.id("permanentAddress"));

        String expectedPermament = "ak-sai 37";

        permamentField.sendKeys(expectedPermament);

        WebElement submitBtn = driver.findElement(By.id("submit"));

        submitBtn.click();

        Thread.sleep(5000);


        WebElement resultName = driver.findElement(By.id("name"));

        System.out.println(resultName.getText());

        Assert.assertTrue(resultName.getText().contains(expectedFullName));


        WebElement resultEmail = driver.findElement(By.id("email"));

        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id ='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains(expectedAddress));

        WebElement resultPermanent = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanent.getText().contains(expectedPermament));



    }

}
