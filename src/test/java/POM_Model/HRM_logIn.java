package POM_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRM_logIn {
	//Constructor
	//LOcate element
	//Acrion method
	WebDriver driver;
	HRM_logIn(WebDriver driver)//Chrome,edge
	{
		this.driver= driver;
	}
//locate element
	By logo = By.cssSelector("img[alt='company-branding']"); 
	By LogIn = By.name("username");
	By Password = By.name("password");
	By clickButton = By.xpath("//button[normalize-space()='Login']");

  public void setUserName(String username) {
	  driver.findElement(LogIn).sendKeys("username");
  }
  public void setpassword(String password) {
	  driver.findElement(Password).sendKeys("password");
  }
  public void clicksumit( ) {
	  driver.findElement(clickButton).click(); 
  }
    public Boolean checklogo() {
    	Boolean status = driver.findElement(logo).isDisplayed();
    	return status;
    }

}
