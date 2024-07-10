package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_concepts {
 public static WebDriver driver;
 
 @BeforeTest
 public void start() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.mycarhelpline.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
 
 @Test(priority = 1)
 public void landingPage() {
	 System.out.println(driver.getCurrentUrl());
	 String CurrentURL = "https://www.mycarhelpline.com/";
	 
	 
	 if(CurrentURL.equals("https://www.mycarhelpline.com/")){
	 		System.out.println("Test Case Landing page is PASS");
 } else {
	 System.out.println("Test Case landing page is FAIL");
 }
	 Assert.fail("Deliberately Failing");
 }

// always run == not skip, dependsOnMethods means = depend on another method, enable = false means disable
@Test(priority = 2, enabled = true, dependsOnMethods ="landingPage", alwaysRun = true)
public void Calculator() {
	driver.findElement(By.linkText("Calculator")).click();
}


@Test(priority = 3, enabled = true,dependsOnMethods = {"landingPage","Calculator"}, alwaysRun = true)
 
public void ReturntoHomePage() {
	driver.findElement(By.linkText("Home")).click();
	
	
	
	
	
	
}



}


