package package2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class OnlyTesting {

    @Test
    public void testFormSubmission() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");

        driver.findElement(By.name("FirstName")).sendKeys("John");
        driver.findElement(By.name("LastName")).sendKeys("Doe");
        driver.findElement(By.name("EmailID")).sendKeys("john.doe@example.com");
        driver.findElement(By.name("MobNo")).sendKeys("1234567890");
        driver.findElement(By.name("Company")).sendKeys("Oracle");

        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitButton.click();

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Message: " + alert.getText());
        alert.accept();

        driver.quit();
    }
}
