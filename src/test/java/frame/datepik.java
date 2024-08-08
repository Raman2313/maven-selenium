package frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@class='hasDatepicker']")).sendKeys("25/07/2024");
		String year ="2026";
	    String month = "July";
	    String day = "28";
	    while(true) {
	    String y =	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
	   String m = 	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
	    
	  
                    if(year.equals(y)&&month.equals(m)) {
                    	break;
                    }
               
                    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
	    }
        List<WebElement> alldates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//table//td"));
        for(WebElement dates: alldates) {
        	if(dates.getText().equals(dates)) {
        		dates.click();
        		break;
        	}
        }

	

	}

}
