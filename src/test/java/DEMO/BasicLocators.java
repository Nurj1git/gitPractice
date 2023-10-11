package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocators extends BaseTest {

    @Test
    void byIdTest() {
        WebElement userName = driver.findElement(By.id("userName"));

    }

    @Test
    void byTagName() {
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement byTag = driver.findElement(By.tagName("h5"));
        System.out.println(byTag.getText());
    }

    @Test
    void byClassName() {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byClass = driver.findElement(By.className("main-header"));
        System.out.println(byClass.getText());
    }

    @Test
    void linkedTest() {
        driver.get("https://demoqa.com/links");
        WebElement lickText = driver.findElement(By.linkText("Home"));
        System.out.println(lickText.getText());


    }

    @Test
    void partialLinkedText(){
        driver.get("https://demoqa.com/links");
        WebElement partialLick = driver.findElement(By.partialLinkText("Bad"));
        System.out.println(partialLick.getText());
    }

    @Test
    void byName(){
        driver.get("https://demoqa.com/links");
        WebElement byName = driver.findElement(By.name("email"));
        System.out.println(byName.getText());
    }
}
