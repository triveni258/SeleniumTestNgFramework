import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
    public static void main(String[] args) {




        WebDriverManager.chromedriver().setup();  // auto setup driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       WebElement selectDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
       Select dropdwon = new Select(selectDropdown);
        dropdwon.selectByVisibleText("AED");
        System.out.println(dropdwon.getFirstSelectedOption().getText());

        dropdwon.selectByValue("INR");
        System.out.println(dropdwon.getFirstSelectedOption().getText());

        dropdwon.selectByIndex(3);
        System.out.println(dropdwon.getFirstSelectedOption().getText());



    }
}
