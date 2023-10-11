import com.digital.homeWork.DynamicPropertiesPage;
import com.digital.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class DinamicPrTest extends BaseTest {
    @Test
    public void Dynam(){
        driver.get("https://demoqa.com/dynamic-properties");
        DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage();
        dynamicPropertiesPage.clickClick().setVisibleA();

    }
}
