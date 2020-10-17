package Day06_9192020;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

public class Yahoo_with_Xpath {
    public static void main(String[] args) throws InterruptedException {
        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //setting the chrome options before defining the driver
        ChromeOptions options = new ChromeOptions();
//set the driver to maximized
        options.addArguments("Start-maximized");
        //set the driver incognito mode(private)
        options.addArguments("incognito");
        //run the driver in headless mode
        // options.addArguments("headless");
        //defining the web driver that you will be using
        WebDriver driver =new ChromeDriver(options);//option variable should be passed here

        //navigate to yahoo page;
        driver.navigate().to("https://www.yahoo.com");

        //type a key word on a yahoo search field
        driver.findElement(By.xpath("//*[@name=p]")).sendKeys("cars");
        //click/submit on a search button
        driver.findElement(By.xpath("//*[@value='search']")).click();
        //delay  2 to 3 seconds
        Thread.sleep(2500);

        //need to scroll to the bottom of the page to capture the search result
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll down using executeScript command
        jse.executeScript("scroll(0,5000)");

        //capture the entire footer including the result from yahoo result page
        String result = driver.findElement(By.xpath("//*[@class='comPagination']")).getText();
        //need to split again to only capture the result
       String[] arrayResult = result.split("Next");
       //need to split again to only capture the number
        String[] searchResult  = arrayResult[1].split(" ");
        System.out.println("my search number is "+ searchResult[0]);
        Thread.sleep(2000);

         //lets go back to top of the page
        jse.executeScript("0,-5000");
        driver.quit();

    } //end of java class
}//end of java method