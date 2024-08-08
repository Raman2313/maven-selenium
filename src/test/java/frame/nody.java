package frame;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		WebElement Reg = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
  		Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).click(Reg).keyUp(Keys.CONTROL).build().perform();
        Set <String>winds =driver.getWindowHandles();
        List<String> wid  = new ArrayList(winds);
        String parentid = wid.get(0);
        String Childid = wid.get(1);
       driver.switchTo().window(parentid);
        



	}

}
