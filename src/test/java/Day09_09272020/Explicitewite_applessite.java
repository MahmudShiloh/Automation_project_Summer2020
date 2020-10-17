package Day09_09272020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitewite_applessite {

    public static void main(String[] args) {
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

        //declare explicit wait common only once
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //navigate apple site
        driver.navigate().to("https://www.apple.com");
        //click on mac link using explicit wait
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-analytics-title='mac']"))).click();



    }//end of main method

}//end of java class
