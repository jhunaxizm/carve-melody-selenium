import org.junit.Test;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	  private WebDriver driver;
	  private String baseUrl;
	  //private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://life-coaching-with-melody.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testDemo1() throws Exception {
		    driver.get(baseUrl + "/shop/");
		    driver.findElement(By.linkText("Select options")).click();
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    driver.findElement(By.linkText("View Cart")).click();
		    driver.findElement(By.id("coupon_code")).clear();
		    driver.findElement(By.id("coupon_code")).sendKeys("$12.50 off");
		    driver.findElement(By.name("apply_coupon")).click();
		    driver.findElement(By.name("update_cart")).click();
		    driver.findElement(By.linkText("Proceed to Checkout")).click();
		    driver.findElement(By.id("billing_first_name")).clear();
		    driver.findElement(By.id("billing_first_name")).sendKeys("Jhun Rey");
		    driver.findElement(By.id("billing_last_name")).clear();
		    driver.findElement(By.id("billing_last_name")).sendKeys("Cubelo");
		    driver.findElement(By.id("billing_email")).clear();
		    driver.findElement(By.id("billing_email")).sendKeys("jhun.carve@gmail.com");
		    driver.findElement(By.id("billing_phone")).clear();
		    driver.findElement(By.id("billing_phone")).sendKeys("1234567");
		    Select dropdowncountry = new Select(driver.findElement(By.id("billing_country")));
		    dropdowncountry.selectByVisibleText("Philippines");
		    driver.findElement(By.id("billing_address_1")).clear();
		    driver.findElement(By.id("billing_address_1")).sendKeys("123 Addresss");
		    driver.findElement(By.id("billing_city")).clear();
		    driver.findElement(By.id("billing_city")).sendKeys("Davao");
		    driver.findElement(By.id("billing_postcode")).clear();
		    driver.findElement(By.id("billing_postcode")).sendKeys("8000");
		    Select dropdownstate = new Select(driver.findElement(By.id("billing_state")));
		    dropdownstate.selectByVisibleText("Davao del Sur");
		    driver.findElement(By.id("place_order")).click();
		    driver.findElement(By.linkText("Download file: Integration Small Shifts Video and Workbook")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

//	  private boolean isElementPresent(By by) {
//	    try {
//	      driver.findElement(by);
//	      return true;
//	    } catch (NoSuchElementException e) {
//	      return false;
//	    }
//	  }
//
//	  private boolean isAlertPresent() {
//	    try {
//	      driver.switchTo().alert();
//	      return true;
//	    } catch (NoAlertPresentException e) {
//	      return false;
//	    }
//	  }
//
//	  private String closeAlertAndGetItsText() {
//	    try {
//	      Alert alert = driver.switchTo().alert();
//	      String alertText = alert.getText();
//	      if (acceptNextAlert) {
//	        alert.accept();
//	      } else {
//	        alert.dismiss();
//	      }
//	      return alertText;
//	    } finally {
//	      acceptNextAlert = true;
//	    }
//	  }
	  
}
