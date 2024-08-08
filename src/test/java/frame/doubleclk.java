package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclk {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
       WebElement frame = driver.findElement(By.id("iframeResult"));
       driver.switchTo().frame(frame);
       Thread.sleep(3000);
       
     WebElement button =  driver.findElement(By.xpath("//*[@id=\"field1\"]"));
     Thread.sleep(3000);
     button.clear();
     button.sendKeys("Welcome");
     WebElement copytext = driver.findElement(By.xpath("/html/body/button"));
		Actions act = new Actions(driver);
		act.doubleClick(copytext).perform();
	//	System.out.println(driver.findElement(By.xpath("//*")));
		


	}

}
