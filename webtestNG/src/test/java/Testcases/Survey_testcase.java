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
public class Survey_testcase {
		
	public static WebDriver driver;
	private static Object random;
	public static Object choice;	
	
	@BeforeTest
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/surveys");
	}
	
	
    @Test(priority = 1)
    public static void login()throws InterruptedException {
	  driver.get("http://localhost:3000/?callbackUrl=http%3A%2F%2F0.0.0.0%3A3000%2Fsurveys%2Fcb0d5f31-dd3d-40a9-991d-02bada856a8f");
	  Thread.sleep(2000);
	 
	  // click on dropdown of language select
	  driver.findElement(By.xpath("/html/body/div/div/div[3]/div")).click();
	  Thread.sleep(1000);
		
	  driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]/div/span")).click();
	  Thread.sleep(1000);
		
	  //click on email field
	  driver.findElement(By.xpath("/html/body/div/div/button/div/span")).click();
	  Thread.sleep(1000);

	  // Redirect to child window
	   Set <String> windows = driver.getWindowHandles();
	   Iterator <String> it = windows.iterator();
	   String p = it.next();
	   String c = it.next();
	   driver.switchTo().window(c);
	   Thread.sleep(3000);    
	    		   
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rajni.1156@zenmonk.tech");
	   driver.findElement(By.xpath("//span[text()='Next']")).click();
	   Thread.sleep(3000);
	    
	   //enter password
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rajnikar2022");
	   Thread.sleep(3000);
	     
	   //Click on next button
	   driver.findElement(By.xpath("//span[text()='Next']")).click();
	   Thread.sleep(7000);
		
	   //redirect to parent window
	   driver.switchTo().window(p);
	   Thread.sleep(3000);
	      
	   // click on survey tab
	  // driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/nav/a[1]/div/div[2]/span")).click();
	  // Thread.sleep(2000);
 }
	 
	 
	@Test(priority = 2,enabled = true)
    public static void landingPage() {
	System.out.println(driver.getCurrentUrl());
	String currentURL = "http://localhost:3000/surveys";
	
	if(currentURL.equals("http://localhost:3000/surveys")){
	System.out.println("Test Case Landing page is PASS");
	
	}else {
		System.out.println("Test Case Landing page is FAIL");
	}
}
	

	//Create survey
     @Test(priority = 3, enabled = true)
     public static void CreateSurvey() throws InterruptedException {
	
	driver.findElement(By.cssSelector("[data-test-id=\"btn-open-create-survey-dialog\"]")).click();
	
	//click on create survey button inside
	driver.findElement(By.cssSelector("[data-test-id=\"btn-create-survey\"]")).click();
	Thread.sleep(1000);
	
	int survey_id = new Random().nextInt(1000);
    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input")).sendKeys("Survey12" + survey_id);
	driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Sur"+ survey_id);
	
   	WebElement dropdownButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/div"));
    dropdownButton.click();
    // Wait for the options to be visible
    //driver.findElements(By.cssSelector("[role='combobox']"));
    List<WebElement> options = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul/li[1]"));   // Generate a random index to select one of the options
    Random random = new Random();
    int randomIndex = random.nextInt(options.size());
    options.get(randomIndex).click();
				
	  //click on modality    
      WebElement dropdownButton1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[4]/div/div/div"));
      dropdownButton1.click();
      // Wait for the options to be visible
      List<WebElement> options1 = driver.findElements(By.cssSelector("[role='listbox']"));
      // Generate a random index to select one of the options
      Random random1 = new Random();
      int randomIndex1 = random1.nextInt(options1.size());
      options1.get(randomIndex1).click();
			
      //click on body
      driver.findElement(By.tagName("body")).click();
      
	  //select language (Random function )
      WebElement dropdownButton2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[5]/div/div/div"));
      dropdownButton2.click();
      
      // Wait for the options to be visible
      List<WebElement> options2 = driver.findElements(By.cssSelector("[role='listbox']"));
      
      // Generate a random index to select one of the options
      Random random2 = new Random();
      int randomIndex2 = random2.nextInt(options2.size());
      options2.get(randomIndex2).click();
		 
	  //click on create button
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();   
	  Thread.sleep(1000); 
	  
      // Select the verison
      driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div/div[1]/div/span")).click();
      Thread.sleep(1000);
      
      //click on continue
      driver.findElement(By.cssSelector("[data-test-id='btn-continue-select-create-option']")).click();
      
      //enter verison name
      int version_id = new Random().nextInt(1000);
      driver.findElement(By.cssSelector("[data-test-id=\"input-create-version-name\"]")).sendKeys("Version" + version_id);
      driver.findElement(By.cssSelector("[data-test-id=\"input-create-version-abbreviation\"]")).sendKeys("Ver" + version_id);
      
      // click on toggle icon
    boolean isMandatory1 = new Random().nextBoolean();
    // printing isMandatory value
    System.out.println(isMandatory1);
    if(isMandatory1) {
	 driver.findElement(By.cssSelector("[data-test-id=\"input-create-survey-version-mandatory\"]")).click();		
    }
   
      //click on accept button 
      driver.findElement(By.cssSelector("[data-test-id=\"btn-create-survey-version\"]")).click();
    
    }
      
     // create again same survey
     @Test(priority = 4, enabled = true)
     public static void AllReadyExist() throws InterruptedException {
    	
    // shift to survey navigation  	 
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/button[1]")).click();
    Thread.sleep(3000);
    	 
    	 
    //click on create button   	 
     driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[1]/button")).click();
     Thread.sleep(3000);
 

     //click on Survey name
      driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input")).sendKeys("Surveyy124");
      Thread.sleep(1000);
     
     //click on abbreviation
      driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Sur1256");
     Thread.sleep(1000);
     
     //select type of survey
     driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/div")).click();
 	 driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[1]")).click(); 
 	Thread.sleep(1000);
 	
 	 //select the modified
     driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[4]/div/div/div")).click();
 	 driver.findElement(By.cssSelector("[role='listbox']")).click();
 	 
 	//click on body
     driver.findElement(By.tagName("body")).click();
      
    //select language	
 	driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[5]/div/div/div")).click();
 	driver.findElement(By.cssSelector("[role='listbox']")).click();
 	Thread.sleep(1000);
 	
 	//select toggle icon
    //	driver.findElement(By.xpath("html/body/div[3]/div[3]/div/div[2]/div/div/div[6]/label/span[1]/span[1]/input")).click();
 	
 	//click on create button
	driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();   
	Thread.sleep(1000);
    }
    
           
    
    //Check filter
    @Test(priority = 5,enabled = false)
    public static void Searchfilter() throws InterruptedException {
    
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div[1]/div/div[1]/input")).sendKeys("Survey12263");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("button[aria-label=\"Clear\"] svg")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div[1]/div/div[1]/input")).sendKeys("invalid data");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("button[aria-label=\"Clear\"] svg")).click();
    Thread.sleep(2000);
    //click on type filter
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div[1]/div/div[2]/div[1]/div")).click();
    driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/p")).click();
    //click on cross icon
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div[1]/div/div[2]/div[1]/button")).click();
  
    // click on abbreviation
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div[1]/div/div[2]/div[2]/span/p")).click();
    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/ul/li[2]")).click();
    
    }
   
//	  //Question Tab
//	 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/a[2]/div[1]/div[2]/span[1]")).click();
//	 Thread.sleep(1000); 
//	 
//	 //again click on Surveys Tab
//	 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/a[1]/div[1]/div[2]/span[1]")).click();
//	 Thread.sleep(1000);
    
    
    

private static String Random() {
	// TODO Auto-generated method stub
	return null;
}
	
}