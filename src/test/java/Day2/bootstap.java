package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		WebElement drpdwn =driver.findElement(By.xpath("//button[@title='HTML, CSS']"));
		drpdwn.click();
		Thread.sleep(3000);
           driver.findElement(By.xpath("//input[@value='Java']")).click();
        List< WebElement > drpdwn1= driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));
           System.out.println(drpdwn1.size());
           for(WebElement dpdwn:drpdwn1)
           {
        	   System.out.println(dpdwn.getText());
           }

		

	}

}
