package Day04_09122020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class google_search {
    public static void main(String[] args) throws InterruptedException {
      //set the chrome driver location
      System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
      //defining the web driver that you will be using
        WebDriver driver = new  ChromeDriver();
       //let's get to google home page
       //driver.get("https;//www.google.com");
       //lets navigate to google home page
        driver.navigate().to("https://google.com");
        //maximize my window
       driver.manage().window().maximize();
                //put two second delay
        Thread.sleep(3000);
        //locate search field by name and enter a keyword on the field
        driver.findElement(By.name("q")).sendKeys("cars");
        //handling delay by using sleep command
        Thread.sleep(1000);
        //click on the google search

       // driver.findElement(By.name("btnK")).click();
        driver.findElement(By.name("btnK")).submit();// hitting enter is same as submit

//driver.close
//driver.close();


//driver.quit();





    }  //end of main method



}//end of java class
