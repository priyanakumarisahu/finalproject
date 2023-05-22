package invoice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Webdriver_Utility;
import Generic_Utility.java_Utility;
import POM.Invoicepage;
import POM.homepage;

public class createInvoice extends BaseClass{
	@Test
	public void CreateInvoice() throws EncryptedDocumentException, IOException {
		Webdriver_Utility wlib=new Webdriver_Utility();
//		wlib.max(driver);
		wlib.implicitywait(driver);
	    homepage home=new homepage(driver);
	    home.moreLink(driver);
	    home.clickInvoicelnk();
	    Invoicepage ino=new Invoicepage(driver);
	    ino.clickcreateInvoicimage();
	    java_Utility jlib=new java_Utility();
		int RanNum = jlib.getRandomNum();
		
		Excel_Utility elib=new Excel_Utility();
		String InoData = elib.getExcelData("Invoice", 0, 0)+RanNum;
		ino.clickInvoicnameTxt(InoData);
		
	    ino.savebutton();

	    
	}

}
