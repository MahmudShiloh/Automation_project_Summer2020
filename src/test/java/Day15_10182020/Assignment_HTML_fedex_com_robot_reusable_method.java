package Day15_10182020;

import Reusable_Library.*;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class Assignment_HTML_fedex_com_robot_reusable_method extends Abstract_Class {




      @Test
    public void fedex_com_robot_reusable_method() throws InterruptedException, AWTException {

        logger.log(LogStatus.INFO, "Navigating to fedex home page");
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.fedex.com/en-us/home.html");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver, "//*[contains(text(),'Design & Print')]", logger, "Design & Print");
        Thread.sleep(2000);

        Reusable_Methods_Loggers.click(driver, "//*[@alt='Upload a Print-Ready File']", logger, "UPload a Print Ready File");
        Thread.sleep(2000);


        Reusable_Method_Logger_1.getTitleContains(driver, "//*[@contains,'Fedex Office Print']", logger, "Fedex Office Print");
        Thread.sleep(2000);
        String actual = driver.getTitle();
        if (driver.getTitle().contains("Fedex Office Print")){
            System.out.println("Title Match with containing  word " + actual);

        } else {
            System.out.print("Title doesn't match.Actual is " + actual);

        }
            Reusable_Methods_Loggers.click(driver, "//*[@alt='Document Printing']", logger, "click on Document Printing image");
            Thread.sleep(2000);


          Reusable_Methods_Loggers.click(driver,"//*[@class='get-started']",logger, "Copies & Custom Projects");
          Thread.sleep(2000);


        Reusable_Methods_Loggers.click(driver,"//*[@name='upload-files-button']",logger, "Use Your file button to upload");
        Thread.sleep(2000);

        Reusable_Methods_Loggers.uploadFile("C:\\Users\\Mahmud\\Desktop\\wp-2014-08-milky-way-1023340_1280");
        Thread.sleep(2000);

        Reusable_Methods_Loggers.click(driver,"//*[@id='js-modal__continue-btn_lowResolutionPreview']",logger, "CONTINUE WITH EXISTING");
        Thread.sleep(2000);

        Reusable_Methods_Loggers.typeAndSubmit(driver,"//*[@id='item-quantity']","5", "Change quantity");
        Thread.sleep(3000);

        Reusable_Methods_Loggers.click(driver,"//*[@name='update_quanity-addToCart-lbl']",logger, "Add to Cart");
        Thread.sleep(2000);

        Reusable_Methods_Loggers.click(driver,"//*[@id='cartToCheckoutBtn']",logger, "Checkout");
        Thread.sleep(2000);

        Reusable_Methods_Loggers.click(driver,"//*[@id='continueAsGuest']",logger,"PROCEED AS GUEST");
        Thread.sleep(2000);



          Reusable_Methods_Loggers.dropDownMenu(driver,"//*[@id='radiusSelect']","5 Miles","click on withint 5 miles");
        Thread.sleep(2000);



          Reusable_Methods.typeAndSubmit(driver,"//*[@id='loc_seacrh_text']","11218","Zipcode");
          Thread.sleep(2000);


          Reusable_Methods.captureResult(driver,"//*[@class='active']"," capture the first available address ");
          Thread.sleep(2000);


      }


    }


