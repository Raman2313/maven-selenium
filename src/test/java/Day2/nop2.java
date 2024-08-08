package Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
		 // tag #id 
		 //how to check shopping cart valiadation
		 driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@class='button-2 product-box-add-to-cart-button']")).click();
		 Thread.sleep(2000);
		   WebElement dd= driver.findElement(By.xpath("//select[@id='product_attribute_2']"));
		   Select drpdown = new Select(dd);
		   drpdown.selectByVisibleText("2 GB");
          driver.findElement(By.xpath("//input[@id='product_attribute_3_6']")).click();
          driver.findElement(By.xpath("//button[@class='button-1 add-to-cart-button']")).click();
          Thread.sleep(3000);
         if(driver.findElement(By.xpath("//*[@class='cart-qty']")).getText().contains("1")) {
        	 System.out.println("pass");
         }else
         {
        	 System.out.println("failed");
         }
       
		 

		//select[@id='product_attribute_2']
		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Macbook");
		 //tag.class
		// driver.findElement(By.cssSelector("input.[name = 'q']")).sendKeys("Macbook");
		// driver.findElement(By.cssSelector("input[name = 'q']")).sendKeys("Macbook");



	}

}



