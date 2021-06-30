import Reusable_Library.Reusable_Methods;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/*
public class yahoo_com extends Reusable_Library.Abstract_Class {

    @Test
    public void navigate() throws IOException, InterruptedException {
        //navigate to yahoo home page
        Reusable_Methods.navigate(driver,"https://www.yahoo.com","Yahoo Home Page");
        Thread.sleep(2000);


        //verify the yahoo title using soft assert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.getTitle(),"Yahoo");



        //get the count of all links in  yahoo home page
        Reusable_Methods.(driver,"//*[@class='_yb_e0gik']","Tabs From Yahoo");

        Reusable_Methods.sendkeys(driver,"//*[@id='ybar-sbq']","Nutrition","Search Bar");
        Thread.sleep(1000);
        Reusable_Methods.click(driver,"//*[@value='Search']","Search button");
        Thread.sleep(2000);


        //scroll top the bottom
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,4000)");
        Thread.sleep(2000);


        //capture the yahoo search result
        String capture = Reusable_Methods.(driver,"//*[@class='compPagination']","Search Result");
        String[]  result = capture.split("Next");
        System.out.println("my Search result is " +result);


        jse.executeScript("scroll(0,-4000)");
        Thread.sleep(2000);

        Reusable_Methods.click(driver,"//*[text()='Images']","Images");
        Thread.sleep(3000);


        Reusable_Methods.TabsCount(driver,"//*[contains(@id,'yui_3_5_1_1')]","Image count");
        Thread.sleep(2000);

        Reusable_Methods.click(driver,"//*[text()='Sign In']","Sign In");
        Thread.sleep(2000);

        Reusable_Methods.checkBoxStateSelected(driver,"//*[@for='persistent']","sign in checkbox");
        Thread.sleep(2000);

        Reusable_Methods.sendkeys(driver,"//*[@name='username']","shuvokkkkll","username");
        Thread.sleep(500);
        Reusable_Methods.click(driver,"//*[@name='signin']","Next ");
        Thread.sleep(2000);

        String msg = Reusable_Methods.getText(driver,"//*[@class='error-msg']","error msg");

        if (msg.equalsIgnoreCase("Sorry, we don't recognize this email")){
            System.out.println("error msg match as expected");
        }else{
            System.out.println("error msg didn't match as expected");
        }


        softAssert.assertAll();
    }//end of step 1



}//end of class







}


 */