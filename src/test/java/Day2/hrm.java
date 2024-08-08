package Day2;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class hrm {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
          
   		ChromeDriver driver =new ChromeDriver();
   		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   		
   		Thread.sleep(3000);
   		driver.findElement(By.name("username")).sendKeys("Admin");
   		Thread.sleep(3000);
   		driver.findElement(By.name("password")).sendKeys("admin123");
   		Thread.sleep(3000);
		driver.findElement(By.className("oxd-button")).click();
   		//Thread.sleep(5000);
   		
		driver.close();



	}

}
