
package Pagess;


import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createUserPages {

    WebDriver driver;
	private WebDriverWait wait;

    // Constructor
    public createUserPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
    // By crossIconView = By.xpath("/html/body/div[5]/div[3]/div/h2/div/button");
    
    // Locators for delete user
    private By deleteButton = By.cssSelector("[data-test-id*='-deleteicon-desktoptable-']");
    private By confirmDeleteButton = By.cssSelector("[data-test-id='custombtn-dialogBox-submit-alertbox-delete-reinstatement-responsibles-table-list-page-reinstatement']");
    private By notificationMessage = By.cssSelector("#notistack-snackbar > .MuiBox-root");

    //Locators for Filter
    private By filterDropdown = By.cssSelector("[data-test-id='icon-arrowdown-autocompletefilter-destop-filter-headquarter-page-reinstatement']");
    private By optionAO = By.cssSelector("[data-test-id='list-item-AO-autocompletefilter-destop-filter-headquarter-page-reinstatement']");
    private By optionCL = By.cssSelector("[data-test-id='list-item-CL-autocompletefilter-destop-filter-headquarter-page-reinstatement']");
    private By closeDropdown = By.cssSelector("body");
    private By clearFilters = By.cssSelector("[data-test-id='clear-btn-header-page-reinstatement']");
    private By statusFilterDropdown = By.cssSelector("[data-test-id='filterchip-arrowdown-icon-filter-status-page-reinstatement']");
    private By inactiveOption = By.cssSelector("[data-test-id=\"filterchip-menu-item-false-filter-status-page-reinstatement\"]");
   
    // Locators for Search
    private By tableBody = By.cssSelector("[data-test-id='tablebody-desktoptable-reinstatement-responsibles-table-list-page-reinstatement']");
    private By searchInput = By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/input");
    private By clearSearchIcon = By.cssSelector("[data-test-id=\"icon-clear-searchbar-page-reinstatement\"]");
    
    //Locators for pagination
    private By rightArrow = By.cssSelector("[data-testid='KeyboardArrowRightIcon']");
    private By leftArrow = By.cssSelector("[data-testid='KeyboardArrowLeftIcon']");
    
    //Locators for User already exist
    private By createButton = By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/button");
  //   private By firstNameField = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[1]");
   
 //   private By firstNameField =  By.cssSelector("[data-test-id='customtextfield-input-responsiblename-responsibleform-create']");
    
   private By firstNameField = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[1]");
    private By lastNameField2 = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[2]/div/input");
    private By emailField = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[3]/div/input");
    private By headquarterDropdown = By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[4]/div/div/div/button");
    private By statusToggle = By.xpath("/html/body/div[5]/div[3]/div[2]/div/label/span[1]/span[1]");
    private By submitButton = By.xpath("/html/body/div[5]/div[3]/div[3]/button[2]");
    private By cancelButton = By.xpath("/html/body/div[5]/div[3]/div[3]/button[1]");
    private By yesButton = By.xpath("/html/body/div[6]/div[3]/div/div[2]/button[2]");
    private By notification2 = By.cssSelector("#notistack-snackbar > .MuiBox-root");

    
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
		
	    // Methods of Delete User
	    public void clickDeleteButton() {
	        WebElement firstRowDeleteButton = driver.findElement(deleteButton);
	        firstRowDeleteButton.click();
	    }

	    public void confirmDeletion() {
	        driver.findElement(confirmDeleteButton).click();
	    }

	    public String getNotificationMessage() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(notificationMessage));
	        return notification.getText().trim();
	    }
	
	    
	   //Methods of filters
	    public void openFilterDropdown() {
	        driver.findElement(filterDropdown).click();
	    }

	    public void selectOptionAO() {
	        driver.findElement(optionAO).click();
	    }

	    public void selectOptionCL() {
	        driver.findElement(optionCL).click();
	    }

	    public void closeFilterDropdown() {
	        driver.findElement(closeDropdown).click();
	    }

	    public void clearFilters() {
	        driver.findElement(clearFilters).click();
	    }

	    public void openStatusFilterDropdown() {
	        driver.findElement(statusFilterDropdown).click();
	    }

	    public void selectInactiveOption() {
	        driver.findElement(inactiveOption).click();
	    }
	    
	  //Methods of Search
	    public WebElement getFirstRow() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement tableBodyElement = wait.until(ExpectedConditions.presenceOfElementLocated(tableBody));
	        return tableBodyElement.findElement(By.cssSelector(":first-child"));
	    }

	    public String extractUuidFromRow(WebElement firstRow) {
	        String dataTestId = firstRow.getAttribute("data-test-id");
	        if (dataTestId == null) {
	            throw new NoSuchElementException("No data-test-id attribute found for the first row.");
	        }

	        Pattern uuidPattern = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
	        Matcher matcher = uuidPattern.matcher(dataTestId);

	        if (matcher.find()) {
	            return matcher.group();
	        } else {
	            throw new IllegalArgumentException("No valid UUID found in data-test-id: " + dataTestId);
	        }
	    }

	    public String getUserName(WebElement firstRow, String uuid) {
	        WebElement userNameElement = firstRow.findElement(By.cssSelector(
	            "[data-test-id='tablebodycell-" + uuid + "-responsiblename-desktoptable-reinstatement-responsibles-table-list-page-reinstatement']"));
	        String userName = userNameElement.getText().trim();

	        if (userName.isEmpty()) {
	            throw new NoSuchElementException("User name not found in the first row.");
	        }

	        return userName;
	    }

	    public void searchForUserName(String userName) throws InterruptedException {
	        WebElement searchBar = driver.findElement(searchInput);
	        searchBar.sendKeys(userName);
	        Thread.sleep(2000); // Consider replacing with an explicit wait
	    }

	    public void clearSearch() throws InterruptedException {
	        WebElement clearSearch = driver.findElement(clearSearchIcon);
	        clearSearch.click();
	        Thread.sleep(2000); // Consider replacing with an explicit wait
	    }

	    
	    // Methods of paginations
	    public boolean isPaginationArrowAvailable(By arrowLocator) {
	        List<WebElement> elements = driver.findElements(arrowLocator);
	        return !elements.isEmpty();
	    }

	    public boolean isPaginationArrowEnabled(By arrowLocator) {
	        WebElement arrow = driver.findElement(arrowLocator);
	        return arrow.isEnabled() && "auto".equals(arrow.getCssValue("pointer-events"));
	    }

	    public void clickPaginationArrow(By arrowLocator) {
	        WebElement arrow = driver.findElement(arrowLocator);
	        arrow.click();
	    }

	    public boolean isRightArrowAvailable() {
	        return isPaginationArrowAvailable(rightArrow);
	    }

	    public boolean isRightArrowEnabled() {
	        return isPaginationArrowEnabled(rightArrow);
	    }

	    public void clickRightArrow() {
	        clickPaginationArrow(rightArrow);
	    }

	    public boolean isLeftArrowAvailable() {
	        return isPaginationArrowAvailable(leftArrow);
	    }

	    public boolean isLeftArrowEnabled() {
	        return isPaginationArrowEnabled(leftArrow);
	    }

	    public void clickLeftArrow() {
	        clickPaginationArrow(leftArrow);
	    }

	    
	    // Methods of Already user exist
	    public void clickCreateButton() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(createButton)).click();
	    }

	    public void fillUserDetails(String firstName, String lastName, String email) {
	        try {
	            // Wait for the form to be visible
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form")));

	            // Fill out user details
	            WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[1]/div/input")));
	            firstNameField.clear();
	            firstNameField.sendKeys(firstName);

	            WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[2]/div/input")));
	            lastNameField.clear();
	            lastNameField.sendKeys(lastName);

	            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[3]/div[2]/div/form/div[3]/div/input")));
	            emailField.clear();
	            emailField.sendKeys(email);
	        } catch (Exception e) {
	            System.out.println("Error locating or interacting with form fields: " + e.getMessage());
	            throw e;
	        }
	    }
	      
	    public void selectheadquarter1() {
            driver.findElement(headquarterDropdown).click();
        
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
            
	    public void toggleStatus() {
	        WebElement toggle = driver.findElement(statusToggle);
	        toggle.click();
	        toggle.click();
	    }

	    public void clickSubmitButton() {
	        driver.findElement(submitButton).click();
	    }

	    public void clickCancelButton() {
	        driver.findElement(cancelButton).click();
	    }

	    public void clickYesButton() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(yesButton)).click();
	    }

	    public String getNotificationMessage2() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(notification2)).getText();
	    }
	    
	    
	}
	    
	
		
		
		
		
		
		
	
    


