


package Testcases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dummyreinstatment {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
   WebDriverManager.chromedriver().setup();
   driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver = new ChromeDriver();
    driver.get("http://localhost:3000/reinstatement-responsibles");
    
  }

  @Test
  public void testFreecreett() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1421,945 | ]]
 //   driver.get("http://localhost:3000/reinstatement-responsibles");
    // Label: create user
    driver.findElement(By.cssSelector("div.MuiStack-root.mui-gfuqiw-MuiStack-root")).click();
    driver.findElement(By.xpath("//*[text() = \"Create\"]")).click();
    driver.findElement(By.cssSelector("[data-test-id=\"customtextfield-input-responsiblelastname-responsibleform-create\"]")).click();
    driver.findElement(By.cssSelector("[data-test-id=\"customtextfield-input-responsiblelastname-responsibleform-create\"]")).clear();

    driver.findElement(By.id(":r17:")).sendKeys("testing");
    driver.findElement(By.id(":r18:")).clear();
    driver.findElement(By.id(":r18:")).sendKeys("testingq");
    driver.findElement(By.id(":r19:")).clear();
    driver.findElement(By.id(":r19:")).sendKeys("testttt@yopmail.com");
    driver.findElement(By.id("headquarter")).click();
    driver.findElement(By.id("headquarter-option-40")).click();
    driver.findElement(By.id("headquarter")).clear();
    driver.findElement(By.id("headquarter")).sendKeys("SN-Senegal");
    driver.findElement(By.cssSelector("span.MuiTypography-root.MuiTypography-body1.MuiFormControlLabel-label.mui-1yiepsx-MuiTypography-root")).click();
    driver.findElement(By.cssSelector("span.MuiTypography-root.MuiTypography-body1.MuiFormControlLabel-label.mui-1yiepsx-MuiTypography-root")).click();
    driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiButton-root.MuiButton-text.MuiButton-textPrimary.MuiButton-sizeMedium.MuiButton-textSizeMedium.MuiButton-colorPrimary.mui-146emdj-MuiButtonBase-root-MuiButton-root")).click();
    driver.findElement(By.xpath("//*[text() = \"Reinstatement Responsible created successfully\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Reinstatement Responsible created successfully\"]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //*[text() = "Reinstatement Responsible created successfully"] | ]]
    driver.findElement(By.xpath("//*[text() = \"Reinstatement Responsible created successfully\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Reinstatement Responsible created successfully\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Reinstatement Responsible created successfully\"]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //*[text() = "Reinstatement Responsible created successfully"] | ]]
    driver.findElement(By.xpath("//*[text() = \"Reinstatement Responsible created successfully\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Reinstatement Responsible created successfully\"]")).click();
    // Label: view 
    driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium.mui-1gtpq4r-MuiButtonBase-root-MuiIconButton-root > svg.MuiSvgIcon-root.MuiSvgIcon-colorSecondary.MuiSvgIcon-fontSizeMedium.mui-1ct1l7j-MuiSvgIcon-root")).click();
    driver.findElement(By.cssSelector("div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation24.MuiDialog-paper.MuiDialog-paperScrollPaper.MuiDialog-paperWidthSm.mui-jov2zh-MuiPaper-root-MuiDialog-paper")).click();
    driver.findElement(By.cssSelector("div.MuiStack-root.mui-1ckhnz5-MuiStack-root")).click();
    driver.findElement(By.xpath("//*[text() = \"testingq\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"testttt@yopmail.com\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"SN-Senegal\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Active\"]")).click();
    driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.MuiSvgIcon-colorSecondary.MuiSvgIcon-fontSizeMedium.mui-aqewg5-MuiSvgIcon-root")).click();
    // Label: edit user
    driver.findElement(By.xpath("//div[@id=':r4:']/div/table/tbody/tr/td[5]/div/button[2]/svg")).click();
    driver.findElement(By.id(":r2f:")).click();
    driver.findElement(By.id(":r2f:")).clear();
    driver.findElement(By.id(":r2f:")).sendKeys("one");
    driver.findElement(By.xpath("//*[text() = \"Update\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Accept\"]")).click();
    // Label: delete
    driver.findElement(By.xpath("//*[text() = \"delete\"]")).click();
    driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiButton-root.MuiButton-text.MuiButton-textPrimary.MuiButton-sizeMedium.MuiButton-textSizeMedium.MuiButton-colorPrimary.mui-146emdj-MuiButtonBase-root-MuiButton-root")).click();
    driver.findElement(By.xpath("//*[text() = \"was successfully deleted\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"was successfully deleted\"]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //*[text() = "was successfully deleted"] | ]]
    driver.findElement(By.xpath("//*[text() = \"was successfully deleted\"]")).click();
    driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeSmall.mui-1m3u143-MuiSvgIcon-root")).click();
    // Label: Search
    driver.findElement(By.xpath("//input[@placeholder = \"Search responsible\"]")).click();
    driver.findElement(By.xpath("//input[@placeholder = \"Search responsible\"]")).clear();
    driver.findElement(By.xpath("//input[@placeholder = \"Search responsible\"]")).sendKeys("selena");
    driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium.mui-1gtpq4r-MuiButtonBase-root-MuiIconButton-root > svg.MuiSvgIcon-root.MuiSvgIcon-colorSecondary.MuiSvgIcon-fontSizeMedium.mui-1ct1l7j-MuiSvgIcon-root > path")).click();
    driver.findElement(By.cssSelector("div.MuiDialog-container.MuiDialog-scrollPaper.mui-1sep8xo-MuiDialog-container")).click();
    driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.MuiSvgIcon-colorSecondary.MuiSvgIcon-fontSizeMedium.mui-aqewg5-MuiSvgIcon-root")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
    driver.findElement(By.cssSelector("div.MuiModal-root.mui-79ws1d-MuiModal-root > div.MuiBackdrop-root.MuiModal-backdrop.mui-i9fmh8-MuiBackdrop-root-MuiModal-backdrop")).click();
    driver.findElement(By.xpath("//*[text() = \"Cancel\"]")).click();
    driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.clear-icon.mui-1ty008w-MuiSvgIcon-root")).click();
    // Label: Filters
    driver.findElement(By.xpath("//*[text() = \"Headquarter\"]")).click();
    driver.findElement(By.id(":r67:-option-35")).click();
    driver.findElement(By.id(":r67:-option-34")).click();
    driver.findElement(By.id(":r67:-option-28")).click();
    driver.findElement(By.id(":r67:-option-27")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[36]")).click();
    driver.findElement(By.id(":r67:-option-34")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[29]")).click();
    driver.findElement(By.id(":r67:-option-27")).click();
    driver.findElement(By.id(":r67:-option-0")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[22]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[23]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[24]")).click();
    driver.findElement(By.id(":r67:-option-4")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[26]")).click();
    driver.findElement(By.cssSelector("span.MuiButtonBase-root.MuiCheckbox-root.MuiCheckbox-colorPrimary.MuiCheckbox-sizeMedium.PrivateSwitchBase-root.MuiCheckbox-root.MuiCheckbox-colorPrimary.MuiCheckbox-sizeMedium.Mui-checked.MuiCheckbox-root.MuiCheckbox-colorPrimary.MuiCheckbox-sizeMedium.mui-c8wlst-MuiButtonBase-root-MuiCheckbox-root > input.PrivateSwitchBase-input.mui-1m9pwf3")).click();
    driver.findElement(By.cssSelector("div.MuiPopover-root.autocomplete-filter_auto-complete-popper__i3bj0.MuiModal-root.mui-1i0e6f3-MuiModal-root-MuiPopover-root > div.MuiBackdrop-root.MuiBackdrop-invisible.MuiModal-backdrop.mui-g3hgs1-MuiBackdrop-root-MuiModal-backdrop")).click();
    driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.autocomplete-filter_deleteicon__089Ub.autocomplete-filter_svg-icon__eY7rH.MuiChip-deleteIcon.MuiChip-deleteIconMedium.MuiChip-deleteIconColorDefault.MuiChip-deleteIconFilledColorDefault.mui-1ud17vg-MuiSvgIcon-root")).click();
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.xpath("//*[text() = \"Active\"]")).click();
    driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.filterchip-arrow-cancel-button.mui-ur63mw-MuiSvgIcon-root")).click();
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.xpath("//*[text() = \"Inactive\"]")).click();
    driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.filterchip-arrow-cancel-button.mui-ur63mw-MuiSvgIcon-root")).click();
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
