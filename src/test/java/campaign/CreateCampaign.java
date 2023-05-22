package campaign;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Webdriver_Utility;
import Generic_Utility.java_Utility;
import POM.campaignpage;
import POM.homepage;

public class CreateCampaign extends BaseClass{
	@Test(groups = {"smoketest","regressiontest","sanitytest"})
	public void CreateCampaignTest() throws EncryptedDocumentException, IOException {
		 Webdriver_Utility wlib=new Webdriver_Utility();
			wlib.implicitywait(driver);
         homepage home=new homepage(driver);
         home.moreLink(driver);
         home.campaignLinkText();
         campaignpage cam=new campaignpage(driver);
          cam.createcampaignimage();
			java_Utility jlib=new java_Utility();
			int RanNum = jlib.getRandomNum();
			Excel_Utility elib=new Excel_Utility();
			String CampData = elib.getExcelData("Campaigns", 0, 0)+RanNum;
			cam.campaignnametext(CampData);
			cam.savebutton();
	}
	

}
