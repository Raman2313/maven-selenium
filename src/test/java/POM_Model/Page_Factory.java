package POM_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_Factory {
	WebDriver driver;
	Page_Factory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		//locacte element
		@FindBy(css= "img[alt ='company-bradnidng']")
		WebElement logo;
		//@FindBy(name= "username")
		//WebElement user_name;
		//USing HOW.NAME method
		@FindBy(how= How.NAME, using = "username")
		WebElement user_name;

		@FindBy(name= "password")
		WebElement pass_word;
		@FindBy(xpath= "//button[normalize-space()='Login']")
		WebElement clickbutton;
		  public void setUserName(String username) {
			  user_name.sendKeys(username);
		  }
		  public void setpassword(String password) {
			  pass_word.sendKeys(password);
		  }
		  public void clicksumit( ) {
			  clickbutton.click(); 
		  }
		    public Boolean checklogo() {
		    	Boolean status = logo.isDisplayed();
		    	return status;
		    }


	
}

	


