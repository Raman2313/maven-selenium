package frame;

import org.openqa.selenium.chrome.ChromeDriver;

public class newind {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
          driver.manage().window().maximize();
          

	}

}
