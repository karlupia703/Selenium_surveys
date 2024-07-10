package dataprovider_repository;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Multipledata {

	public static WebDriver driver;
	static SoftAssert softassert = new SoftAssert();
	
	@Test(priority =1,dataProvider = "NinjaData", dataProviderClass = Data.class)
	
  public static void longintest(String username,String password) {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://tutorialsninja.com/demo");
    driver.findElement(By.linkText("My Account")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("input-email")).sendKeys("username");
    driver.findElement(By.id("input-password")).sendKeys("password");
    softassert.assertTrue(driver.findElement(By.cssSelector("input.btn.btn-primary")).isDisplayed());
    softassert.assertAll();
    driver.quit();
    
    
	}
	
	@Test(priority =2, dataProvider = "rediffData", dataProviderClass = Data.class)
	
 public static void redifflogintest(String username,String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("username");
	    driver.findElement(By.id("password")).sendKeys("password");
	    driver.findElement(By.cssSelector("input.signinbtn")).click();
	    softassert.assertTrue(driver.findElement(By.cssSelector("a.rd_logout")).isDisplayed());
	    softassert.assertAll();
	    driver.quit();
	    
	}
	
}





