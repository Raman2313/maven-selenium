package JSExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_JS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		JavascriptExecutor js = driver;
		WebElement inputbox = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('value' , 'john')" , inputbox);

	}

}
