package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frmrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");

		   WebElement dd= driver.findElement(By.xpath("html/frameset/frame[1]"));
		   
		   driver.switchTo().frame(dd);
		   driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("111");
		   WebElement frame3= driver.findElement(By.xpath("html/frameset/frame[2]"));
		   driver.switchTo().frame(frame3);
		   driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("111");

		   




	}

}
