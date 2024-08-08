package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
       WebElement country = driver.findElement(By.xpath("//*[@id=\"box6\"]"));
       WebElement capital = driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(country, capital).perform();


       
 
	}

}
