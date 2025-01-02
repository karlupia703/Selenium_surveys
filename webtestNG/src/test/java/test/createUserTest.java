
package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.github.javafaker.File;
import Pagess.createUserPages;

import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class createUserTest {
    private static org.openqa.selenium.By test;
	private static final By By = test;
	WebDriver driver;
    Faker faker = new Faker();

    @Test(priority = 1, enabled = true)
    public void testCreateUser() throws InterruptedException {
        driver = DriverManager.getDriver(); // Use shared driver

       String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
       String email = generateRandomEmail(firstName, lastName);

      createUser(firstName, lastName, email);
    }

   void createUser(String firstName, String lastName, String email) {
	// Initialize Page Object
       Pagess.createUserPages user = new Pagess.createUserPages(driver);
       
          user.clickOnCreateButton();
          user.ClickOnInsideCreateButton();
        //Apply Assertions on validation message
    	 Assert.assertTrue(user.getFirstNameErrorMessage().contains("First name must be at least 3 characters long"),"First name error message did not match!");
         Assert.assertTrue(user.getLastNameErrorMessage().contains("Last name must be at least 3 characters long"), "Last name error message did not match!");
         Assert.assertTrue(user.getEmailErrorMessage().contains("Email is required"),"Email error message did not match!");
         Assert.assertTrue(user.getHeadquarterErrorMessage().contains("Please select a headquarter"), "Headquarter error message did not match!");

//        // Assertions
        user.enterFirstName(firstName);
        user.enterLastName(lastName);
        user.enterEmail(email);
        user.selectheadquarter();
        user.clickOnSubmitBtn();
        
        System.out.println("User create successfully");
    }

    private String generateRandomEmail(String firstName, String lastName) {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@example.com";
        
      
    }
    
    @Test(priority = 2, enabled = true)
    public void editUser(By By) throws InterruptedException {
        Faker faker = new Faker();
        String updatedLastName = faker.name().lastName();
        Pagess.createUserPages userPage = new Pagess.createUserPages(driver);

        // Log and Perform Actions
 //       System.out.println("Clicking on the first row to edit...");
//        userPage.findFirstRow();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        System.out.println("Attempting to find the first row.");
        userPage.findFirstRow();
        Thread.sleep(2000);
                      
        System.out.println("Updating last name.");
        userPage.clickOnLastNameField(updatedLastName);

        System.out.println("Clicking on the edit button.");
        userPage.clickOnEditButton();

        System.out.println("Confirming the edit.");
        userPage.clickOnConfirmDialogBox();

        // Validate Notification
//        System.out.println("Fetching notification text...");
//        String notificationText = userPage.getNotificationText();
//        Assert.assertTrue(notificationText.contains("Saved successfully"), "Edit success message not displayed!");
//        System.out.println("Editing user completed successfully.");
    

    }   
    
    @Test(priority = 3, enabled = true)
    public void viewUser() throws InterruptedException {
        Pagess.createUserPages userPage2 = new Pagess.createUserPages(driver);
        
        // Wait for table to load
  //      userPage1.waitForTableToLoad();

        // Attempt to click on the view icon
        System.out.println("Click on view icon.");
        userPage2.clickOnViewIcon1();
        Thread.sleep(2000);
        
        userPage2.clickOnViewCrossIcon();
        System.out.println("Click on cross icon.");
        Thread.sleep(2000);
    }

        
    @Test(priority = 4, enabled = true)
    public void deleteUser() {
        // Initialize the page object
    	createUserPages userPage3 = new createUserPages(driver);

        // Perform delete action
        userPage3.clickDeleteButton();
        userPage3.confirmDeletion();

        // Get the notification message and verify it
        String notificationText = userPage3.getNotificationMessage();
        System.out.println("Notification Text: " + notificationText);
        Assert.assertTrue(notificationText.contains("was successfully deleted"), "Delete success message not displayed!");
    }
    
    @Test(priority = 5, enabled = true)
    public void testcaseOfFilter() throws InterruptedException {
        // Initialize the page object
    	createUserPages userPage5 = new createUserPages(driver);

        // Open the filter dropdown and select multiple options
        userPage5.openFilterDropdown();
        Thread.sleep(1000);
        userPage5.selectOptionAO();
        Thread.sleep(1000);
        userPage5.selectOptionCL();
        Thread.sleep(1000);

        // Close the filter dropdown
        userPage5.closeFilterDropdown();
        Thread.sleep(1000);

        // Clear filters
        userPage5.clearFilters();
        Thread.sleep(1000);

        // Open the Status filter dropdown and select "Inactive" option
        userPage5.openStatusFilterDropdown();
        Thread.sleep(1000);
        userPage5.selectInactiveOption();
        Thread.sleep(1000);

        // Clear filters again
        userPage5.clearFilters();
        Thread.sleep(1000);
    }
    
    @Test(priority = 6, enabled = true)
    public void searchUser1() throws InterruptedException {
        // Initialize the page object
        createUserPages userPage = new createUserPages(driver);

        // Locate the first row in the table
        WebElement firstRow = userPage.getFirstRow();

        // Extract UUID from the first row
        String uuid = userPage.extractUuidFromRow(firstRow);

        // Get the user name using the extracted UUID
        String userName = userPage.getUserName(firstRow, uuid);
        System.out.println("Extracted userName: " + userName);
        userPage.searchForUserName(userName);
        userPage.clearSearch();
    }
    
    
    
}
    
    

    
    






