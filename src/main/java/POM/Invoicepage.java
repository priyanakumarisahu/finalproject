package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invoicepage {
	//Decleration
			@FindBy(xpath = "//img[@alt='Create Invoice...']")
			private WebElement createInvoicimage;
			
			@FindBy(name = "subject")
			private WebElement InvoicnameTxt;
			
			@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
			private WebElement saveButton;
	//Initialization
			
			public Invoicepage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				
			}

			//utilization
			public WebElement getCreateInvoicimage() {
				return createInvoicimage;
			}

			public WebElement getInvoicnameTxt() {
				return InvoicnameTxt;
			}

			public WebElement getSaveButton() {
				return saveButton;
			}
			
//			Business logic
			
			
			public void clickcreateInvoicimage()
			{
				createInvoicimage.click();
			}
			
			public void clickInvoicnameTxt(String inoname)
			{
				InvoicnameTxt.sendKeys(inoname);
			}
			
			public void savebutton()
			{
				saveButton.click();
			}
		}
					
			


