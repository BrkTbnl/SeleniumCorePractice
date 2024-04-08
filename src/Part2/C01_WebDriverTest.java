package Part2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C01_WebDriverTest {
    public static void main(String[] args) {
        // driver.get("") method takes the driver to the desired url.
        // 1st step navigatre to ebay

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://facebook.com");

        //navigate to with edge, internet explorer, firefox
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://ebay.com");

        WebDriver InternetExplorerDriver = new InternetExplorerDriver();
        InternetExplorerDriver.get("https://ebay.com");

        //returns url information of the visited web page.
        System.out.println(chromeDriver.getCurrentUrl());
        //returns the title informatiuon of the visited web page.
        System.out.println(chromeDriver.getTitle());

        //for closing driver
        //chromeDriver.close();
        //if multiple windows have been opened during the test
        chromeDriver.quit();
    }
}
