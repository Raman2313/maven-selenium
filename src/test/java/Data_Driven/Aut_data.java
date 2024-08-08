package Data_Driven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Aut_data {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        String file = System.getProperty("user.dir") + "\\Test data\\Project Data.xlsx";
        int rows = ExcelUtils.getRowCount(file, "Sheet1");
        for(int i = 1; i<=rows; i++) {
        	String prin = ExcelUtils.getCellData(file, "Sheet1",  i, 0 );
        	String RateofInterest = ExcelUtils.getCellData(file, "Sheet1",  i, 1 );
        	String per1 = ExcelUtils.getCellData(file, "Sheet1",  i, 2 );
        	String per2 = ExcelUtils.getCellData(file, "Sheet1",  i, 3 ); //drop-1
        	String freq = ExcelUtils.getCellData(file, "Sheet1",  i, 4 );
        	String exp_e = ExcelUtils.getCellData(file, "Sheet1",  i, 5 );

            driver.findElement(By.name("principal")).sendKeys(prin);
            driver.findElement(By.name("interest")).sendKeys(RateofInterest);
            driver.findElement(By.name("tenure")).sendKeys(per1);
            
            
            Select drpdwn = new Select(driver.findElement(By.id("tenurePeriod")));
            drpdwn.selectByVisibleText(per2);
            
            Select drpdwn1 = new Select(driver.findElement(By.id("frequency")));
            drpdwn1.selectByVisibleText(freq);
    
           // System.out.println("hello");
            
    		JavascriptExecutor js = driver;
    		WebElement calculate_btn = driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
    		js.executeScript(" arguments[0].click(); ", calculate_btn );
    	   
    		String act_mvalue = driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
    		if(Double.parseDouble(exp_e)==Double.parseDouble(act_mvalue)) {
    			System.out.println("Test passed");
    			ExcelUtils.setCellData(file, "Sheet1",  i, 7, "Passed");
    			ExcelUtils.fillGreenColor(file, "Sheet1",  i, 7 );
    		}
    		else
    		{
    			System.out.println("Test Failed");
    			ExcelUtils.setCellData(file, "Sheet1",  i, 7, "Failed");
    			ExcelUtils.fillRedColor(file, "Sheet1",  i, 7 );

    			//ExcelUtils.setCellData(file, "Sheet1",  i, 7, "Failed");



    			
    		}
    		Thread.sleep(5000);
    			
            WebElement clear_btn = driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img"));
            
    		js.executeScript(" arguments[0].click(); ", clear_btn );



        }

    
	}

}
