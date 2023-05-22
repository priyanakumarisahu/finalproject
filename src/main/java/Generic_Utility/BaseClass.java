package Generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import POM.campaignpage;
import POM.homepage;
import POM.loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  WebDriver driver;

	@BeforeSuite(groups = {"smoketest","regressiontest","sanitytest"})
	public void BS()
	{
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest(groups = {"smoketest","regressiontest","sanitytest"})
	public void BT()
	{
		System.out.println("Parallel Execution");
	}
	

	@BeforeClass(groups = {"smoketest","regressiontest","sanitytest"})

     public void BC() throws Throwable
	{
		Property_Utility plib = new Property_Utility();
		String BROWSER = plib.getKeyValue("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else 
		{
			driver = new ChromeDriver();
		}
		System.out.println("Launching browser");
	}
     
	@BeforeMethod(groups = {"smoketest","regressiontest","sanitytest"})
	public void BM() throws Throwable 
	
	{
		//common data
		Property_Utility plib=new Property_Utility();
				String URL = plib.getKeyValue("url");
				String USERNAME = plib.getKeyValue("username");
				String PASSWORD = plib.getKeyValue("password");
				
		//navigate to application
		driver.get(URL);
		//step1:login
		loginpage LoginPage = new loginpage(driver);
		LoginPage.loginToApp(USERNAME, PASSWORD);
			
		System.out.println("Login Application");
	}
	
	@AfterMethod(groups = {"smoketest","regressiontest","sanitytest"})
	public void AM()
	{
		//step 6:logout
		homepage home=new homepage(driver);
		
		home.clicksignoutLink(driver);
		
		
		System.out.println("Logout Application");
	}
	
	@AfterClass(groups = {"smoketest","regressiontest","sanitytest"})
	public void AC()
	{
		driver.quit();
		
		System.out.println("Browser closed");
	}
	
	@AfterTest(groups = {"smoketest","regressiontest","sanitytest"})
	public void AT()
	{
		System.out.println("parallel exceution done");
	}
	
	@AfterSuite(groups = {"smoketest","regressiontest","sanitytest"})
	public void AS()
	{
		System.out.println("database connection closed");
	}
}
