package Day07_09202020;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.ArrayList;


public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        //set the chrome driver zipCodes
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //setting the chrome options before defining the web driver
        ChromeOptions options = new ChromeOptions();

        // set the driver to maximized
        //options.addArguments("start-maximized");
        //set the driver to be incognito
        options.addArguments("incognito");
        //run the driver in in headless mode
        //options.addArguments("headless");
        //defining the that you will be using
        WebDriver driver = new ChromeDriver(options);//option variable should be passed here
//lets create an array list to three different zipcode



        //lets navigate to Watchers home page
        driver.navigate().to("https:www.weightwatchers.com");
        //delay 2 second
        Thread.sleep(3000);

        //capture the home page title verify it matches the title
        //which is weight loss & Wellness Help
        String actualTitle = driver.getTitle();
        //verify it matches the expected title

        if (actualTitle == "Weight Loss & Wellness Help") {
            System.out.print("title matches");
        } else {
            System.out.print("Title doesn't match.Actual is " + actualTitle);
        }//end of conditional statement

        ArrayList<String> zipCodelist = new ArrayList<>();
        zipCodelist.add("11218");
        zipCodelist.add("11219");
        zipCodelist.add("11220");

        for (int i = 0; i < zipCodelist.size(); i++)
        {

            //capture the home page title verify it matches the title
            //which is weight loss & Wellness Help


            //click on find workshop

            try
            {
                driver.navigate().to("https://www.weightwatchers.com");
            }
            catch (Exception err)
            {
                System.out.println("\nCould not navigate to https://www.weightwatchers.com\n" + err);
            }
            Thread.sleep(2000);


            try
            {
                System.out.println("\nClicking on 'Find a Workshop' button");
                driver.findElement(By.xpath("//*[@da-action='nav_header_find-a-workshop']")).click();
            }
            catch (Exception err)
            {
                System.out.println("\nUnable to Click on 'Find a Workshop' button\n" + err);
            }
            Thread.sleep(2000);

            try
            {
                System.out.println("\nEntering zipcode ");
                WebElement zipCodes = driver.findElement(By.xpath("//*[@id='location-search']"));
                zipCodes.clear();
                zipCodes.sendKeys(zipCodelist.get(i));
                Thread.sleep(2000);

            }
            catch (Exception err)
            {
                System.out.println("Unable to enter zip code." + err);
            }
            try
            {
                System.out.println("\nClicking on Search (right arrow) button or pressing Enter key on Keyboard.");
                driver.findElement(By.xpath("//*[@id='location-search-cta']")).click();
                Thread.sleep(2000);
            }
            catch (Exception err)
            {
                System.out.println("Unable to click on Search (right arrow) button or press Enter key on Keyboard. . ." + err);
            }

            System.out.println("\nScrolling down 500 pixels . . .");
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("scroll(0,500)");
            Thread.sleep(2000);


            //click on first link
            if (i == 0) {
                try {
                    System.out.println("click on first link");
                    driver.findElements(By.xpath("//*[@class='heading-3yCF-']")).get(1).click();
                } catch (Exception err) {
                    System.out.println("unable to click first link");
                }//end of link
                Thread.sleep(2000);
            }//end of condition

            if (i == 1) {
                try {
                    System.out.println("click on the second link");
                    driver.findElements(By.xpath("//*[@'oneLine-1Py5V']")).get(2).click();
                } catch (Exception err) {
                    System.out.println("");
                    Thread.sleep(2000);
                }//end of link 2
            }//end of condition

            if (i == 2) {
                try {
                    System.out.println("click on the third link");
                    driver.findElements(By.xpath("//*[@' class='oneLine-1Py5V']")).get(3).click();
                } catch (Exception err) {
                    System.out.println("");
                    Thread.sleep(2000);
                }//end of link 3
            }//end of if condition
            try {
                String address1 = driver.findElements(By.xpath("//*[@class='wrapperLink-2NobU']")).get(0).getText();
                String address2 = driver.findElements(By.xpath("//*[@class='address-3-YC0']")).get(1).getText();
                String address3 = driver.findElements(By.xpath("//*[class='wrapperLink-2NobU']")).get(2).getText();
            } catch (Exception err) {
                System.out.println("unable to capture address text" + err);
            }//need of string exception

            //need to scroll to the bottom of the page to capture the chart
            JavascriptExecutor Jse = (JavascriptExecutor) driver;
            //scroll down using executescript command
            jse.executeScript("scroll(0,1000)");

        }//end for loop


        Thread.sleep(5000);
        //driver.quit();

    }//end of main method
}//end of java method
