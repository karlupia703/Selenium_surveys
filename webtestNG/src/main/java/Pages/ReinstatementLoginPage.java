package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.ReinstatementLoginPage;

public class ReinstatementLoginPage {

	WebDriver driver;
	
	//constructor
	public ReinstatementLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By LanguageField = By.cssSelector("[data-test-id=\"login-language-select\"]");
	By selectLanguage = By.cssSelector("[data-value=\"en_US\"]");
	By GoogleField = By.cssSelector("[data-test-id=\"login-button-text\"]");
	By Email = By.xpath("//input[@type='email']");
	By emailNextBtn = By.xpath("//span[text()='Next']");
	
	By password = By.xpath("//input[@type='password']");
	By passwordNextBtn = By.xpath("//span[text()='Next']");
	
	public void clickonLanguageField(String languagedropdown)
	{
		driver.findElement(LanguageField).click();
	}
	
	public void selecttheLanguage(String language)
	{
		driver.findElement(selectLanguage).click();
	}
	
	public void clickOnGoogleField(String gogle)
	{
		driver.findElement(GoogleField).click();
	}
	
	public void enterEmailField(String email)
	{
		driver.findElement(Email).sendKeys("rajni.1156@zenmonk.tech");
	}
	
	public void clickOnEmailNextBtn(String emailnext)
	{
		driver.findElement(emailNextBtn).click();
	}
	
	public void enterPasswordField(String passwrd)
	{
		driver.findElement(password).sendKeys("Rajnikar2022");
	}
	
	public void ClickOnPasswordNextButton(String passwrdnext)
	{
		driver.findElement(passwordNextBtn).click();
	}
	
	
}
       

