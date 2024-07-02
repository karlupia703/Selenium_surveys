package testngpackage;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifytitletest {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		       // Set up Chrome options to allow notifications
			
			//for(int i=1;i<3;i--)
			//{
			
			
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--enable-notifications");
	        Thread.sleep(1000);
	        // Pass the options to the ChromeDriver
	        ChromeDriver driver = new ChromeDriver(options);
	        Actions actions = new Actions(driver);
			driver.get("https://app.iskedo.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div[1]/input")).sendKeys("7814415480");
			Thread.sleep(5000);
				
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div[2]/input")).sendKeys("1111");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/input")).click();
			Thread.sleep(5000);
		
			//appointment
			driver.findElement(By.xpath("/html/body/div/div/div/div[1]/aside/div/a[2]/span")).click();
			Thread.sleep(5000);
	        //Dashboard
			driver.findElement(By.xpath("/html/body/div/div/div/div[1]/aside/div/a[1]")).click();
			Thread.sleep(8000);
			//last 15 days
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/section/div/div[2]/div[1]/div[2]/div/button[2]")).click();
			Thread.sleep(5000);
			
			//last month
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/section/div/div[2]/div[1]/div[2]/div/button[3]")).click();
			Thread.sleep(5000);
			
			//select branch filter
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/section/div/div[1]/div/select")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/section/div/div[1]/div/select/option[3]")).click();
			Thread.sleep(5000);
			
			//availability
			driver.findElement(By.xpath("/html/body/div/div/div/div[1]/aside/div/a[3]/span")).click();
			Thread.sleep(5000);
			
			//unavailability
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/section/div/nav/div/button[2]")).click();
			Thread.sleep(5000);
			//view Unavailability
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/section/div/div/div[1]/div[1]/div/div/h2/button")).click();
			Thread.sleep(5000);
			//close
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/section/div/div/div[1]/div[1]/div/div/h2/button")).click();
			Thread.sleep(5000);
			
			
			
			
		}
		}