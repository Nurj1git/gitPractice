import com.digital.homeWork.FramesPage;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {
    @Test
    public void testBrowser() {
        FramesPage framesPage = new FramesPage();
        driver.get("https://demoqa.com/frames");
        framesPage.switchToFrame()
                .switchToFrame1();
    }
}