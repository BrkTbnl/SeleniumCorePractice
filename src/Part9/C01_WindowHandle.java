package Part9;

import Utilities.ReusableMethods;
import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C01_WindowHandle extends TestBase {
/*
    Navigate to the Facebook website.
    Store the page's window handle value in a String variable.
    Test that the page title contains "Facebook."
    Open a new tab and navigate to the eBay website.
    Test that the page title contains "Ebay."


    Return to the initially opened page and test that you have returned to the Facebook page.
     */

    @Before
    public void setUp(){

        //Navigate to facebook
        driver.get("https://www.facebook.com/");
        //if facebook have a cookies on your device use the following method
        //We will not click on the cookies accept button. we will handle with a new method

        driver.manage().deleteAllCookies();
    }

    @Test
    public void windowHandleTest() {
        //Store (assign a variable) the page's window handle value in a String variable.
        String facebookWindowHandle = driver.getWindowHandle();//returns string

        //test that the page title contains 'Facebook.'
        String ecpectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(ecpectedTitle, actualTitle);
        ReusableMethods.myWait(2);

        // open a new tab and navigate to the eBay website
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://ebay.com");
        ReusableMethods.myWait(2);
        // Test that the page title contains "Ebay"

        String expectedTitleEbay = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualTitleEbay = driver.getTitle();
        Assert.assertEquals(expectedTitleEbay, actualTitleEbay);
        // Return to the initially opened page and test that you have returned to the Facebook page.
        ReusableMethods.myWait(1);
        driver.switchTo().window(facebookWindowHandle);
        ReusableMethods.myWait(3);
        driver.quit();
    }

}
