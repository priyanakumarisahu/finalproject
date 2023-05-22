package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationAndVerificationPage {
	public ValidationAndVerificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//decleration
  @FindBy(id="dtlview_Organization Name")
	private WebElement organisationValidation;

public WebElement getOrganisationValidation() {
	return organisationValidation;
}

//bussiness logics
	public String OrganisationValidation(WebDriver driver,String data)
	{
	String actData = organisationValidation.getText();
	
	if(actData.contains(data))
	   {
	  	 System.out.println("pass");
	   }
	   else
	   {
	  	 System.out.println("fail");
	   }
	return actData;
	}
	}


