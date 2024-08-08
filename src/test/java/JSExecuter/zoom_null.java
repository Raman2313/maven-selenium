package JSExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoom_null {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().fullscreen();

		JavascriptExecutor js = driver;
		js.executeScript("document.body.style.zoom = '50%'");
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom = '80%'");

	}

}
