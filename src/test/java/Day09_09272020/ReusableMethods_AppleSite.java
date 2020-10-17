package Day09_09272020;

import Reusable_Library.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReusableMethods_AppleSite {
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

       driver.navigate().to("https://www.apple.com");


       //calling the reusable click method for clicking on mac link
        Reusable_Methods.click(driver,"//*[@data-analytics-title='mac']","Mac Link");
        //click on macbook air
        Reusable_Methods.click(driver,"//*[text()='MacBook Air']","Mac Book air");
        //click on search icon
      // Thread.sleep(2000);
        Reusable_Methods.click(driver,"//a[@id='ac-gn-link-search']","Search Icon");
        Thread.sleep(2000);
        //entering a keyword on search field
        Reusable_Methods.sendKeys(driver,"//*[@id='ac-gn-searchform-input']","iphone","Search Field");
       //hit submit
       Reusable_Methods.submit(driver,"//*[@placeholder='Search apple.com']","Search Field");


    }//end of main method


}//end of java method
