package homeWork;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class iFrame extends BaseTest {
    @Test
    public void iframeTST() throws InterruptedException {
        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame(driver.findElement(By.id("frame1")));


        Thread.sleep(4000);
        WebElement txt = driver.findElement(By.id("sampleHeading"));
        Assert.assertTrue(txt.getText().contains("This is a sample page"));
        Thread.sleep(3000);
        System.out.println(txt.getText());

        driver.navigate().refresh();
//        driver.navigate().back();
        Thread.sleep(2000);



        driver.switchTo().frame(driver.findElement(By.id("frame2")));
        Thread.sleep(2000);
        WebElement txt2 = driver.findElement(By.id("sampleHeading"));
        Thread.sleep(1000);
        Assert.assertTrue(txt2.getText().contains("This is a sample page"));
        System.out.println(txt2.getText()+"2222");




    }

}
