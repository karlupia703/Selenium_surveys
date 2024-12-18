package base;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class FirstTest {
	
	static JavascriptExecutor jre;
	
    public static void main(String[] args) {
        ChromeDriver driver = setupWebDriver();
        
        
        try {
        //	goToSurvey(driver);
            login(driver);
           navigateToSurveyTab(driver);
   //       searchSurvey(driver);
           createNewSurvey(driver);
           createNewquestion(driver);
 //           CheckUrl(driver);
           // new comment
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
//                driver.quit();
            }
        }
    }
    private static void CheckUrl(ChromeDriver driver) {
		// TODO Auto-generated method stub
		
	}
	// Setup WebDriver with Chrome options
        private static ChromeDriver setupWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--enable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();       
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
     
  //     private static void goToSurvey(ChromeDriver driver) throws InterruptedException {
  // 	 driver.get("http://localhost:3000/surveys");
  //     Thread.sleep(2000);
  //   }
     
    // Login to the website
        private static void login(ChromeDriver driver) throws InterruptedException {
        driver.get("https://survey-building-app-develop-iymj66chvq-uc.a.run.app/?callbackUrl=https%3A%2F%2F0.0.0.0%3A8080%2Fsurveys");
        Thread.sleep(2000);            
        driver.findElement(By.xpath("/html/body/div/div/div[3]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]/div/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/button")).click(); ///html/body/div/div/button/div/span
        Thread.sleep(1000);
        // Redirect to child window
        String parentHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                break;
            }
    }
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rajni.1156@zenmonk.tech"); ///html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rajnikar@1234");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.switchTo().window(parentHandle);
        Thread.sleep(3000);
    }       
        
       
        // Navigate to the Survey tab
        private static void navigateToSurveyTab(ChromeDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/nav/a[1]/div/div[2]/span")).click();
        Thread.sleep(2000);
    }
        
        // Checking url
//            public static void CheckUrl(ChromeDriver driver) {
//        	String act_url=driver.getCurrentUrl();
//            System.out.println("Current url is -> " + act_url);
//            String desired_url="https://survey-building-app-develop-iymj66chvq-uc.a.run.app/surveys";
//            if (act_url.equals(desired_url))
//            {
//            	System.out.println("pass");
//            }
//            else {
//            	System.out.println("fail");
//            }
//
//        }
//        
              
      // Search for a survey
        private static void searchSurvey(ChromeDriver driver) throws InterruptedException {
      
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/div[1]/div/div[1]/input")).sendKeys("survey 5");
        Thread.sleep(1000);
    }
       // Create a new survey Create button
        private static void createNewSurvey(ChromeDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[1]/button")).click();
        Thread.sleep(1000);
        
       //  String surveyName = "Survey_" +Random().toString();
       int survey_id = new Random().nextInt(1000);
        driver.findElement(By.xpath("//*[@id=\":r1p:\"]")).sendKeys("Survey " + survey_id);
        Thread.sleep(2000);
        
        
        //Enter  abbreviation
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input")).sendKeys("S" + survey_id);
		 Thread.sleep(1000);
		 
		 //Click on type of survey
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/div")).click();
	     Thread.sleep(1000);
		 
		 //Select type of survey
		   driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[2]/span[1]")).click();
		   Thread.sleep(1000);
		 
		 //Click Modality
		   driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[4]/div/div/div")).click();
		   Thread.sleep(1000);
		 
		 //Select Modality -  in person
	       driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[1]")).click();
	       Thread.sleep(1000);

	       //click on body
	       driver.findElement(By.tagName("body")).click();
	       
	     // Click Language
	      driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[5]/div/div/div")).click();
	       Thread.sleep(1000);
		 
	      // select Language
	      driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[1]")).click();
	       Thread.sleep(1000);
	       
//	       
//	       // click on toggle icon
//	       boolean isMandatory = new Random().nextBoolean();
//	       
//	       // printing isMandatory value
//	       System.out.println(isMandatory);
//	       
//	       if(isMandatory) {
//	       driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div[6]/label/span[1]/span[1]/input")).click();	
//	       Thread.sleep(1000);
//	       }
	     
	       
	      // click on create button
	      driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();
	      Thread.sleep(2000);
        }	  
        
        
       // create version
        
	      
	       private static Object Random() {
		// TODO Auto-generated method stub
		return null;
	}
		// Click on Question tab
	       
	        private static void createNewquestion(ChromeDriver driver) throws InterruptedException {
	        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/nav/a[2]/div/div[2]/span")).click();
	        Thread.sleep(2000);
	        
	        //click on Create button 
	        
	        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/button")).click();
	        Thread.sleep(2000);
	      
	        //click on type of question
	        driver.findElement(By.xpath("//*[@id=\"demo-simple-select\"]")).click();
	        Thread.sleep(1000);
	      
	        //select question type
	        driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[2]/p")).click();
	        Thread.sleep(1000);
	        
	        //enter question
	        int question_id = new Random().nextInt(1000);
	        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("Q" + question_id);
	        Thread.sleep(1000);
	        
	        
	        //enter description
	        int question_description = new Random().nextInt(1000);
	        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/form/div/div[3]/div/div/textarea[1]")).sendKeys("Questiontesting" + question_description);
	        Thread.sleep(1000);
	        
	        //click on create button
	        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button[2]")).click();
	        Thread.sleep(1000);
	     
	        // click on pagination 
	        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div")).click();
	        driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
            jre = (JavascriptExecutor)driver;
	        jre.executeScript("scroll (100,1000)");
	        
	 
	        
    }
}



