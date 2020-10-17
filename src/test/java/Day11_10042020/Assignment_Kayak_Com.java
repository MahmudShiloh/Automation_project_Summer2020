package Day11_10042020;

import Reusable_Library.Reusable_Methods;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Assignment_Kayak_Com {


    //declare all the global variables outside
    WebDriver driver;
    Workbook readableFile;
    Sheet readableSheet;
    WritableWorkbook writableFile;
    WritableSheet writableSheet;
    int rowCount;
    @BeforeSuite
    public void setDriver() throws IOException, BiffException {
        //setting the chrome driver
        driver = Reusable_Methods.getDriver();
        //Step 1: locate the readable excel workbook
        readableFile = Workbook.getWorkbook(new File("src/main/resources/Mortgage_Info.xls"));
        //Step 2: locate the excel sheet for this readable workbook
        readableSheet = readableFile.getSheet(0);
        //Step 3: make a copy of readable file to write back to the excel so it doesn't corrupt the original file
        writableFile = Workbook.createWorkbook(new File("src/main/resources/Mortgage_Info_Results.xls"),readableFile);
        //Step 4: define the writable sheet for writable file
        writableSheet = writableFile.getSheet(0);
        //Ste 5: get the count of the rows that are not empty on your excel workbook
        rowCount = writableSheet.getRows();
    }//end of before suite

    @Test
    public void pickUp() throws WriteException, InterruptedException {
        //all the test steps have to go inside for loop
        for(int i = 1; i < rowCount; i++) {
            //I need to get the content of the cell
            //column is hard coded and row is dynamic(i)
            String airport = writableSheet.getCell(0, i).getContents();
            String StDate = writableSheet.getCell(1, i).getContents();
            String StTime = writableSheet.getCell(2, i).getContents();
           // String startMonth = writableSheet.getCell(3, i).getContents();
           // String startYear = writableSheet.getCell(4, i).getContents();

            driver.navigate().to("https://www.kayak.com");
            Thread.sleep(2000);
/** below code is inspected before you clicking inside the search field
 and I am using contains id property as initial portion of id value
 is changing **/
            Reusable_Methods.click(driver, "//*[contains(@id,'pickup-display')]", "Pick up Location");
            Reusable_Methods.sendKeys(driver, "//*[@name='pickup']","JFK NY","Airport");
/** click on suggesting link once you type your airport
 orelse it will block your calendar so you need to click on suggested link **/
            Reusable_Methods.click(driver, "//*[@class='smarty-item-icon']", "Choose Airport Link");
//now put like 1 to 2 seconds then click on start date calendar icon
            Thread.sleep(2000);
//line below is clicking on calendar icon first for start date
            Reusable_Methods.click(driver,"//*[contains(@id,'dateRangeInput-display-start-inner')]","Start Date");
            Reusable_Methods.sendKeys(driver,"//*[contains(@id,'pickup-date-input')]","10/20/2020","10/20/2020");
/** element below is not interactable because you have to close the calendar so click anywhere outside
 like clicking on title search for hundred **/
            Reusable_Methods.click(driver,"//*[@class='title dark']","Dark Title");
//put like 1 second
            Thread.sleep(1000);
//before you select the value from start time you need to click on start time icon first
            Reusable_Methods.click(driver, "//*[contains(@id,'start-time-select-display')]","Start Time");
/** also before clicking on the value you should put 1.5 to 2 seconds to slow down selenium
 orlese you will get element not interactable error **/
            Thread.sleep(2500);
//now click on start time value
            Reusable_Methods.click(driver, "//*[contains(@id,'start-time-select-option') and @data-title='10:00 am']","Start Time Value");






//now do the same for calendar end date by choosing accurate property

//after entering end date you can click outside to close the calendar
//Reusable_Methods.click(driver,"//*[@class='title dark']","Dark Title");

//then same click end time first

//wait few seconds then click on end time value




        }







        }
}//end of the java class
