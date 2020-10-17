package Day09_09272020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Implicitwait_holusite {

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
        WebDriver driver = new ChromeDriver(options);


//set the implicit wait before your test steps
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.hulu.com");

        //click on the start free trial
        //driver.findElement(By.xpath("//*[text()='START YOUR FREE TRAIL']")).click();
        //above the text property didn't work because element not intractable
        //if this is case then use another unique property
        //click on search
       driver.findElement(By.xpath("//*[@class='button--cta button--white Masthead__input-cta']")).click();
Thread.sleep(2000);
    }//end of main method


}//end of java method
