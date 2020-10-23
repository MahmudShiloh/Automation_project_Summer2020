package Day13_10112020;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods;
import Reusable_Library.Reusable_Methods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class Assignment_Express_Com extends Abstract_Class {



    @Test


    public void Express_Com() throws InterruptedException {
        logger.log(LogStatus.INFO, "Navigating to express home page");
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.express.com");
        Thread.sleep(2000);

        //capture the home page title and verify it matches the expected title
        String actualTitle = driver.getTitle();
        if (actualTitle == "https://www.express.com"){
            System.out.println("Title Matches");
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }//end of conditional statement


        Thread.sleep(2000);

        //Reusable_Methods.mouseHover(driver,"//*[contains(@href='mens-clothing'))]");
      //Reusable_Methods.mouseHover(driver,"//*[role='menuitem'],");
       Reusable_Methods_Loggers.mouseHover(driver, "//*[@href='/mens-clothing']", logger, "Men");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver, "//*[@href='/mens-clothing/shirts/cat410008']", logger, "Shirts");
        Thread.sleep(2000);

        //  scroll down
        JavascriptExecutor Jse = (JavascriptExecutor) driver;
        //scroll down using executeScript command
        Jse.executeScript("scroll(0,500)");
        Thread.sleep(1000);

        Reusable_Methods_Loggers.clickByIndex(driver, "//*[@class='_1ddDj _136PD']",2,"Third shirt");
        Thread.sleep(2000);

        Reusable_Methods_Loggers.click(driver, "//*[@class='_3OQxl']",logger,"L");
        Thread.sleep(2000);



        Reusable_Methods_Loggers.click(driver, "//*[@value='xxl']",logger,"XXL");
        Thread.sleep(2000);


        Reusable_Methods_Loggers.click(driver, "//*[@aria-label='Size selection button group']",logger,"ADD TO BAG");
        Thread.sleep(2000);

        Reusable_Methods_Loggers.click(driver, "//*[text='Add to Bag']",logger,"ADD TO BAG");
        Thread.sleep(2000);


       // Reusable_Methods_Loggers.mouseClick(driver, "//*[@aria-label='view bag']","view bag");
       // Thread.sleep(2000);

//Reusable_Methods_Loggers.mouseHover(driver,"//*[@class='BagIcon_numberOfItems__2eK5g']",logger,"View Bag");
     //   Thread.sleep(4000);



      //  Reusable_Methods_Loggers.mouseHover(driver,"//div[3]/div[1]/button[1]","Shopping bag icon");
        //Reusable_Methods_Loggers.mouseClick(driver,"//*[contains(text('shoppingBag']',logger","VIEW BAG & CHECK OUT");
        Reusable_Methods_Loggers.mouseHover(driver,"//*[contains'View Bag & Check Out']" ,logger,"VIEW BAG & CHECK OUT");

        Thread.sleep(3000);

        Reusable_Methods_Loggers.click(driver, "//*[@id='qdd-0-quantity']",logger,"Qty");
        Thread.sleep(2000);
    }//end of test


    }
//Reusable_Methods.mouseHover(driver,"//div[3]/div[1]/button[1]","Shopping bag icon");