package percy.test;
import io.percy.selenium.Percy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static WebDriver driver;
    public static Percy percy;
    public static final String PROD_URL = "https://www.browserstack.com";
    public static final String Non_PROD_URL = "https://k8s.bsstag.com/";

    @BeforeMethod
    public void setup()
    {
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        System.setProperty("webdriver.gecko.driver","/Users/siddhirao/Projects/percyAssignment1/src/main/resources/driver/geckodriver");
        driver = new FirefoxDriver(options);
        percy = new Percy(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }
}
