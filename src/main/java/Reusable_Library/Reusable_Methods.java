package Reusable_Library;

import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.util.List;

public class Reusable_Methods {
    static int timeout = 15;

    public static WebDriver getDriver() {
        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

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


        return driver;
    }


    //Reusable method to click on any element omn any websites
    public static void click(WebDriver driver, String locator, String elementName) {
        // define explicit wait
        WebDriverWait Wait = new WebDriverWait(driver, timeout);
        try {
            System.out.println("clicking on element" + elementName);
            Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
        } catch (Exception err) {
            System.out.println("unable to click on element" + err);
        }//end of exception
    }//end of click method


    //Reusable method to type on any element omn any websites
    public static void sendKeys(WebDriver driver, String locator, String userValue, String elementName) {
        // define explicit wait
        WebDriverWait Wait = new WebDriverWait(driver, timeout);
        try {
            System.out.println("Typing on element" + elementName);
            WebElement element = Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.clear();
            element.sendKeys(userValue);
        } catch (Exception err) {
            System.out.println("unable to type on element" + err);

        }//end of exception
    }//end of SendKeys method


    //Reusable method to submit on any element on any websites
    public static void submit(WebDriver driver, String locator, String elementName) {
        // define explicit wait
        WebDriverWait Wait = new WebDriverWait(driver, timeout);
        try {
            System.out.println("Submitting on element" + elementName);
            Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).submit();
        } catch (Exception err) {
            System.out.println("unable to submit on element" + err);

        }//end of exception
    }//end of submit method


    // Reusable_Methods to capturing on any element on any websites
    public static String captureResult(WebDriver driver, String locator, String elementName) {
        // define explicit wait
        String Result = "";
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            System.out.println("Capturing  on element" + elementName);
            Result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).getText();

        } catch (Exception err) {
            System.out.println("unable to capture on text element" + err);
        }//end of exception

        return Result;
    }//end of capturing method


    // Reusable_Methods to select dropDown menu on any element on any websites
    public static void dropDownMenu(WebDriver driver, String locator, String UserInput, String elementName) {
        // define explicit wait
        WebDriverWait Wait = new WebDriverWait(driver, timeout);
        try {
            System.out.println("Dropdown on element" + elementName);
            WebElement dropDown = Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            Select selectDropdown = new Select(dropDown);
            selectDropdown.selectByVisibleText(UserInput);

        } catch (Exception err) {
            System.out.println("unable to dropdown on element" + err);
        }//end of dropDown

    }//end of capturing method


    public static void clickByIndex(WebDriver driver, String locator, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        try {
            System.out.println("Clicking by index " + index + " on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator))).get(index);
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click by index " + index + " on element " + elementName + " " + e);
        }
    }//end of click by index method

    public static void typeAndSubmit(WebDriver driver, String locator, String userInput, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            System.out.println("Entering a value on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.clear();
            element.sendKeys(userInput);
            Thread.sleep(1000);
            element.sendKeys(Keys.ENTER); //this is another way to submit to an element using key event
        } catch (Exception e) {
            System.out.println("Unable to enter on element " + elementName + " " + e);
        }
    }//end of type and submit method



    }//end of java method








