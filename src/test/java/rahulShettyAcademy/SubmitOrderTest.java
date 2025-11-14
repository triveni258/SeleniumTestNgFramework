package rahulShettyAcademy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import rahulShettyAcademy.TestComponent.BaseTest;
import rahulShettyAcademy.pageObjectFiles.CartPage;
import rahulShettyAcademy.pageObjectFiles.CheckOutPage;
import rahulShettyAcademy.pageObjectFiles.ConfirmationPage1;
import rahulShettyAcademy.pageObjectFiles.LandingPage1;
import rahulShettyAcademy.pageObjectFiles.ProductCatalogue;

import java.io.IOException;
import java.util.List;

public class SubmitOrderTest extends BaseTest {

    @Test
    public void SubmitOrder () throws IOException {

        String productName= "ZARA COAT 3";

        LandingPage1 landingPage= launchApplication1();

        ProductCatalogue productCatalogue = landingPage.loginapplication("triveni.bhaskar999@gmail.com","Kitaboo@123");

        List<WebElement> products =productCatalogue.getProductList();

        productCatalogue.addProductToCart(productName);
        CartPage cartPage =productCatalogue.goToCartPage();

        Boolean match = cartPage.verifyingProductDisplaying(productName);
        Assert.assertTrue(match);
        CheckOutPage checkoutPage = cartPage.goTocheckOutPage();
        checkoutPage.SelectCountry("india");
        ConfirmationPage1 confirmationPage=checkoutPage.SubmitOrder();

        String confirmMessage = confirmationPage.getConfirmationMessage();
        
        Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));
       driver.close();








       



        



    }


}
