package package2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPopus {

    @Test
    public void TestPopups() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

 
        driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Alert')]")).click(); 
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000); 
        alert.accept(); 
        String result = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result);
        Assert.assertEquals(result, "You successfully clicked an alert");
        Thread.sleep(2000);  

        driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Confirm')]")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000); 
        alert2.dismiss(); 
        String result2 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result2);
        Assert.assertEquals(result2, "You clicked: Cancel");
        Thread.sleep(2000);  

        driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Prompt')]")).click();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(2000);  
        alert3.sendKeys("This is a test input"); 
        alert3.accept(); 
        String result3 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result3);
        Assert.assertEquals(result3, "You entered: This is a test input");
        Thread.sleep(2000);

        driver.quit();
    }
}
