package Data_Driven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class java_ss {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
		
	//	String file = System.getProperty("user.dir") + "\\Data_Driven_Testing\\Project Data.xlsx";
		
		String file= "C:\\Users\\Rishabh Patel\\eclipse-workspace\\Selenium_Maveen_SDET\\Testing Data\\Calculator1.xlsx" ;
				
		
		int rows = ExcelUtils.getRowCount(file, "Sheet1");
		
		for(int i = 1; i<=rows; i++) 
		{
			String Ini_Depo_Amut = ExcelUtils.getCellData(file, "Sheet1", i , 0);
			String length_of_gd = ExcelUtils.getCellData(file, "Sheet1", i , 1);
			String rate = ExcelUtils.getCellData(file, "Sheet1", i , 2);
			String comp = ExcelUtils.getCellData(file, "Sheet1", i , 3);
			String exp_worth = ExcelUtils.getCellData(file, "Sheet1", i , 4);
			
			
			driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(Ini_Depo_Amut);
			driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys(length_of_gd);
			System.out.println();
			driver.findElement(By.name("//*[@id=\"mat-input-2\"]")).sendKeys(rate);
			driver.findElement(By.xpath("//mat-select[@id='mat-select-0']")).click();
			driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span")).click();
			
//			Select compdrpdwn = new Select(driver.findElement(By.name("tenurePeriod")));
//			compdrpdwn.selectByVisibleText(comp);
			
			
			//click Calculate Button
			
			//driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[2]/div[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[2]/a[1]/img[1]")).click();
//			JavascriptExecutor js = driver;
//			WebElement calculate_btn = driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
//			js.executeScript("arguments[0].click();",calculate_btn);
//			
			String act_mvalue=driver.findElement(By.xpath("//*[@id=\"displayTotalValue\"]")).getText();
			
		//	Thread.sleep(3000);

			if(Double.parseDouble(exp_worth)==Double.parseDouble(act_mvalue))
			{
			
					System.out.println("Test Passed");	
					ExcelUtils.setCellData(file , "Sheet1", i, 7, "PASS");
					ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
			}
			else
			{
				System.out.println("Test Fail");	
				ExcelUtils.setCellData(file, "Sheet1", i, 7, "FAIL");
				ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
			}
			
//			Thread.sleep(3000);
//			//clicking clear button
//			WebElement clear_btn = driver.findElement(By.xpath("//img[@class='PL5']"));
//			js.executeScript("arguments[0].click();",clear_btn);
//			
//			Thread.sleep(3000);
		}

	}

}