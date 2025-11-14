package rahulShettyAcademy.pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rahulShettyAcademy.AbstractComponent.AbstractComponent;


public class CheckOutPage extends AbstractComponent {
    WebDriver driver;
    public CheckOutPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (css="[placeholder='Select Country']")
    WebElement Country;
    @FindBy(css=".action__submit")
    WebElement Submit;

    @FindBy(xpath = "//button[contains(@class,'ta-item')] [2]")
            WebElement selectCountry;
    By results = By.cssSelector(".ta-results");
    public void SelectCountry (String CountryName)
    {
        Actions a= new Actions(driver);
        a.sendKeys(Country, CountryName).build().perform();

        waitForElementToAppear(results);

        Country.click();
    }
    public ConfirmationPage1 SubmitOrder()
    {
        Submit.click();
        return new ConfirmationPage1(driver);
    }


}
