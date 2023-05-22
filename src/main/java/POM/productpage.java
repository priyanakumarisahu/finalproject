package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpage {
	//Decleration
			@FindBy(xpath = "//img[@alt='Create Product...']")
			private WebElement createproductimage;
			
			@FindBy(name = "productname")
			private WebElement productnametext;
			
			@FindBy(xpath = "//input[@title='Save [Alt+S]']")
			private WebElement savebutton;
	
			
			//Initialization
			
			public productpage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				
			}

//utilization
			public WebElement getCreateproductimage() {
				return createproductimage;
			}


			public WebElement getProductnametext() {
				return productnametext;
			}


			public WebElement getSavebutton() {
				return savebutton;
			}
		

//Business logic
			public void clickcreateproductimage()
			{
				createproductimage.click();
			}
			
			public void clickproductnametext(String proname)
			{
				productnametext.sendKeys(proname);
			}
			
			
			public void savebutton()
			{
				savebutton.click();
			}
		}
			
	
			
			
			
			
			
			
			


