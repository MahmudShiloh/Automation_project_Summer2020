package Day07_09202020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Array_list {
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


        //click on different months from the drop down using array list

        ArrayList<String> smList = new ArrayList<>();
        smList.add("Jan");
        smList.add("Feb");
        smList.add("Mar");
        smList.add("Apr");
        smList.add("Jun");
        smList.add("Jul");

        //navigate to mlcalc
        driver.navigate().to("https://www.mlcalc.com");
        Thread.sleep(2000);

        //using loop i want to iterate through all month list and click on each one
        for (int i = 0; i < smList.size(); i++){


           //use webElement variable to store your start month dropDown
           WebElement startMonth = driver.findElement(By.xpath("//*[@name='sm']"));
            Select smDropDown = new Select(startMonth);
            smDropDown.selectByVisibleText(smList.get(i));


            //selecting start month when the html tag is not under select tag
            driver.findElement(By.xpath("//*[@name='sm']")).click();
           Thread.sleep(1000);
            driver.findElement(By.xpath("//*[text()='"+smList.get(i)+"']")).click();






        }//end of loop

    }//end of main method

}//end of java class





