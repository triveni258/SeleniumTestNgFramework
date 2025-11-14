package rahulShettyAcademy.pageObjectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rahulShettyAcademy.AbstractComponent.AbstractComponent;

public class ConfirmationPage1 extends AbstractComponent {
    WebDriver driver;
    public ConfirmationPage1(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = ".hero-primary")
    WebElement ConfirmationMessage1;
    public String getConfirmationMessage()
    {

        return ConfirmationMessage1.getText();
    }





}
