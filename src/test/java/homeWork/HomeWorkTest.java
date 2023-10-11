package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWorkTest {
    @Test
    void StudentRegistrationForm() throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/automation-practice-form");

        // Name

        WebElement firstNameField = driver.findElement(By.id("firstName"));

        String firstNameAdd = "Tony";

        firstNameField.sendKeys(firstNameAdd);





        WebElement lastNameField = driver.findElement(By.id("lastName"));

        String lastNameAdd = "Ferguson";

        lastNameField.sendKeys(lastNameAdd);

        // Email

        WebElement emailField = driver.findElement(By.xpath("//input[@id ='userEmail']"));

        emailField.sendKeys("tony.F@gmail.com");

        // Gender-Buttons

        WebElement GenderBtn1 = driver.findElement(By.xpath("//input[@id ='gender-radio-1']"));

        WebElement GenderBtn2 = driver.findElement(By.xpath("//input[@id ='gender-radio-2']"));

        WebElement GenderBtn3 = driver.findElement(By.xpath("//input[@id ='gender-radio-3']"));

        // Phone

        WebElement mobileField = driver.findElement(By.xpath("//input[@id ='userNumber']"));

        mobileField.sendKeys("77032836");

        // Date of Birth

        WebElement DofField = driver.findElement(By.id("dateOfBirthInput"));

        // Object

        WebElement objectField = driver.findElement(By.xpath("//input[@id ='subjectsInput']"));

        // Check-Boxes

        WebElement HobbyCheck1 = driver.findElement(By.xpath("//input[@id ='hobbies-checkbox-1']"));
        WebElement HobbyCheck2 = driver.findElement(By.xpath("//input[@id ='hobbies-checkbox-2']"));
        WebElement HobbyCheck3 = driver.findElement(By.xpath("//input[@id ='hobbies-checkbox-3']"));

        // Picture
        WebElement pictureField = driver.findElement(By.xpath("//input[@id ='uploadPicture']"));


        // currentAddress
        WebElement currentAddressField = driver.findElement(By.id("currentAddress"));



















    }

}
