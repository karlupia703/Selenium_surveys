
package Pagess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.ReinstatementLoginPage;

public class loginpages {

	WebDriver driver;
	
	//constructor
	public loginpages(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By LanguageField = By.cssSelector("[data-test-id=\"login-language-select\"]");
	By selectLanguage = By.cssSelector("[data-value=\"en_US\"]");
	By GoogleField = By.cssSelector("[data-test-id=\"login-button-text\"]");
	By Email = By.xpath("//input[@type='email']");
	By emailNextBtn = By.xpath("//span[text()='Next']");
	By Password = By.xpath("//input[@type='password']");
	By passwordNextBtn = By.xpath("//span[text()='Next']");
	
	public void clickonLanguageField()
	{
		driver.findElement(LanguageField).click();
	}
	
	public void selecttheLanguage()
	{
		driver.findElement(selectLanguage).click();
	}
	
	public void clickOnGoogleField()
	{
		driver.findElement(GoogleField).click();
	}
	

	public void enterEmailField(String email)
	{
		driver.findElement(Email).sendKeys(email);
	}
	
	public void clickOnEmailNextBtn()
	{
		driver.findElement(emailNextBtn).click();
	}
	
	public void enterPasswordField(String passwrd)
	{
		driver.findElement(Password).sendKeys(passwrd);
	}
	
	public void ClickOnPasswordNextButton()
	{
		driver.findElement(passwordNextBtn).click();
	}
	
	
}
       

