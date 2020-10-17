package Day07_09202020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class mlcalc_with_for_loop {
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

        //set the values for purchase price array list
        ArrayList<String> pPriceList = new ArrayList<>();
        pPriceList.add("350000");
        pPriceList.add("400000");

        //set the values for down payment array list
        ArrayList<String> dPaymentList = new ArrayList<>();
        dPaymentList.add("30");
        dPaymentList.add("50");


        //call the for loop to iterate through the array list
        for(int i = 0; i < pPriceList.size(); i++);
        {

            //navigate to mlcalc page
            driver.navigate().to("https://www.mlcalc.com");
            Thread.sleep(2000);

            //clear and enter purchase price
            try {
                System.out.println("Entering new value on purchase price");
                WebElement pPrice = driver.findElement(By.xpath("//*[@name='ma']"));
                pPrice.clear();
                pPrice.sendKeys(pPriceList.get(0));
            } catch (Exception err) {
                System.out.println("Unable to enter value on purchase price" + err);
            }//end the purchase price exception

            //clear and enter down payment
            try {
                System.out.println("Entering new value on down payment");
                WebElement dPayment = driver.findElement(By.xpath("//*[@name='dp']"));
                dPayment.clear();
                dPayment.sendKeys(dPaymentList.get(0));
            } catch (Exception err) {
                System.out.println("Unable to enter value on down payment" + err);
            }//end of down payment  exception


//clicking on calculate
            try {
                System.out.println("clicking on Calculate button ");
                driver.findElement(By.xpath("//*[@alt='Calculate']")).click();
            } catch (Exception err) {
                System.out.println("Unable to click Calculate button" + err);
            }//end of Calculate button exception

//capture and print monthly payment
            try {
                System.out.println("capturing monthly payment");
                String mntPayment = driver.findElements(By.xpath("//*[class='big']")).get(0).getText();
            System.out.println("My monthly payment is " + mntPayment);
        } catch(Exception err) {
                System.out.println("Unable to capture the monthly Payment" + err);
            }//end of monthly payment
             Thread.sleep(2500);


    }//end of for loop


    }//end of main method


}//end of java method
