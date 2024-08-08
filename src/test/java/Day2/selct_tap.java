package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selct_tap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement drpdwn =driver.findElement(By.xpath("//*[@id=\"country\"]"));
		drpdwn.click();
		Select dropdown = new Select(drpdwn);
	       Thread.sleep(3000);
      dropdown.selectByVisibleText("Germany");
      //select by value
       dropdown.selectByValue("uk");
       // dropdown.selectByIndex(0);
        //System.out.println(Select.getSize());
//       List< WebElement > drpdwn1= driver.findElements(By.xpath("//*[@id=\"country\"]//option"));
//       System.out.println(drpdwn1.size());
//       for(WebElement dpdwn:drpdwn1)
//       {
//    	   System.out.println(dpdwn.getText());
//       }
//        


	}

}
