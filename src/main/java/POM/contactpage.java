package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactpage {
	//Decleration
			@FindBy(xpath = "//img[@alt='Create Contact...']")
			private WebElement createcontactimage;
			
			@FindBy(name = "firstname")
			private WebElement FirstnameTxt;
			
			@FindBy(name = "lastname")
			private WebElement lastnameTxt;
			
			@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
			private WebElement saveButton;
			
			
			
			
	//Initialization
			public contactpage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				
			}
			
			//utilization
			
			public WebElement getCreatecontactimage() {
				return createcontactimage;
			}




			public WebElement getFirstnameTxt() {
				return FirstnameTxt;
			}




			public WebElement getLastnameTxt() {
				return lastnameTxt;
			}




			public WebElement getSaveButton() {
				return saveButton;
			}
			
//			Business logic
			
			
			public void clickcreatecontactimage()
			{
				createcontactimage.click();
			}
			
			public void clickFirstnameTxt(String conname)
			{
				FirstnameTxt.sendKeys(conname);
			}
			public void clicklastnameTxt(String conname)
			{
				lastnameTxt.sendKeys(conname);
			}
			
			public void savebutton()
			{
				saveButton.click();
			}
		}




			


