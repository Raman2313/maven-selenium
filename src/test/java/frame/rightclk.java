package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclk {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
      WebElement right = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions act = new Actions(driver);
		act.contextClick(right).perform();
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
         System.out.println(driver.findElement(By.xpath("//*[@id=\"field2\"]")).getAttribute("value"));

	}

}
