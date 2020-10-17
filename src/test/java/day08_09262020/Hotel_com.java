package day08_09262020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Hotel_com {
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


        ArrayList<String> location  = new ArrayList<>();
        location.add("New York");
        location.add("Miami");
        location.add("Los Angeles");

        ArrayList<String> checkIn  = new ArrayList<>();
        checkIn.add("09/28/20");
        checkIn.add("09/29/20");
        checkIn.add("09/30/20");


        ArrayList<String> checkOut  = new ArrayList<>();
        checkOut.add("10/15/20");
        checkOut.add("10/16/20");
        checkOut.add("10/17/20");

        ArrayList<String> rooms  = new ArrayList<>();
        rooms.add("1");
        rooms.add("2");
        rooms.add("3");

        ArrayList<String> adults  = new ArrayList<>();

        adults.add("1");
        adults.add("2");
        adults.add("3");


//navigate.hotel.com
   /*    driver.navigate().to("https:www.hotels.com");
        Thread.sleep(2000);
         for(int i =0; i< location.size(); i++) {
             try{
                 WebElement searchField = driver.findElement(By.xpath("//*[@name=]"))
         }





//set driver.findelement searhfield
        WebElement searchfield =*/



    }//end pof main method





}//end of java class
