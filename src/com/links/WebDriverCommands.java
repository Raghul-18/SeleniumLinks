package com.links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("\n=== OrangeHRM ===");
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("Page Source Length: " + driver.getPageSource());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demo.opencart.com/");
        System.out.println("\n=== OpenCart ===");
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("Page Source Length: " + driver.getPageSource());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://www.bing.com");
        System.out.println("\n=== Bing ===");
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("Page Source Length: " + driver.getPageSource());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.freecrm.com/");
        System.out.println("\n=== FreeCRM ===");
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("Page Source Length: " + driver.getPageSource());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://www.half.ebay.com");
        System.out.println("\n=== eBay Half ===");
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("Page Source Length: " + driver.getPageSource());
        driver.quit();
    }
}
