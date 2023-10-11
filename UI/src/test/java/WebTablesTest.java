import com.digital.models.Student;
import com.digital.pages.WebTablesPage;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {

    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/webtables");
        WebTablesPage webTablesPage = new WebTablesPage();
        Student student = fakeDataProvider.createFakeStudentForWebtables();
        webTablesPage.addBtnClick();
        webTablesPage.fillAppTheForm(student);
        Thread.sleep(7000);

    }
}
