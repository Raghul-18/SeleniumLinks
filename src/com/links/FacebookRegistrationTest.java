package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookRegistrationTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://m.facebook.com/reg/");
    }

    @Test
    public void testRegistration() {
        WebElement firstNameField = driver.findElement(By.name("firstname"));
        firstNameField.sendKeys("John");

        WebElement lastNameField = driver.findElement(By.name("lastname"));
        lastNameField.sendKeys("Doe");

        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByIndex(24); 
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByValue("7");
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByVisibleText("2025"); 
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/input"));
        maleRadioButton.click();

    }
}
