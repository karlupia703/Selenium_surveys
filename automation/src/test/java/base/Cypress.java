package base;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cypress {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCypresstry() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1920,945 | ]]
    driver.get("https://survey-building-app-develop-iymj66chvq-uc.a.run.app/?callbackUrl=https%3A%2F%2F0.0.0.0%3A8080%2Fsurveys");
    // Label: Login
    driver.findElement(By.xpath("//*[text() = \"Sign in with Google\"]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.get("https://zenmonk-main.firebaseapp.com/__/auth/handler?apiKey=AIzaSyBmNcKcmPD6CDudvUOpBJ74mYrbRW9AFjA&appName=%5BDEFAULT%5D&authType=signInViaPopup&redirectUrl=https%3A%2F%2Fsurvey-building-app-develop-iymj66chvq-uc.a.run.app%2F%3FcallbackUrl%3Dhttps%253A%252F%252F0.0.0.0%253A8080%252Fsurveys&v=10.8.1&eventId=0083655229&providerId=saml.zenmonk-app&tid=zenmonk-djb28");
    driver.get("https://accounts.google.com/AccountChooser?continue=https://accounts.google.com/o/saml2/continue?idpid%3DC02tbg7t1%26SAMLRequest%3DfZFBb8IwDIX/SpV7mzQg2ka0iIGmITENQbfDLii0KURrnS5O0bRfv6qAxC4cfIj8/PzyeTr7aWrvrCxqAykJA0Y8BYUpNRxT8p4/%252BzGZZVOUTc1bMe/cCbbqu1PovH4QUFw6KeksCCNRowDZKBSuELv561rwgInWGmcKUxNvjqis61ctDGDXKLtT9qwL9b5dp%252BTkXIuC0l8FjYEvv5EagkpbdZCoZNsGhWnofk9ln4KeJJS1ssRb9lk0SDfkv1nIojAdOAyOxhxrNUwaOmSlumxnfekyXTDuDsfIhcRbLVOyr2IZJWpSxuNxlIQHXlWcxZMoqSYli%252BJk1MsQO7UCdBJcSjjjY5/FPuc5iwRjYjQJWJh8Em9z/fGThgvJR3gOFxGKlzzf%252BJu3XU68j9tFegG58hfDdnsP/rGxvNEm2Y1pj3FK792y6/P/cbM/%26RelayState%3DAMbdmDk7vxcyx1mkp2E2iKoIEPT8Vx7xqW9oe5n5lKKkYNf7aQkliYHWC-xPQQlON8Z7EkiFiKQdKWb3UDBUn7n54ynQUUDofzQFYupJC3tzLlMDV2X6EHb615_tv8RG4lwBPcaTZvC5RpZuHf4IIIhnI6aRw0Znm1XCSYxFhxQH83znrAEPmF8hLdLyLNS05t3iuEEiOssUbWH-SkdBYwfd0K-smHoyiR7n9KaTFKaPCGJYA0CgxjH1EQg-LE9bdLrvnCZzLIgIkPZMhcNbCoOUP1sHHVN545kadu2lF3TO1uAthA6iIGhiaIrA2UL7EB4iHr85veYp%26context_uri%3Dhttps://survey-building-app-develop-iymj66chvq-uc.a.run.app%26omethod%3DGET&faa=1");
    driver.findElement(By.xpath("//*[text() = \"rajni.1156@zenmonk.tech\"]")).click();
    driver.get("https://zenmonk-main.firebaseapp.com/__/auth/handler");
    driver.close();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.get("https://survey-building-app-develop-iymj66chvq-uc.a.run.app/surveys");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
