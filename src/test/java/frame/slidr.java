package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slidr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
       WebElement slidder = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
       System.out.println(slidder.getLocation());
       Actions act = new Actions(driver);
       act.dragAndDropBy(slidder, 100,0).perform();
       System.out.println("after slider value " +  slidder.getLocation());
       WebElement slidder1 = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
       System.out.println(slidder1.getLocation());
     //  Actions act = new Actions(driver);
       act.dragAndDropBy(slidder1, -100,0).perform();
       System.out.println("after slider value " +  slidder1.getLocation());


       


	}

}
