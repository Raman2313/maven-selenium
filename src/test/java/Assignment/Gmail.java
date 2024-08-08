package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&ifkv=AdF4I77o068EmbZudZOrcGIl3i33DvjmEltmW1Z7QIUxg2R8ODBa63-e7uQi67jSZ0kj6ts2HnM&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
          driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ramnsingh2305@gmail.com");
          driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
          driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Rk@2305$");

	}

}