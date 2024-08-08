package POM_Model;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogIn_test {
	WebDriver driver;
	//HRM_logIn lp;
	Page_Factory lp;
	@BeforeClass
	void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
			
		}
	@Test(priority=2) 
	void TestLogin() {
	   lp.setUserName("Admin");
	   lp.setpassword("admin123");
	   lp.clicksumit();
	   Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@Test(priority=1)
	void logoCheck() {
		//lp = new HRM_logIn(driver);
		lp = new Page_Factory(driver);
		//Assert.assertEquals(lp.checklogo(null), true);
		
	} 
	@AfterClass
	void teraDown() {
		driver.close(); 
	}

}
