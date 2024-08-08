package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frm {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Ramnan");
		//Approcah-1 --id/name
	 //  driver.switchTo().frame((WebElement) By.id("frm1"));
		
		//approach2-webelement
	WebElement   frame1 = driver.findElement(By.xpath("//*[@id=\"frm1\"]"));
	   WebElement dd= driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
	   Select drpdown = new Select(dd);
	   Thread.sleep(300);
	   drpdown.selectByVisibleText("- Java");
	   driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("back");

	   
	}

}
