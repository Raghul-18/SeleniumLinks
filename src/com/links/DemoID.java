package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoID {

    WebDriver driver;

    @Test
    public void signUpTest() {
        driver = new ChromeDriver();
        driver.get("https://www.hollandandbarrett.com/auth/signup");
        driver.manage().window().maximize();

        driver.findElement(By.id("firstName")).sendKeys("Raghul");
        driver.findElement(By.name("lastName")).sendKeys("S P");
        driver.findElement(By.id("email")).sendKeys("example@mail.com");
        driver.findElement(By.id("confirmEmail")).sendKeys("example@mail.com");
        driver.findElement(By.id("password")).sendKeys("MyPassword123");
        driver.findElement(By.className("TermsAndConditions-module_checkboxField__WCh5C")).click();
        driver.findElement(By.xpath("//a[text()='Privacy notice']")).click();
        driver.findElement(By.cssSelector(".Button-module_button__Kt3S-")).click();
        
    }
}
