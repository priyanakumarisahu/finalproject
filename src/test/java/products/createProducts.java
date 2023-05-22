package products;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Webdriver_Utility;
import Generic_Utility.java_Utility;
import POM.homepage;
import POM.productpage;

public class createProducts extends BaseClass{
	@Test(groups = {"smoketest","regressiontest","sanitytest"})
	public void   CreateProductTest() throws EncryptedDocumentException, IOException {
		Webdriver_Utility wlib=new Webdriver_Utility();
//		wlib.max(driver);
		wlib.implicitywait(driver);
		driver.manage().window().maximize();
		homepage home=new homepage(driver);
		home.clickProductsLinkText();
		 productpage pro=new productpage(driver);
		 pro.clickcreateproductimage();
		 java_Utility jlib=new java_Utility();
			int RanNum = jlib.getRandomNum();
			
			Excel_Utility elib=new Excel_Utility();
			String productData = elib.getExcelData("product", 0, 0)+RanNum;
		 pro.clickproductnametext(productData);
		 pro.savebutton();
		
	}
}
