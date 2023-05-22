package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//Decleration
	
		@FindBy(name="user_name")
		private WebElement untbx;
		
		@FindBy(name="user_password")
		private WebElement pwtbx;
		
		@FindBy(id="submitButton")
		private WebElement lgbtn;
		




//Initialization
		public loginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
			

//Utlization
	public WebElement getUntbx() {
			return untbx;
		}

public WebElement getPwtbx() {
			return pwtbx;
		}

public WebElement getLgbtn() {
			return lgbtn;
		


}


//business logic
		/**
		 * create method 
		 * @param username
		 * @param password
		 */
		public void loginToApp(String username, String password) {
			untbx.sendKeys(username);
			pwtbx.sendKeys(password);
			lgbtn.click();
		}
		}
		

	