package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class textcompre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("Hello world");
  		Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).perform();
        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();


        



	}

}
