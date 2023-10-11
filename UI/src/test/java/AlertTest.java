import com.digital.homeWork.AlertPage;
import com.digital.pages.BasePage;
import org.testng.annotations.Test;

import static com.digital.driver.Driver.driver;

public class AlertTest extends BasePage {
    @Test
    void AlertsTest(){
        driver.get("https://demoqa.com/alerts");
        AlertPage alertPage = new AlertPage();
        alertPage
                .clickToTimerAlertButton()
                .clickToConfirmResult()
                .clickToAlertButton();
    }
}
