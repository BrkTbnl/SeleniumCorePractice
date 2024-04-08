package Part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class C01_Webdriver {
    public static void main(String[] args) {
        // a web driver is an interface used to in web automation
        // we can create browsers object from webdriver
        WebDriver chromeDriver = new ChromeDriver();
        // The first approach : Navigate to url
        chromeDriver.get("https://www.ebay.com");

    }
}
