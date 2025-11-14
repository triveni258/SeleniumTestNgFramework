package rahulShettyAcademy.pageObjectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rahulShettyAcademy.AbstractComponent.AbstractComponent;

public class LandingPage1 extends AbstractComponent {
    WebDriver driver;
    public LandingPage1(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    //WebElement username = driver.findElement(By.id("userEmail"));
    //pagefactory
    @FindBy (id = "userEmail")
    WebElement username;
    @FindBy (id="userPassword")
    WebElement userpassword;
    @FindBy (id="login")
    WebElement submit;
    @FindBy (css="[class*='flyInOut']")
    WebElement errorMessage;
    public ProductCatalogue loginapplication(String email, String password)
    {username.sendKeys(email);
        userpassword.sendKeys(password);
        submit.click();
        ProductCatalogue productCatalogue = new ProductCatalogue(driver);
        return productCatalogue;
    }

    public String ErrorValidation()
    {
        waitForWebElement(errorMessage);
        return errorMessage.getText();

    }
    public void goTo()
    {

        driver.get("https://rahulshettyacademy.com/client");
    }

    
}
