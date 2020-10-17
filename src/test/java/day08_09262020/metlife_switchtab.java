package day08_09262020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class metlife_switchtab {
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

        driver.navigate().to("https:www.metlife.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[aria-lavel='SOLUTION']")).click();
//click on take along dental link
        driver.findElement(By.xpath("//8[@text()='MetLife TakeAlong Dental']")).click();
        Thread.sleep(2000);
driver.findElement(By.xpath("//*[contains(text),'Enroll Now']")).click();

//need to store get window handels command in as arrayList to switch to different tab(s)
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to second tab
        driver.switchTo().window(tabs.get(1));
        //enter the zipcode
        driver.findElement(By.xpath("//*[name='txtZipCode']")).sendKeys("11218");
        driver.close();//to close the new tab if you dont need it again
        //switch back to previous tab
        driver.switchTo().window(tabs.get(0));
        //renavigate back to met life
        driver.navigate().to("htttps:www.metlife.com");


    }//end of main method
}//end of java method
