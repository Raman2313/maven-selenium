package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	ChromeDriver driver;
  @Test(priority=1)
  void teraUp() {
	   driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
    
  }
  @Test(priority=2)
  void logo() {
	 Boolean logo= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  if(logo) {
		  System.out.println("The logo is displayed");
	  }
	  else {
		  System.out.println("the logo is not displayed");
	  }
	 	  
	  }
  @Test(priority=3)
  void Login() throws InterruptedException {
	  Thread.sleep(3000);
      driver.findElement(By.name("username")).sendKeys("Admin");
      Thread.sleep(3000);
      driver.findElement(By.name("password")).sendKeys("admin123");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

  }
  @Test (priority=4)
  void teraDown() {
	  driver.close();
  }
}
