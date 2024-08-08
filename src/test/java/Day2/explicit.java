package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {
public static void main(String args[]) {
	ChromeDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));(implicit)
		driver.manage().window().maximize();
		WebDriverWait mywait =new WebDriverWait(driver, Duration.ofSeconds(2));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

		driver.findElement(By.name("password")).sendKeys("admin123");
		
	//driver.findElement(By.className("oxd-button")).click();
		//Thread.sleep(5000);
		
}
}
