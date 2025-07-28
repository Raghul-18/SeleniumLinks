package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EasyCalculationAutomation {

    WebDriver driver;

    @Test
    public void easyCalculationTest() {
        driver = new ChromeDriver();
        driver.get("https://www.easycalculation.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("googleSearchId")).sendKeys("Chennai");

        driver.findElement(By.cssSelector(".search_button")).click();

        driver.switchTo().frame("googleSearchFrame");

        WebElement firstLink = driver.findElement(By.cssSelector(".gsc-result .gs-title a"));
        firstLink.click();

    }
}
