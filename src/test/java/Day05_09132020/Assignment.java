package Day05_09132020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment {

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
        WebDriver driver = new ChromeDriver(options);//option variable should be passed here


//lets create dynamic array to handle multiple state on bing page
        String[] hobby = new String[4];
        hobby[0] = "Cricket";
        hobby[1] = "Football";
        hobby[2] = "Baseball";
        hobby[3] = "Volleyball";

        for(int i = 0; i < hobby.length; i++){

            //lets navigate to bing home page
            driver.navigate().to("https://bing.com");

            //maximize my window
            driver.manage().window().maximize();
            //put two second delay
            Thread.sleep(3000);


            //locate search field by name and enter a keyword on the field
            driver.findElement(By.name("q")).sendKeys(hobby[i]);
            //handling delay by using sleep command
            Thread.sleep(1000);

            //click on the bing search
            driver.findElement(By.className("search")).submit();
            //delay to load search result page
            Thread.sleep(3000);

            //capture the search result text
            String result = driver.findElement(By.className("sb_count")).getText();
            String[] arrayResult = result.split(" ");

            //print out the search number
            System.out.println("My search number for " + hobby[i] + " is " + arrayResult[0]);

        }//end of for loop
        driver.quit();
    }//end of main method
}//end of java class

