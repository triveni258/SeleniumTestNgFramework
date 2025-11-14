package rahulShettyAcademy.TestComponent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import rahulShettyAcademy.pageObjectFiles.LandingPage1;

//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

//import static com.sun.tools.javac.jvm.ByteCodes.pop;

public class BaseTest {
    public WebDriver driver;
    public WebDriver intializerDriver() throws IOException {
        //Properties pop = new Properties();
        //FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"src\\main\\resources\\GlobadData.properties");
       // pop.load(file);
        Properties pop = new Properties();
        InputStream file = getClass().getClassLoader().getResourceAsStream("hi.properties");
        pop.load(file);

        String browserName = pop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if
            (browserName.equalsIgnoreCase("firefox"))
        {
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }
    public LandingPage1 launchApplication1() throws IOException {
        //LoginPage
        driver=intializerDriver();
        LandingPage1 landingPage= new LandingPage1(driver);
        landingPage.goTo();
        return landingPage;
    }


}
