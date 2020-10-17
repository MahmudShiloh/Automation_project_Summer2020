package Day09_09272020;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Mouse_Actions {

    public static void main(String[] args) throws InterruptedException {
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


//navigate to usps.com
        driver.navigate().to("https:www.usps.com");
        Thread.sleep(2000);

//declare your mouse actoins command
        Actions actions = new Actions(driver);

//move your mouse to quick tools to open the dropdown
        WebElement quickTools = driver.findElement(By.xpath("//*[text()='Quick Tools']"));
actions.moveToElement(quickTools).perform();

//click on track a package using actions
        WebElement trackagePackge =driver.findElement(By.xpath("//*[text()='Track a Package']"));
        actions.moveToElement(trackagePackge).click().perform();
        //entering tracking number
        Thread.sleep(2500);
        WebElement tracNumber =driver.findElement(By.xpath("//*[id='tracking-inpute']"));
        actions.moveToElement(tracNumber).sendKeys("1111111").perform();
       // actions.moveToElement(trackNumber).click().perform();
        tracNumber.sendKeys("1111111");


//to submit on to something
        driver.findElement(By.xpath(" ")).submit();
       driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);



    }//end main method

}//end of java method
