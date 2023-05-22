package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
	//Decleration
		@FindBy(xpath = "//img[@alt='Create Organization...']")
		private WebElement createOrganizationlnk;
		
		@FindBy(name = "accountname")
		private WebElement OrganizationnameTxt;
		
		@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
		private WebElement saveButton;
		
		//utilization

		public WebElement getCreateOrganizationlnk() {
			return createOrganizationlnk;
		}

		public WebElement getOrganizationnameTxt() {
			return OrganizationnameTxt;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}
		
		//Initialization
		
		public Organizationpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		/**
		 * This Method is used for ClickOn +img
		 */
		public void clickOrganizationCreateImage()
		{
			createOrganizationlnk.click();
		}

		/**
		 * This Method is used to Pass Value to Organization TextField
		 */
		public void clickorganizationNamesTextField(String orgName)
		{
			OrganizationnameTxt.sendKeys(orgName);
		}
		/**
		 * This Method is used to Save OrgName
		 */

		public void savebutton()
		{
			saveButton.click();
		}
	}
		
		


