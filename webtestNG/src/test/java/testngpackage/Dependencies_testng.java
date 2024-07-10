package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependencies_testng {
	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();
	
	@BeforeTest
    public void start() {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://tutorialsninja.com/demo");
    	
    	driver.findElement(By.linkText("My Account")).click();
    	driver.findElement(By.linkText("Login")).click();
    	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
    	driver.findElement(By.id("input=password")).sendKeys("Selenium@123");
    	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    	softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
    	softassert.assertAll();
    	driver.quit();
    	
    }      
	}

