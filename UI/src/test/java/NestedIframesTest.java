import com.digital.homeWork.NestedFramesPage;
import com.digital.pages.BasePage;
import org.testng.annotations.Test;

public class NestedIframesTest extends BaseTest {
    @Test
    public void NestedTest(){
        driver.get("https://demoqa.com/nestedframes");
        nestedFramesPage.switchToSwitch();
    }
}
