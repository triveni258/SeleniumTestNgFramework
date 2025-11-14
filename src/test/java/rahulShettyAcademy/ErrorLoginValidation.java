package rahulShettyAcademy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import rahulShettyAcademy.TestComponent.BaseTest;
import rahulShettyAcademy.pageObjectFiles.LandingPage1;
import rahulShettyAcademy.pageObjectFiles.ProductCatalogue;

import java.io.IOException;
import java.util.List;

public class ErrorLoginValidation extends BaseTest {
    @Test
    public void valodation() throws IOException {
        String productName= "ZARA COAT 3";

        LandingPage1 landingPage= launchApplication1();

      landingPage.loginapplication("triveni.@gmail.com","Kitaboo@123");
       Assert.assertEquals("Incorrect email or password.",landingPage.ErrorValidation());



    }






}
