package JSExecuter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;


public class scroll_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");

		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy(0,300)", " ");
		Thread.sleep(3000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		WebElement text = driver.findElement(By.xpath("/html/body/footer/div/div/div/div[1]/div/div[2]/p"));
		js.executeScript("arguments[0].scrollIntoView();", text);
	}


	}


