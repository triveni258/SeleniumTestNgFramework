package rahulShettyAcademy.pageObjectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rahulShettyAcademy.AbstractComponent.AbstractComponent;

import java.util.List;

public class CartPage extends AbstractComponent {
    WebDriver driver;

    public CartPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css= ".cartSection h3")
    List<WebElement> cartProducts;
    @FindBy(css=".btn btn-primary")//totalRow button
    WebElement checkoutEle;
    public Boolean verifyingProductDisplaying(String productName)
    {
        Boolean match=cartProducts.stream().
                anyMatch(cartProductName-> cartProductName.getText().equalsIgnoreCase(productName));

        return match;
    }
    public CheckOutPage goTocheckOutPage()
    {
        checkoutEle.click();
        return new CheckOutPage(driver);
    }





   //
}
