import com.digital.pages.ButtonsPage;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{
    @Test
     void fillUpClick(){
        driver.get("https://demoqa.com/buttons");
        ButtonsPage  buttonsPage = new ButtonsPage();
        buttonsPage
                .clickDoubleBtn()
                .clickRightBtn()//исправь
                .clickMe();

    }
}