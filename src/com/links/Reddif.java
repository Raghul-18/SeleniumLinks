package package2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Reddif {

    @Test
    public void TestPopups() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(5000);
        
        Alert alert = driver.switchTo().alert();
        String firstAlertText = alert.getText();
        System.out.println(firstAlertText);
        
        alert.accept();
        
        driver.findElement(By.id("login1")).sendKeys("valid_username_here");
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(5000);
        
        alert = driver.switchTo().alert();
        String secondAlertText = alert.getText();
        System.out.println(secondAlertText);
        
        Assert.assertEquals(firstAlertText, secondAlertText, "The alert messages are not the same");
        
        if (firstAlertText.equals(secondAlertText)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        alert.accept();
        
        driver.quit();
    }
}
