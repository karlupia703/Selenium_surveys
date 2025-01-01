package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pagess.createUserPages;

public class Maindriverclass {
	private static org.openqa.selenium.By findFirstRow;
	private static final By By = findFirstRow;
	public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
    	
    	
        try {
            // Run ReinstatementLoginTest
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
            
            
        } finally {
            // Close the WebDriver
          //  DriverManager.quitDriver();
        	System.out.println("All testcase are run sucessfully.");
        }
    }
}

//createUserPages userPages = new createUserPages(driver);