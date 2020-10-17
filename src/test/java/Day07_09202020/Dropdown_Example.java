package Day07_09202020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Example {

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

        //navigate to mlcalc website
         driver.navigate().to("https://www.mlcalc.com");
         //delay 2 seconds
         Thread.sleep(2000);

        //use webElement variable to store your start month dropdown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='sm']"));
        Select smDropDown = new Select(startMonth);
         smDropDown.selectByVisibleText("Feb");


     //selecting start month when the html tag is not under select tag
        driver.findElement(By.xpath("//*[@name='sm']")).click();
        Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@text()='Feb']")).click();


        // use WebElement variable to store your start year dropdown
        WebElement startYear = driver.findElement(By.xpath("//*[@name='sy']"));
        Select syDropDown = new Select(startYear);
        smDropDown.selectByVisibleText("2022");
Thread.sleep(2000);


driver.quit();
    }//end of main method


}//end of java method
