package base;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class MyFirstclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		
		
		
        // to delete all cookies 
	//	driver.manage().deleteAllCookies();
		
		
		// To set the size of window
//		Dimension d = new Dimension(400,400);
//		driver.manage().window().setSize(d);
//		Thread.sleep(1000);
		
		
		//To set the position of window
//	    Point p = new Point(250,250);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(2000);
		
		
    	// To maximize the window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://app.iskedo.com/");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div[1]/div/input")).sendKeys("7814415480");
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div[2]/input")).sendKeys("1111");
		Thread.sleep(2000);
		
		
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[2]/input[1]")).click();
	      Thread.sleep(2000);

	        // Select profile
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div/div[1]/div/div[1]/div")).click();
	        Thread.sleep(2000);

	        // Proceed with the profile
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div/div[2]/input")).click();
	        Thread.sleep(2000);

	        // Select location
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div/div[1]/div/div[1]/div")).click();

	        // Proceed with the location
	      driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div/div[2]/input")).click();
	     Thread.sleep(3000);

	
		  //Dashboard
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/aside/div/a[1]")).click();
		Thread.sleep(2000);
		//last 15 days
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/section/div/div[2]/div[1]/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		//last month
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/section/div/div[2]/div[1]/div[2]/div/button[3]")).click();
		Thread.sleep(2000);
		
		
		//availability
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/aside/div/a[3]/span")).click();
		Thread.sleep(2000);
		
    	//unavailability tab 
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div/nav/div/button[2]")).click();
		Thread.sleep(2000);
		
		//view Unavailability (Arrow)
	//	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div/div/div[1]/div/div/div/h2/button")).click();
	//	Thread.sleep(5000);
		
		//close unavailability tab
	//	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div/div/div[1]/div/div/div/h2/button")).click();
	//	Thread.sleep(2000);

		
	//	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/aside/div/a[4]")).click();
	//	Thread.sleep(2000);
		
		// click on Appointment tab
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/aside/div/a[2]")).click();
		Thread.sleep(1000);
		
		//click on calendar icon
		driver.findElement(By.xpath("")).click();
		Thread.sleep(1000);
		
		//click on + icon
		driver.findElement(By.xpath("")).click();
		Thread.sleep(1000);		
		
		//click on Client Name
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div/div[2]/div/svg")).click();
		Thread.sleep(1000);
		
	
		
		
		
		
		
				
	
		
		
	}

}
