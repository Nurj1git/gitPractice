import com.digital.driver.Driver;
import com.digital.homeWork.AlertPage;
import com.digital.homeWork.DynamicPropertiesPage;
import com.digital.homeWork.NestedFramesPage;
import com.digital.pages.ButtonsPage;
import com.digital.pages.PracticeFormPages;
import com.digital.pages.TextBoxPage;
import com.digital.pages.WebTablesPage;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public PracticeFormPages practiceFormPage;
    public FakeDataProvider fakeDataProvider;
    public ButtonsPage buttonsPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public AlertPage alertPage;
    public WebTablesPage webTablesPage;
    public  NestedFramesPage nestedFramesPage;



    @BeforeClass(alwaysRun = true)
    public void setUpBrowser(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
       practiceFormPage = new PracticeFormPages();
       fakeDataProvider = new FakeDataProvider();
       dynamicPropertiesPage = new DynamicPropertiesPage();
       buttonsPage = new ButtonsPage();
       alertPage = new AlertPage();
       webTablesPage = new WebTablesPage();
       nestedFramesPage = new NestedFramesPage();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.getDriver();
    }
}
