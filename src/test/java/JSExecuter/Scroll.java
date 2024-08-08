package JSExecuter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		JavascriptExecutor js = driver;
		//  js.executeScript("window.scrollBy(0,300)", " ");

		js.executeScript("window.scrollBy(0,300)", " ");
		Thread.sleep(5000);

		System.out.println( js.executeScript("return window.pageYofset;"));
		WebElement text = driver.findElement(By.xpath("/html/body/footer/div/div/div/div[1]/div/div[2]/p"));
		js.executeScript("arguments[0].scrollIntoView();", text);
	//	js.executeScript("window.scrollBy(", args)


	}

}
