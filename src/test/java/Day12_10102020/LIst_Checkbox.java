package Day12_10102020;


import Reusable_Library.Reusable_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class LIst_Checkbox {

    @Test
    public void verifications() throws InterruptedException {


        WebDriver driver = Reusable_Methods.getDriver();
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2000);
        List<WebElement> linkCount = driver.findElements(By.xpath("//*[@class='_yb_5coqv']"));

        //print of the link count
        System.out.println("Link count" + linkCount.size());

//click on sign button
        Reusable_Methods.click(driver, "//*[@class='_yb_687jt']", "sign in button");
        Thread.sleep(2000);

        boolean checkboxState = driver.findElement(By.xpath("//*[@id='persistent']")).isSelected();
//expecting the checkbox to be selected
        if (checkboxState == true) {
            System.out.println("Checkbox is selected as expected");
        } else {
            System.out.println("Checkbox is not selected by default");


        }//end of if else


    }


}//end of java class
