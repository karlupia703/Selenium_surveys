package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class dummylogin {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebDriver Actions;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--enable-notifications");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3)); // 3 seconds wait
        @SuppressWarnings("unused")
		Actions actions = new Actions(driver);
        driver.get("https://app.iskedo.com/"); // Replace with the URL of the login page
        }

    @Test
    public void testValidLogin() {
        // Locate the username and password fields
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[2]/div[1]/div[1]/input[1]")));
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[2]/div[2]/input[1]"));

        // Enter valid credentials
        usernameField.sendKeys("7814415480");
        passwordField.sendKeys("1111");

        // Locate and click the login button
        WebElement loginButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[2]/input[1]"));
        loginButton.click();

        // Select profile
        WebElement selectProfile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div/div[1]/div/div[1]/div")));
        selectProfile.click();

        // Proceed with the profile
        WebElement proceedProfile = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div/div[2]/input"));
        proceedProfile.click();

        // Select location
        WebElement selectLocation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div/div[1]/div/div[1]/div")));
        selectLocation.click();

        // Proceed with the location
        WebElement proceedLocation = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/form[2]/div/div[2]/input"));
        proceedLocation.click();

        // Verify successful login by checking for a URL on the landing page
        wait.until(ExpectedConditions.urlToBe("https://app.iskedo.com/layout/dashboard"));
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://app.iskedo.com/layout/dashboard";
        Assert.assertEquals(currentUrl, expectedUrl, "Login failed");
    }
  
    
 //   @Test(dependsOnMethods = "testValidLogin")
  @Test(enabled = false)
    public void createClient() {
        WebElement clientsTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/layout/client']")));
        clientsTab.click();

        WebElement addIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/p")));
        addIcon.click();

        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/form/div[1]/input")));
       nameField.sendKeys("Rohit");

        WebElement emailField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/input"));
        emailField.sendKeys("rohitt123@yopmail.com");

        WebElement dobField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[3]/input"));
        dobField.sendKeys("09-12-2000");

       WebElement mobileNoField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[4]/div/input"));
       mobileNoField.sendKeys("7814907778");

        WebElement genderDropdown = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/select"));
       genderDropdown.click();
       
       WebElement genderOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/form/div[5]/select/option[2]")));
       genderOption.click();

        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[6]/button"));
        submitButton.click();

        WebElement creationSnackbar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[2]/div/div[1]/div/div")));
        Assert.assertTrue(creationSnackbar.isDisplayed(), "Client creation snackbar is not displayed.");
    }
    
  
   @Test(dependsOnMethods = "testValidLogin")
//    @Test(enabled = false)
    public void team() {
    WebElement teamstab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/div[1]/aside/div/a[6]")));
    teamstab.click();
    	
    WebElement addicon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/p/i")));
    addicon.click();
    
    WebElement Name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[1]/input")));
    Name.sendKeys("Orrizy");
    
    WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[2]/input")));
    email.sendKeys("orri2yy@yopmail.com");
    
    WebElement dobField = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[3]/input"));
    dobField.sendKeys("09-12-1998");

    WebElement genderDropdown = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[4]/select"));
    genderDropdown.click();
    
    WebElement genderOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[4]/select/option[2]")));
    genderOption.click(); 
    
    WebElement mobileNoField = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[5]/div/input"));
    mobileNoField.sendKeys("7814907678");

   
   WebElement selectrole = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[6]/select"));
   selectrole.click();
   
   WebElement roleOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[6]/select/option[2]")));
   roleOption.click();
    
   WebElement selectservice = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[7]/div/div/div"));
   selectservice.click();
 
   WebElement serviceOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/ul/li[1]/ul/li[1]")));
   serviceOption.click();
  
   
   WebElement selectBranch = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[8]/div/div/div"));
   selectBranch.click();
 
   WebElement BranchOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/ul/li[1]")));
   BranchOption.click();
   
   WebElement selectPIN = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[9]/div/input"));
   selectPIN.click();
   
   selectPIN.sendKeys("1234");
   
   WebElement submitTeam = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/section/div[2]/form/div[12]/button"));
   submitTeam.click();
   
   
    }
    
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            
        }
    }
}