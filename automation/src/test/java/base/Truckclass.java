package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Truckclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver ();
		Actions actions = new Actions(driver);
		driver.get("https://mytruck.one/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("milton@yopmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys("Test@22");
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/form/div[2]/button")).click();
		
		
	}

}
