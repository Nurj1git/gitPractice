import com.digital.driver.Driver;
import com.digital.models.Student;
import com.digital.pages.PracticeFormPages;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest{



//    @BeforeClass
//    public static void setUp() {
//        driver = Driver.getDriver();
//    }

    @Test
    public void test1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        PracticeFormPages student1 = new PracticeFormPages();

        student1.fillUpTheFirstName(fakeDataProvider.generateFakeFullName())
                .fillUpTheLastName(fakeDataProvider.generateFakeLastName())
                .fillUpTheUserEmail(fakeDataProvider.generateFakeEmail())
                .fillUpTheUserNumber(fakeDataProvider.generationPhoneNUmber())
                .fillUpTheCurrentAddress(fakeDataProvider.generationFakeCurrentAddress())
                .clickGender()
                .clickHobbies()
                .selectState()
                .selectSubject()
                .selectSubject()
                .selectSubject()
                .setUploadPicture(student1.uploadPicture)
                .selectSubmitBtn();

    }
}
