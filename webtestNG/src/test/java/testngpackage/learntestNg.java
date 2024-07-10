package testngpackage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class learntestNg {
	
	
	@BeforeTest
	 public void logintoApplication() 
	 {
		System.out.println("Login to application");
			 }
	
	@BeforeMethod
	 public void ConnecttoDB()
	 {
		System.out.println("Connect to DB");
	 }
	
	@AfterMethod
	public void DisconnectfromDB()
	{
	System.out.println("Disconnect from DB");
	}
	
	
	
	@AfterTest
	public void logoutfromApplication()
	{
		System.out.println("Logout from application");
	}
	
	
  @Test(priority=1,description="This is  Test 1")
  public void login() {
	  System.out.println("login successfully");
  }
  
  
  @Test(priority=2,description="This is logout Test 2")
   public void logout() {
	   System.out.println("Logout successfully");
	
	   
   }
}
