import com.digital.pages.BasePage;
import com.digital.pages.RadioButtonPage;
import org.testng.annotations.Test;

import static com.digital.driver.Driver.driver;

public class RadioButtonTest extends BasePage {
    @Test
    void testRadioBtn() {
        driver.get("https://demoqa.com/radio-button");
       RadioButtonPage radioButtonPage = new RadioButtonPage();
       radioButtonPage.clickYesBtn()
               .clickImpessiveBtn()
               .clickNoBtn();

    }
}