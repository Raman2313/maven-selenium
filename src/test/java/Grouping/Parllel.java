package Grouping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parllel {
	WebDriver driver;
	@BeforeClass
     @Parameters("browser")
	void setup(String br) throws InterruptedException {
    	 switch(br)
    	 {
    	 case "chrome":driver = new ChromeDriver();
    	 break;
    	 case "edge":driver = new EdgeDriver();
    	 break;
    	 case "firefox": 
    		 Thread.sleep(10000);
    		 driver = new FirefoxDriver();
    		 break;
    	 default: System.out.println("invalid Browser");
         return;
    	 }
    		 
    	 
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
     
@Test(priority=1)
	void logo() throws InterruptedException {
	Thread.sleep(3000);
		Boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	if(logo) {
		Assert.assertTrue(true);
	}
	else
	{
		Assert.fail();

	}
}
}
