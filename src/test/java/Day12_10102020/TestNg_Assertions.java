package Day12_10102020;

import Reusable_Library.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg_Assertions {

    @Test
    public  void assertions() throws InterruptedException {


        WebDriver driver = Reusable_Methods.getDriver();
        driver.navigate().to("Https://www.google.com");
        Thread.sleep(2000);
//verify the google title using hard assert
//Assert.assertEquals("GOOGLE",driver.getTitle());

//verify the google title using soft assertions
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("GOOGLE",driver.getTitle());

//enter keyword on search
        Reusable_Methods.sendKeys(driver,"//*[@name='q']","cars","Search Field");

softAssert.assertAll();


    }

}//end of java class




