package Testcases;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Reinstatement {

	
		public static WebDriver driver;
	//	private static Object random;
	//	public static Object choice;	
		
		@BeforeTest
		public void start() {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:3000/reinstatement-responsibles");
		}		
			
			@Test(priority = 1)
			 public static void login()throws InterruptedException {
			 
			 driver.findElement(By.cssSelector("[data-test-id=button-responsibleform-create]")).click();
			 Thread.sleep(1000);
		
		    driver.findElement(By.cssSelector("[data-test-id=\"linktxt-sidebar-reinstatement-responsibles\"]")).click();
		    Thread.sleep(1000);
		    
		    
		    
			 
				  
				 
			}
			
			
			
			
		

}
