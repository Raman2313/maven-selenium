package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_1 {

	  public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
	
		List<WebElement> slider = driver.findElements(By.className("homeslider-container"));
		System.out.println("The total number of slider  "  + slider.size());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("The number of images are "  + images.size());

	}

}
