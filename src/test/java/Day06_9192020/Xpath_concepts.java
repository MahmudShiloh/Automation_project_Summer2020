package Day06_9192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_concepts {
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

        //let's get to yahoo home page
        //driver.get("https;//www.google.com");
        //lets navigate to google home page
        driver.navigate().to("https://yahoo.com");
        // delay 2 second
        Thread.sleep(2000);

        //type a keyword on yahoo search field
        driver.findElement(By.xpath("//*[@id='ybar-sbq' or @name='p']")).sendKeys("cars");
        //using contains to only specify matching word within word a property to locate an element
        driver.findElements(By.xpath("//*[contains(@class,'yb_e4mte ')]")).get(2).click();

        //click/submit on search button

        driver.findElement(By.xpath("//*@value='search']"));
        //navigate to yahoo page
        Thread.sleep(2000);



    } //end of main method



}//end of java class
