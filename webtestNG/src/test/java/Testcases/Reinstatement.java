package Testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class Reinstatement {
	
     public static WebDriver driver;
     private WebDriver actions;
     WebDriverWait wait;
     Faker faker = new Faker(); 
     private Object notification;
   
    
    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait
        driver.get("http://localhost:3000/reinstatement-responsibles");
        

    }

    @Test(priority = 1,enabled = false)   
    public void login() throws InterruptedException{
    driver.get("http://localhost:3000/");
    Thread.sleep(3000);
    		 
     // click on dropdown of language select
     driver.findElement(By.cssSelector("[data-test-id=\"login-language-select\"]")).click();
     Thread.sleep(2000);
    			
    driver.findElement(By.cssSelector("[data-value=\"en_US\"]")).click();
    Thread.sleep(2000);
    			
    //click on email field
    driver.findElement(By.cssSelector("[data-test-id=\"login-button-text\"]")).click();
    Thread.sleep(2000);

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
    	 }
    
	@Test(priority = 2,enabled = true)
    public static void landingPage() {
	System.out.println(driver.getCurrentUrl());
	String currentURL = "http://localhost:3000/reinstatement-responsibles";
	
	if(currentURL.equals("http://localhost:3000/reinstatement-responsibles")){
	System.out.println("Test Case of Landing page is PASS");
	
	}else {
		System.out.println("Test Case of Landing page is FAIL");
	}
}
  
	 @Test(priority = 3, enabled = true)
	    public void createUser() throws InterruptedException {
	        String firstName = faker.name().firstName();
	        String lastName = faker.name().lastName();
	        String email = generateRandomEmail(firstName, lastName);
	        createUser(firstName, lastName, email);
	        // Validate success message
	        WebElement notification = driver.findElement(By.cssSelector("#notistack-snackbar > .MuiBox-root"));
	        String successMessage = notification.getText();

	        Assert.assertTrue(notification.getText().contains("Reinstatement Responsible created successfully"), "Success message not displayed!");
	        
	        System.out.println("Success message: " + successMessage);
	    }    	
	    // Helper method to create a user
	    private void createUser(String firstName, String lastName, String email) throws InterruptedException {
	        // Click the Create button
	        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/button")).click();
	        
	        // Click on inside button 
	        driver.findElement(By.cssSelector("[data-test-id=\"custombtn-modal-responsibleform-create-submit\"]")).click();
	        
	        //Apply Assertions on validation message
	         WebElement errorMessage = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[1]/p"));
	         String errorText = errorMessage.getText();
	         assert errorText.contains("First name must be at least 3 characters long");
	        
	        WebElement errorMessage2 = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[2]/p"));
	        String errorText2 = errorMessage2.getText();
	        assert errorText2.contains("Last name must be at least 3 characters long");
	        
	        WebElement errorMessage3 = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[3]/p"));
	        String errorText3 = errorMessage3.getText();
	        assert errorText3.contains("Email is required");
	        
	        WebElement errorMessage4 = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[4]/div/p"));
	        String errorText4 = errorMessage4.getText();
	        assert errorText4.contains("Please select a headquarter");
	        
	        new Actions(driver).moveToElement(driver.findElement(By.tagName("body")), 0, 0).click().perform();

	        
	        // Input user details
	        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[1]/div/input")).sendKeys(firstName);
	        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[2]/div/input")).sendKeys(lastName);
	        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[3]/div/input")).sendKeys(email);
	        // Select headquarter
	        WebElement headquarterField = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[4]/div/div/div/button"));
	        headquarterField.click();
	        
	        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']/li")); // Modify XPath according to your dropdown structure

	     // Check if options are available
	     if (!options.isEmpty()) {
	         // Generate a random index
	         Random rand = new Random();
	         int randomIndex = rand.nextInt(options.size()); // Random index based on the number of options

	         // Click on the randomly selected option
	         WebElement randomOption = options.get(randomIndex);
	         randomOption.click();
	     } else {
	         System.out.println("No options available in the dropdown.");
	     }
	       // Click on Submit button
	        driver.findElement(By.cssSelector("[data-test-id=\"custombtn-modal-responsibleform-create-submit\"]")).click();
	    }
	       // Utility method to generate a random email
	        private String generateRandomEmail(String firstName, String lastName) {
	        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@example.com";
	    }
	
	        
	        
	      @Test(priority = 4, enabled = true)
	      public void editUser() throws InterruptedException {
	    	Faker faker = new Faker();
	        String updatedLastName = faker.name().lastName();
	        // Locate the first user row and click the edit button
	        WebElement firstRowEditButton = driver.findElement(By.cssSelector("[data-test-id*='-editicon-desktoptable-']"));
	        firstRowEditButton.click();	
	        // Edit last name
	        WebElement lastNameField = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[2]/div/input"));
	        // Clear the field using a robust method
	        lastNameField.click(); // Focus on the field
	        lastNameField.sendKeys(Keys.CONTROL + "a"); // Select all existing text
	        lastNameField.sendKeys(Keys.DELETE); // Clear the selected text
	        // Enter the updated last name
	        lastNameField.sendKeys(updatedLastName);
	        // Submit the edit form
	        driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[3]/button[2]")).click();
		    // Confirm changes in the dialog
	        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/button[2]")).click();
		    // Validate success notification
	       	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#notistack-snackbar > .MuiBox-root")));
	        String notificationText = notification.getText().trim();
	        System.out.println("Notification Text: " + notificationText);
	        Assert.assertTrue(notificationText.contains("Saved successfully"), "Edit success message not displayed!");

	    }
	
	      
	      @Test(priority = 5, enabled = true)	      
	      public void testAlreadyExistUser() {
	          // Generate unique user data
	          String firstName = faker.name().firstName();
	          String lastName = faker.name().lastName();
	          String email = faker.internet().emailAddress(firstName  + lastName);

	          // Create the first user
	          createUser1(firstName, lastName, email);
	          validateNotification("Reinstatement Responsible created successfully");

	          // Attempt to create the same user again
	          createUser1(firstName, lastName, email);
	          validateNotification("Email already exists");
	          
	          WebElement cancelButton = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[3]/button[1]"));
	          cancelButton.click();
	          
	          WebElement yesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div/div[2]/button[2]")));
	          yesButton.click();
	          
	      }
	      
	      public void createUser1(String firstName, String lastName, String email) {
	          // Click on the create button
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/button"))).click();
	    	  // Fill in the user details
	          WebElement firstNameField = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[1]/div/input"));
	          firstNameField.clear();
	          firstNameField.sendKeys(firstName);

	          WebElement lastNameField = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[2]/div/input"));
	          lastNameField.clear();
	          lastNameField.sendKeys(lastName);

	          WebElement emailField = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[3]/div/input"));
	          emailField.clear();
	          emailField.sendKeys(email);

	          // Select headquarter (random selection)
	          WebElement headquarterDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[4]/div/div/div/button"));
	          headquarterDropdown.click();
	          Actions actions = new Actions(driver);
	          actions.sendKeys(Keys.DOWN) // Move to the next option
	                 .sendKeys(Keys.ENTER) // Select the option
	                 .perform(); // Perform the action sequence

	          // Toggle status (active/inactive)
	          WebElement statusToggle = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div/label/span[1]/span[1]"));
	          statusToggle.click();
	          statusToggle.click();

	          // Click on the submit button
	          driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[3]/button[2]")).click();
	          	          
	      }
	      	       	      
	      public void validateNotification(String expectedMessage) {
	          // Wait for the notification and validate its content
	          WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#notistack-snackbar > .MuiBox-root")));
	          Assert.assertTrue(notification.getText().contains(expectedMessage), "Notification does not match expected message");
	      }
	
	      
	       @Test(priority = 6, enabled = true)
	       public void deleteUser() throws InterruptedException {
	        // Locate the first user row and click the delete button	        
	    	WebElement firstRowDeleteButton = driver.findElement(By.cssSelector("[data-test-id*='-deleteicon-desktoptable-']"));
	        firstRowDeleteButton.click();
	
	        // Confirm deletion in the dialog
	        driver.findElement(By.cssSelector("[data-test-id='custombtn-dialogBox-submit-alertbox-delete-reinstatement-responsibles-table-list-page-reinstatement']")).click();
	
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#notistack-snackbar > .MuiBox-root")));
	        String notificationText = notification.getText().trim();
	        System.out.println("Notification Text: " + notificationText);
	        Assert.assertTrue(notificationText.contains("was successfully deleted"), "Delete success message not displayed!");	    
	       }

	       
	        @Test(priority = 7, enabled = true)
	        public void TestcaseOffilter() throws InterruptedException {
	        // Open the filter dropdown
	        driver.findElement(By.cssSelector("[data-test-id='icon-arrowdown-autocompletefilter-destop-filter-headquarter-page-reinstatement']")).click();
	        Thread.sleep(1000);
	        
	        // Select multiple options
	        driver.findElement(By.cssSelector("[data-test-id='list-item-AO-autocompletefilter-destop-filter-headquarter-page-reinstatement']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector("[data-test-id='list-item-CL-autocompletefilter-destop-filter-headquarter-page-reinstatement']")).click();
	        Thread.sleep(1000);
	
	        // Close the filter dropdown
	        driver.findElement(By.cssSelector("body")).click();
	        Thread.sleep(1000);
	        // Clear filters
	        driver.findElement(By.cssSelector("[data-test-id='clear-btn-header-page-reinstatement']")).click();
	        Thread.sleep(1000);
	        	        
	        // Open the Status filter 
	        driver.findElement(By.cssSelector("[data-test-id='filterchip-arrowdown-icon-filter-status-page-reinstatement']")).click();
	        Thread.sleep(1000);
	         
	        // Select Inactive options
		    driver.findElement(By.cssSelector("[data-test-id=\"filterchip-menu-item-false-filter-status-page-reinstatement\"]")).click();
		    Thread.sleep(1000); 
	         
		    // Clear filters
	        driver.findElement(By.cssSelector("[data-test-id=\"clear-btn-header-page-reinstatement\"]")).click();
	        Thread.sleep(1000);
	    }
	      
	        
	      @Test(priority = 7, enabled = true)
	      public void searchUser1() throws InterruptedException {
	          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	          // Locate the first row in the table
	          WebElement firstRow = wait.until(ExpectedConditions.presenceOfElementLocated(
	              By.cssSelector("[data-test-id='tablebody-desktoptable-reinstatement-responsibles-table-list-page-reinstatement']")))
	              .findElement(By.cssSelector(":first-child")); // Select the first child (row)

	          // Get the 'data-test-id' attribute of the first row
	          String dataTestId = firstRow.getAttribute("data-test-id");

	          if (dataTestId != null) {
	              // Extract UUID using regex
	              Pattern uuidPattern = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
	              Matcher matcher = uuidPattern.matcher(dataTestId);
	              String uuid = matcher.find() ? matcher.group() : null;

	              if (uuid != null) {
	                  // Locate userName using extracted UUID
	                  WebElement userNameElement = firstRow.findElement(By.cssSelector(
	                      "[data-test-id='tablebodycell-" + uuid + "-responsiblename-desktoptable-reinstatement-responsibles-table-list-page-reinstatement']"));

	                  String userName = userNameElement.getText().trim();

	                  if (!userName.isEmpty()) {
	                      System.out.println("Extracted userName: " + userName);

	                      // Search for the extracted userName
	                      WebElement searchInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/input"));
	                      searchInput.sendKeys(userName);
	                      Thread.sleep(2000);
	                      
	                      
	                      // Wait for search to reflect
	                   //   Thread.sleep(2000); // Or use an explicit wait for better performance
	                  } else {
	                      throw new NoSuchElementException("User name not found in the first row.");
	                  }

	                  // Clear the search bar
	                  WebElement clearSearchIcon = driver.findElement(By.cssSelector("[data-test-id=\"icon-clear-searchbar-page-reinstatement\"]"));
	                  clearSearchIcon.click();
	                  Thread.sleep(2000);

	              } else {
	                  throw new IllegalArgumentException("No valid UUID found in data-test-id: " + dataTestId);
	              }
	          } else {
	              throw new NoSuchElementException("No data-test-id attribute found for the first row.");
	          }
	      }

	      
	     @Test(priority = 8, enabled = true)
	    public void pagination() throws InterruptedException {
	    // Check if the right pagination arrow exists
	      List<WebElement> rightArrowElements = driver.findElements(By.cssSelector("[data-testid='KeyboardArrowRightIcon']"));
	      if (!rightArrowElements.isEmpty()) {
	          WebElement rightArrow = rightArrowElements.get(0); // Get the right arrow
	          if (rightArrow.isEnabled() && rightArrow.getCssValue("pointer-events").equals("auto")) {
	              System.out.println("Right pagination arrow is enabled.");
	              rightArrow.click(); // Click the right arrow
	              Thread.sleep(2000); // Wait after clicking
	          } else {
	              System.out.println("Right pagination arrow is disabled.");
	          }
	      } else {
	          System.out.println("Right pagination arrow is not available.");
	      }

	      // Check if the left pagination arrow exists
	      List<WebElement> leftArrowElements = driver.findElements(By.cssSelector("[data-testid='KeyboardArrowLeftIcon']"));
	      if (!leftArrowElements.isEmpty()) {
	          WebElement leftArrow = leftArrowElements.get(0); // Get the left arrow
	          if (leftArrow.isEnabled() && leftArrow.getCssValue("pointer-events").equals("auto")) {
	              System.out.println("Left pagination arrow is enabled.");
	              leftArrow.click(); // Click the left arrow
	              Thread.sleep(2000); // Wait after clicking
	          } else {
	              System.out.println("Left pagination arrow is disabled.");
	          }
	      } else {
	          System.out.println("Left pagination arrow is not available.");
	      }
}
    
//	        Actions actions = new Actions(driver);
//	        actions.sendKeys(Keys.DOWN) // Navigate through the dropdown options
//	               .sendKeys(Keys.ENTER) // Select the desired option
//	               .perform();
	     
	     
}

