package base;
import java.util.Random;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class New {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		
	   
		ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--enable-notifications");
        Thread.sleep(1000);
		
		ChromeDriver driver = new ChromeDriver();
		 Actions actions = new Actions(driver);
		 Random random = new Random();
		 
		// To maximize the window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// go to website
		driver.get("https://survey-building-app-develop-iymj66chvq-uc.a.run.app/?callbackUrl=https%3A%2F%2F0.0.0.0%3A8080%2Fsurveys");
		Thread.sleep(2000);
		
		// click on dropdown of language select
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]/div/span")).click();
		Thread.sleep(1000);
		
		//click on email field
	    driver.findElement(By.xpath("/html/body/div/div/button")).click();
	    Thread.sleep(1000);

	    // Redirect to child window
	    Set <String> windows = driver.getWindowHandles();
	    Iterator <String> it = windows.iterator();
	    String p = it.next();
	    String c = it.next();
	    driver.switchTo().window(c);
	    Thread.sleep(3000);    
	    
	        
	   //chrome pop xpath
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rajni.1156@zenmonk.tech");
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    Thread.sleep(3000);
	    
	     //enter password
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rajnikar@1234");
	     Thread.sleep(3000);
	     
		 //Click on next button
	     driver.findElement(By.xpath("//span[text()='Next']")).click();
	     Thread.sleep(7000);
		
	     //redirect to parent window
	      driver.switchTo().window(p);
	      Thread.sleep(3000);
	     
	  	     
	     // click on survey tab
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/nav/a[1]/div/div[2]/span")).click();
	     Thread.sleep(2000);
	     
//	     // click on Question tab
//	      driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/nav/a[2]/div/div[2]/span")).click();
//		  Thread.sleep(2000);
//	     
//		//click on survey tab
	//   driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/nav/a[1]/div/div[2]/span")).click();
//		   Thread.sleep(4000);
		  
		   
		   
// Try to search survey
//	       
//	       // click on survey search box
//	       driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div[1]/div/div[1]/input")).sendKeys("survey 5");
//	       Thread.sleep(1000);
	       
	        // click on cross icon
	   //   driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div[1]/div/div[1]/div[2]/button")).click ();
	      
	
//	      Actions act = new Actions(driver);
//	      WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div[1]/div/div[1]/div[2]/button")); 
//	      act.doubleClick(ele).perform();
//	       
//	      Thread.sleep(1000);
//		   
		         
	     
	 
	     //click on Create survey button
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[1]/button")).click();
	     Thread.sleep(1000);
	     
	     
	 //    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input")).sendKeys("Survey1 ");
	     
	     // enter survey name
	     int survey_id = (int)Math.floor(1000*Math.random());
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input")).sendKeys("Survey " + survey_id);
//         Thread.sleep(2000);
//		 
		 //enter  abbreviation
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input")).sendKeys("S" + survey_id);
		 Thread.sleep(1000);
		 
		 //click on type of survey
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/div")).click();
	     Thread.sleep(1000);
		 
		 // select type of survey
		   driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[1]")).click();
		   Thread.sleep(1000);
		 
		 // Click Modality
		   driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[4]/div/div/div")).click();
		   Thread.sleep(1000);
		 
		 
		 // select Modality -  in person
	       driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[1]")).click();
	       Thread.sleep(1000);
	             
	    // select Modality -virtual
	       driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[2]")).click();
	       Thread.sleep(1000);
	    // Click Language
	      driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[5]/div/div/div")).click();
	       Thread.sleep(1000);
		 
	      // select Language
	      driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[3]")).click();
	       Thread.sleep(1000);
	       
	       
	       // click on toggle icon
	
	       boolean isMandatory = random.nextBoolean();
	       
	       // printing isMandatory value
	       System.out.println(isMandatory);
	       
	       if(isMandatory) {
	    	   driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div[6]/label/span[1]/span[1]/input")).click();	
	    	   Thread.sleep(1000);
	       }
	     
	    
	       // click on create button
	    //   driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button[2]")).click();
	   //     Thread.sleep(2000);

	       
	       // try to bouble click 
	        Actions act1 = new Actions(driver);
		      WebElement ele1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button[2]")); 
		      act1.doubleClick(ele1).perform();
		       
		      Thread.sleep(1000);
			   
	      
	      
	       
	       
	       
	       
	       
	       
	}

}
