package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pagess.createUserPages;

public class Maindriverclass {
	private static org.openqa.selenium.By findFirstRow;
	private static final By By = findFirstRow;
	public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
    
    	ReinstatementLoginTest loginTest = new ReinstatementLoginTest();
        loginTest.setup(); // Initialize and log in
      loginTest.loginuser();
      Thread.sleep(5000);
      
      createUserTest createUserTest = new createUserTest();
      createUserTest.testCreateUser();
      Thread.sleep(2000);
      createUserTest.editUser(By);
      Thread.sleep(2000);
      createUserTest.viewUser();
      Thread.sleep(3000);
      createUserTest.deleteUser();
      Thread.sleep(3000);
      createUserTest.testcaseOfFilter();
      Thread.sleep(3000);
      createUserTest.searchUser1();
      Thread.sleep(3000);
      createUserTest.pagination();
      Thread.sleep(3000);
      createUserTest.testAlreadyExistUser();
      Thread.sleep(3000);	
    	
    }
}