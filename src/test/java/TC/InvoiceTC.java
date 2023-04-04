package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvoiceTC {
    ChromeOptions ops= new ChromeOptions();
    WebDriver driver;
    
    @BeforeMethod
    public void logIn() {
        // Set up the driver
    	ops.addArguments("--remote-allow-origins=*");
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver(ops);
        driver.get("http://www.google.com");
    }
    
    @AfterMethod
    public void tearDown() {
        // Quit the driver
        driver.quit();
    }
    
    @Test
    public void testTitle() {
        // Verify the page title
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    
//    @Test
//    public void testLogo() {
//        // Verify the presence of a logo image
//        WebElement logo = driver.findElement(By.id("/html/body/div[1]/div[2]/div/img"));
//        Assert.assertNotNull(logo);
//    }
}