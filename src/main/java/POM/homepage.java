package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Webdriver_Utility;

public class homepage {
	

	//Decleration
		@FindBy(xpath = "(//a[.='Organizations'])[1]")
		private WebElement Organizationslnk;
		
		@FindBy(xpath = "//a[.='Products']")
		private WebElement Productslnk;
		
		@FindBy(xpath = "//a[.='More']")
		private WebElement moreLink;
		
		@FindBy(name ="Campaigns")
		private WebElement Campaignslnk;
		
		@FindBy(xpath ="(//a[.='Contacts'])[1]")
		private WebElement Contactslnk;
		@FindBy(name="Invoice")
		private WebElement Invoicelnk;
	    @FindBy(xpath= "//img[@src='themes/softed/images/user.PNG']")
	    private WebElement signoutImg;
	    @FindBy(xpath = "//a[.='Sign Out']")
		private WebElement signoutLinkText;
	    
	    
		
	  

			//Initialization
	  		public homepage(WebDriver driver) {
	  			PageFactory.initElements(driver, this);
	  		}  
	    
	  	//utilization

			public WebElement getOrganizationslnk() {
				return Organizationslnk;
			}



			public WebElement getProductslnk() {
				return Productslnk;
			}



			public WebElement getMoreLink() {
				return moreLink;
			}



			public WebElement getCampaignslnk() {
				return Campaignslnk;
			}



			public WebElement getContactslnk() {
				return Contactslnk;
			}



			public WebElement getInvoicelnk() {
				return Invoicelnk;
			}



			public WebElement getSignoutImg() {
				return signoutImg;
			}



			public WebElement getSignoutLinkText() {
				return signoutLinkText;
			}



			//	  		 Business Logic for More
			public void moreLink(WebDriver driver)
			{
				Webdriver_Utility wlib = new  Webdriver_Utility();
				 wlib.mouseOverOnElement(driver, moreLink);
				 moreLink.click();
			}
	  		
		//Campaign
	        public void campaignLinkText()
			{
	        	Campaignslnk.click();
			}
	        //Organization
	        public void clickOrganizationsLinkText()
			{
	        	Organizationslnk.click();
			}
	        
	      //Product
	        public void clickProductsLinkText()
			{
	        	Productslnk.click();
			}
	        //Contacts
	        public void clickContactslnk()
			{
	        	Contactslnk.click();
			}
	        
	       
	        
	      //Invoice
	        public void clickInvoicelnk()
			{
	        	Invoicelnk.click();
			}
	        
	      //Sign out
			public void clicksignoutLink(WebDriver driver)
			{
				 
			      Actions act=new Actions( driver);
			          act.moveToElement(signoutImg).perform();
			        signoutLinkText.click();
			}
		
}
	    
	    
	  


