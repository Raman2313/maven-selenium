package Grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class nop_grouping {
	
	ChromeDriver driver;
	 @BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
	}
	 
	 
	 @Test(priority=1)
	 void URL() {
		String url= driver.getCurrentUrl();
		Assert.assertEquals(url, "https://demo.nopcommerce.com/login?returnUrl=%2F");
		 
	 }
	 
	
	@Test(priority=2 ,dataProvider ="dp")
	void TestLogin(String email, String pass) {
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
       String exp = "nopCommerce demo store";
       String act = driver.getTitle();
       Assert.assertEquals(exp, act,"test is failed");
		

		
	} 
	@DataProvider(name = "dp")
	  String[][] LoginData() {
		  String data [][] = {{"rishupatel002@gmail.com","123456"},
				  				{"ramnsingh2305@gmail.com","passwd"},
				  				{"nitika1995@gmail.com","abcds"},
				  				{"priya1997@gmail.com","abcds"}};
		  return data;
	}
	
	@AfterClass
	void teraDown() {
		driver.close();
		
	}
	}
	


