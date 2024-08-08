package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class logo_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubDriv
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/demo");
	
	 WebElement drd=  driver.findElement(By.xpath("//*[@id=\"demo-page\"]/body/div[7]/header/nav/div[2]/a/img"));
		System.out.println("The value of logo pixel window maximize in    "+  drd.getLocation());
		driver.manage().window().minimize();

		System.out.println("The value of logo pixel window minimize in    "+  drd.getLocation());

		driver.manage().window().fullscreen();
		System.out.println("The value of logo pixel window fullscreen in    "+  drd.getLocation());
//		Thread.sleep(3000);
//		Point p = new Point(80,45);
//		driver.manage().window().setPosition(p);
//		System.out.println(drd.getLocation());

		


	}

}
