package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/");
		WebElement Computer = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
		WebElement desktop = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(Computer).moveToElement(desktop).click().build().perform();


	}

}
