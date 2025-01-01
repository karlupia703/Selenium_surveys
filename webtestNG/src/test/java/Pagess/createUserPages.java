
package Pagess;


import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createUserPages {

    WebDriver driver;

    // Constructor
    public createUserPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    

    By createbtn = By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/button");
    //  By createbtn = By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/button");
    By insidebtn = By.cssSelector("[data-test-id=\"custombtn-modal-responsibleform-create-submit\"]");
    By firstNameError = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[1]/p");
    By lastNameError = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[2]/p");
    By emailError = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[3]/p");
    By headquarterError = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[4]/div/p");

    // Click on input fields
    By firstname = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[1]/div/input");
    By lastname = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[2]/div/input");
    By emailaddress = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[3]/div/input");
    By headquarter = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[4]/div/div/div/button");
    By dropdownOptions = By.xpath("//ul[@role='listbox']/li");
    By sumbit = By.cssSelector("[data-test-id=\"custombtn-modal-responsibleform-create-submit\"]");
     //  By notification = By.xpath("/div/div/div/div/div/div[1]/div");
    //   By notification = By.cssSelector("#notistack-snackbar > .MuiBox-root");
    
   
    // Locators for edit user field
    By findFirstRow = By.cssSelector("[data-test-id*='-editicon-desktoptable-']");
    By lastNameField = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[2]/div/input");
    By editbutton = By.xpath("/html/body/div[5]/div[3]/div[3]/button[2]");
    By confirmdialogbox = By.xpath("/html/body/div[6]/div[3]/div/div[2]/button[2]");
    By notification = By.cssSelector("[#notistack-snackbar > .MuiBox-root]");
    
    // Locators for view user field  
    
      By findFirstRowViewIcon = By.cssSelector("[data-test-id*='-viewicon-desktoptable-']");
      By crossIconView = By.cssSelector("[data-test-id=\"customdialog-canclebtn-view-viewresponsible-reinstatement-responsibles-table-list-page-reinstatement\"]");
 //     By crossIconView = By.xpath("/html/body/div[5]/div[3]/div/h2/div/button");
      
    public void clickOnCreateButton() {
        driver.findElement(createbtn).click();
    }

    public void ClickOnInsideCreateButton() {
        driver.findElement(insidebtn).click();
    }

    public String getFirstNameErrorMessage() {
        return driver.findElement(firstNameError).getText();
    }

    public String getLastNameErrorMessage() {
        return driver.findElement(lastNameError).getText();
    }

    public String getEmailErrorMessage() {
        return driver.findElement(emailError).getText();
    }

    public String getHeadquarterErrorMessage() {
        return driver.findElement(headquarterError).getText();
    }

    public void enterFirstName(String first) {
        driver.findElement(firstname).sendKeys(first);
    }

    public void enterLastName(String last) {
        driver.findElement(lastname).sendKeys(last);
    }

    public void enterEmail(String email) {
        driver.findElement(emailaddress).sendKeys(email);
    }

    public void selectheadquarter() {
        driver.findElement(headquarter).click();
    
        // Get all available options in the dropdown
        List<WebElement> options = driver.findElements(dropdownOptions);

        // Check if options are available
        if (!options.isEmpty()) {
            // Generate a random index
            Random rand = new Random();
            int randomIndex = rand.nextInt(options.size());

            // Click on the randomly selected option
            WebElement randomOption = options.get(randomIndex);
            randomOption.click();
        } else {
            System.out.println("No options available in the dropdown.");
        }
    }

    public void clickOnSubmitBtn() {
        driver.findElement(sumbit).click();
    }
    
//    public String getSuccessMessage() {
//        return driver.findElement(notification).getText();
//    }
    
    // Edit Method 
    
    public void findFirstRow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement findFirstRow1 = wait.until(ExpectedConditions.presenceOfElementLocated((By) findFirstRow));
        wait.until(ExpectedConditions.elementToBeClickable(findFirstRow)).click();
    }
    
    
    public void clickOnLastNameField(String last) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField));
        lastNameInput.click();
        // Select all and delete
        lastNameInput.sendKeys(Keys.CONTROL + "a");
        lastNameInput.sendKeys(Keys.DELETE);
        // Enter the new value
        lastNameInput.sendKeys(last);               
    }

    public void clickOnEditButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(editbutton));
        editBtn.click();
    }

    public void clickOnConfirmDialogBox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirmDialog = wait.until(ExpectedConditions.elementToBeClickable(confirmdialogbox));
        confirmDialog.click();
    }
     
    // View Method of User
   
    public void clickOnViewIcon1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement findFirstRow1 = wait.until(ExpectedConditions.presenceOfElementLocated((By) findFirstRowViewIcon));
        wait.until(ExpectedConditions.elementToBeClickable(findFirstRowViewIcon)).click();
    }

    
    public void clickOnViewCrossIcon() {
    	driver.findElement(crossIconView).click();
    }

    
	public void waitForTableToLoad() {
		// TODO Auto-generated method stub
		
		
	}
    
}

