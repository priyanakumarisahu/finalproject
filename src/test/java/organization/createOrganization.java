package organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Property_Utility;
import Generic_Utility.Webdriver_Utility;
import Generic_Utility.java_Utility;
import POM.Organizationpage;
import POM.ValidationAndVerificationPage;
import POM.homepage;

public class createOrganization extends BaseClass{
	@Test(groups = {"smoketest","regressiontest","sanitytest"})
	public  void createOrganizationTest() throws EncryptedDocumentException, IOException {
		Property_Utility plib=new Property_Utility();
		driver.manage().window().maximize();
		Webdriver_Utility wlib=new Webdriver_Utility();
		wlib.implicitywait(driver);
		homepage home=new homepage(driver);
		home.clickOrganizationsLinkText();
		Organizationpage org=new Organizationpage(driver);
		org.clickOrganizationCreateImage();
		java_Utility jlib=new java_Utility();
		int RanNum = jlib.getRandomNum();
		Excel_Utility elib=new Excel_Utility();
		String excelData = elib.getExcelData("Organization", 0, 0)+RanNum;
		org.clickorganizationNamesTextField(excelData);
		org.savebutton();
		ValidationAndVerificationPage validate=new ValidationAndVerificationPage(driver);
		String actdata = validate.OrganisationValidation(driver, excelData);
		Assert.assertEquals(excelData, actdata);
		
		
	}
}
