package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class flunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));(implicit)
		FluentWait mywait = new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(30));
		mywait.pollingEvery(Duration.ofSeconds(5));
		mywait.ignoring(ElementNotInteractableException.class);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

				driver.findElement(By.name("password")).sendKeys("admin123");

	}

}
