package homeWork;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Food extends BaseTest {
    @Test
    void  testFood(){
        driver.get("https://nambafood.kg/");

        WebElement foodBtn = driver.findElement(By.xpath("(//a[@href = '/food'])[2]"));
        foodBtn.click();

        WebElement foodNational = driver.findElement(By.xpath("//a[@href = '/cafe/national']"));
        foodNational.click();

        WebElement faiza = driver.findElement(By.xpath("//a[@href = '/faiza']"));
        faiza.click();






        WebElement plusmampar = driver.findElement(By.xpath("//div[@class = 'count-button count-up']"));
        Actions actions = new Actions(driver);// make double click
        actions.doubleClick(plusmampar).perform();

        WebElement countBtn1 = driver.findElement(By.xpath("(//button[@type = 'submit'])[5]"));
        countBtn1.click();


        WebElement plusminimampar = driver.findElement(By.xpath("(//div[@class ='count-button count-up'])[2]"));
        actions.doubleClick(plusminimampar).perform();


        WebElement countBtn2 = driver.findElement(By.xpath("(//button[@type = 'submit'])[6]"));
        countBtn2.click();

        WebElement kompot = driver.findElement(By.xpath("//a[@href = '#188']"));
        kompot.click();
//
//        WebElement kompotbtn = driver.findElement(By.xpath("(//button[@type = 'submit']  )[123]"));
//        kompotbtn.click();

        WebElement buy = driver.findElement(By.xpath("//a[@href = '/faiza/make-order']"));
        buy.click();

        driver.get("https://nambafood.kg/faiza/make-order");
        WebElement oform = driver.findElement(By.xpath("//button[@class=\"order--btn order--access\"]"));
        oform.click();

        driver.get("https://nambafood.kg/faiza/checkout");

        WebElement userFullName = driver.findElement(By.xpath("//input[@id='food_order_client_name']"));
        userFullName.sendKeys("U.R.Nurjigit");

        WebElement address = driver.findElement(By.xpath("//input[@class=\"order-address-map \"]"));
        address.sendKeys("Bakay-Ata");

        WebElement roomNum = driver.findElement(By.xpath("//input[@placeholder=\"Введите номер квартиры и этаж\"]"));
        roomNum.sendKeys("Oktabrskay-50");

        String expectedPhone= "food_order_phone";
        WebElement phoneNumber= driver.findElement(By.id(expectedPhone));
        phoneNumber.sendKeys("98778998");






















    }
}
