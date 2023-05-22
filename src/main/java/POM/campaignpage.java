package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaignpage {
	//Decleration
		@FindBy(xpath = "//img[@alt='Create Campaign...']")
		private WebElement createcampaignimage;
		
		@FindBy(name = "campaignname")
		private WebElement campaignnameTxt;
		
		@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
		private WebElement saveButton;
//Initialization
		
		public campaignpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		//utilization
		public WebElement getcampaigncreateimage() {
			return createcampaignimage;
		}

		public WebElement getCampaignnameTxt() {
			return campaignnameTxt;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}
		
//		Business logic
		
		
		public void createcampaignimage()
		{
			createcampaignimage.click();
		}
		
		public void campaignnametext(String camname)
		{
			campaignnameTxt.sendKeys(camname);
		}
		
		public void savebutton()
		{
			saveButton.click();
		}
	}
		


