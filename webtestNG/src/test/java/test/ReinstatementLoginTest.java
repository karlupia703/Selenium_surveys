package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class ReinstatementLoginTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = DriverManager.getDriver(); // Use shared driver
        driver.get("http://localhost:3000/reinstatement-responsibles");
    }

    @Test
    public void loginuser() throws InterruptedException {
        Pagess.loginpages page = new Pagess.loginpages(driver);

        page.clickonLanguageField();
        page.selecttheLanguage();
        page.clickOnGoogleField();

        // Handle multiple windows
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        while (allWindows.size() <= 1) {
            allWindows = driver.getWindowHandles();
        }

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Thread.sleep(3000);
        page.enterEmailField("rajni.1156@zenmonk.tech");
        page.clickOnEmailNextBtn();
        Thread.sleep(3000);
        page.enterPasswordField("Rajnikar2022");
        page.clickOnEmailNextBtn();

        driver.switchTo().window(parentWindow);
        Thread.sleep(3000);
    }
}


































//package test;
//import java.util.Iterator;
//import java.util.Set;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//public class ReinstatementLoginTest {
//   WebDriver driver;
//
//  
//   @BeforeTest
//   public void setup() {
//       WebDriverManager.chromedriver().setup();
//       driver = new ChromeDriver();
//       driver.manage().window().maximize();
//       driver.get("http://localhost:3000/reinstatement-responsibles");
//     	}
//
//   
//   @Test  
//   public void loginuser() throws InterruptedException{
//	   Pagess.loginpages page = new Pagess.loginpages(driver);
//	   
//	   page.clickonLanguageField();
//	   page.selecttheLanguage();
//	   page.clickOnGoogleField();
//	   
//       // Handle multiple windows
//       String parentWindow = driver.getWindowHandle(); // Store parent window handle
//       Set<String> allWindows = driver.getWindowHandles();
//
//       // Wait until child window opens
//       while (allWindows.size() <= 1) {
//           allWindows = driver.getWindowHandles();
//       }
//
//       // Switch to child window
//       for (String windowHandle : allWindows) {
//           if (!windowHandle.equals(parentWindow)) {
//               driver.switchTo().window(windowHandle); // Switch to the child window
//               break;
//           }
//       }
//
//       // Perform actions on the child window
//       Thread.sleep(3000); // Optional: Can replace with explicit waits
//       page.enterEmailField("rajni.1156@zenmonk.tech");
//       page.clickOnEmailNextBtn();
//       Thread.sleep(3000);
//       page.enterPasswordField("Rajnikar2022");
//       page.clickOnEmailNextBtn();
//	   
//       driver.switchTo().window(parentWindow);
//       Thread.sleep(3000); // Optional: Can replace with explicit waits
//	  	   
//	   
////	// Redirect to child window
////	   Set <String> windows = driver.getWindowHandles();
////	   Iterator <String> it = windows.iterator();
////	   String p = it.next();
////	   String c = it.next();
////	   driver.switchTo().window(c);
////	   Thread.sleep(3000); 
////	   
////	   page.enterEmailField("rajni.1156@zenmonk.tech");
////	   page.clickOnEmailNextBtn();
////	   page.enterPasswordField("Rajnikar2022");
////	   page.clickOnEmailNextBtn();
//	   
////       //redirect to parent window
////        driver.switchTo().window(p);
////        Thread.sleep(3000);
//   
//   
//   }
//	
//}
