package Day09_09272020;

import Reusable_Library.Reusable_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import javax.naming.BinaryRefAddr;
import java.util.ArrayList;

public class Assignment_for_UHC_Com {
    public static void main(String[] args) throws InterruptedException {

        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //setting the chrome options before defining the web driver
        ChromeOptions options = new ChromeOptions();

        // set the driver to maximized
        options.addArguments("start-maximized");
        //set the driver to be incognito
        options.addArguments("incognito");
        //run the driver in in headless mode
        //options.addArguments("headless");

        //defining the that you will be using
        WebDriver driver = new ChromeDriver(options);//option variable should be passed here



        //arraylist for firstname
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("David");
        firstName.add("Stave");
        firstName.add("Zoe");

//arraylist for lastname
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Molar");
        lastName.add("Jhon");
        lastName.add("Mac");




//arraylist for Month
        ArrayList<String> Month = new ArrayList<>();
        Month.add("November");
        Month.add("October");
        Month.add("November");


        //arraylist for Month
        ArrayList<String> DD = new ArrayList<>();
        DD.add("25");
        DD.add("24");
        DD.add("23");

        //arraylist for Month
        ArrayList<String> YYYY = new ArrayList<>();
        YYYY.add("1990");
        YYYY.add("1991");
        YYYY.add("1992");


        //arraylist for ssn
        ArrayList<String> ssn = new ArrayList<>();
        ssn.add("81-5082");
        ssn.add("81-5083");
        ssn.add("81-5081");

//arraylist for Zipcode
        ArrayList<String> Zipcode = new ArrayList<>();
        Zipcode.add("11214");
        Zipcode.add("11215");
        Zipcode.add("11213");


        driver.navigate().to("https://www.UHC.com");
        Thread.sleep(2000);

        for(int i = 0; i<firstName.size(); i++){

            //capture the home page title verify it matches the title
            String actualTitle = driver.getTitle();
            //verify it matches the expected title
            if (actualTitle == "UHC.com") {
                System.out.print("title matches");
            } else {
                System.out.print("Title doesn't match.Actual is " + actualTitle);
            }//end of conditional statement



            //calling the reusable method to to click on clicking method
            Reusable_Methods.click(driver,"//*[@aria-label='Find a Doctor']","find a doctor link");
           // Thread.sleep(2000);

            //click on sign in to find find a provider
            Reusable_Methods.click(driver,"//*[@aria-label='Sign in to myuhc.com Opens a new window']","sign in to find find a provider");
            //Thread.sleep(3000);


            ArrayList<String> tabs =new ArrayList<>(driver.getWindowHandles());
//switch to second tab
            driver.switchTo().window(tabs.get(1));
           Thread.sleep(2000);



            Reusable_Methods.click(driver,"//*[@class='btn btn-outline-primary btn-block']","click on register button");
            //Thread.sleep(3000);

            Reusable_Methods.sendKeys(driver, "//*[@id='firstName']", firstName.get(i), "first name");
            Thread.sleep(2000);

            Reusable_Methods.sendKeys(driver, "//*[@id='lastName']", lastName.get(i), "Last name");
            Thread.sleep(2000);

            Reusable_Methods.dropDownMenu(driver, "//*[@id='dob_month_input']", Month.get(i), "Month");
            Thread.sleep(1000);

            Reusable_Methods.sendKeys(driver, "//*[@id='dob_day']", DD.get(i), "Day");
            Thread.sleep(1000);

            Reusable_Methods.sendKeys(driver, "//*[@id='dob_year']", YYYY.get(i), "Year");
            Thread.sleep(1000);

          //  scroll down
            JavascriptExecutor Jse = (JavascriptExecutor) driver;
            //scroll down using executeScript command
            Jse.executeScript("scroll(0,500)");
            Thread.sleep(1000);


            //ssn
            Reusable_Methods.click(driver, "//*[@id='ssn_container']", "social security number");// Thread.sleep(2000);
           Reusable_Methods.sendKeys(driver, "//*[@id='ssnLastSixDigits']", ssn.get(i), "SSN");
            Thread.sleep(2000);

            //zipcode
            Reusable_Methods.sendKeys(driver, "//*[@id='zipCode']", Zipcode.get(i), "zipcode");
            Thread.sleep(2000);

            //click on continue button
            Reusable_Methods.click(driver, "//*[@id='submitBtn']", "click continue");

            //Err message
            Reusable_Methods.captureResult(driver, "//*[@id='plainText_error']", "Error message");


            driver.close();
            driver.switchTo().window(tabs.get(0));




        }//end for loop
    }//end of main method
}//end of java method
