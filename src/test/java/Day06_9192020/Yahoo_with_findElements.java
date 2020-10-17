package Day06_9192020;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;

public class Yahoo_with_findElements {
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
        //lets navigate to yahoo home page
        driver.navigate().to("https://yahoo.com");
        //delay two seconds
        Thread.sleep(2000);

        WebElement searchField = driver.findElement(By.xpath("//*[@name='p']"));
        //clear any pre defined value on the field
        searchField.clear();
        //enter your new keyword
        searchField.sendKeys("cars");
        //submit on the field after the value
        searchField.submit();

        //using find element tp click on 3rd link(news)
        driver.findElements(By.xpath("//*[@class='_yb_e4mte ']")).get(2).click();



    } //end of main method

}//end of java method
