package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampWithProdpage {
	//Decleration
	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement createproductimage;
	
	@FindBy(name = "productname")
	private WebElement productnametext;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	@FindBy(xpath = "//img[@alt='Create Campaign...']")
	private WebElement createcampaignimage;
	
	@FindBy(name = "campaignname")
	private WebElement campaignnameTxt;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	
	//Initialization
	
	public CampWithProdpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

//utilization:
	
	public WebElement getCreateproductimage() {
		return createproductimage;
	}


	public WebElement getProductnametext() {
		return productnametext;
	}


	public WebElement getSavebutton() {
		return savebutton;
	}


	public WebElement getCreatecampaignimage() {
		return createcampaignimage;
	}


	public WebElement getCampaignnameTxt() {
		return campaignnameTxt;
	}


	public WebElement getSaveButton() {
		return saveButton;
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
	
	
	
	public void createcampaignimage()
	{
		createcampaignimage.click();
	}
	
	public void campaignnametext(String camname)
	{
		campaignnameTxt.sendKeys(camname);
	}
	
	public void saveButton()
	{
		saveButton.click();
	}


}
