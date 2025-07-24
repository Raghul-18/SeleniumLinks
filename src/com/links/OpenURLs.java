package com.links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenURLs {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demo.opencart.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://www.bing.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.freecrm.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://www.half.ebay.com");

    }
}
