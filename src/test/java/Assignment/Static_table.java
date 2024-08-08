package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        
        
        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
        
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
        int rowsCount = rows.size();
        System.out.println("Total number of rows: " + rowsCount);
        
        List<WebElement> headers = table.findElements(By.xpath("//tbody/tr/th"));
        int colsCount = headers.size();
        System.out.println("Total number of columns: " + colsCount);
        
        
        // Close the driver
        driver.close();

	}

}
