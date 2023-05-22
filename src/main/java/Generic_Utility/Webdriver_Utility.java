package Generic_Utility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webdriver_Utility {
	/**
	 * This method wait for page to load in GUI
	  * @param driver
	 */
	public void implicitywait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
	}
	/**
	 * this method is used to switching windows
	 * @param driver
	 * @param partialwindowTitle
	 */
	public void Switchwindow(WebDriver driver,String partialwindowTitle) {
		Set<String>allId = driver.getWindowHandles();
		//iterator is one kind of loop
		 Iterator<String> id = allId.iterator();//if we want particular window from all window ids 
		 //hasnext iterator is present or not id is present or not 
		 while(id.hasNext())
	      {
	    	  String wid = id.next();//org
	    	  driver.switchTo().window(wid);//switch
	    	  String title = driver.getTitle();//org title taking
	    	  
	    	  //with the help of partial title we switch to the window
	    	  
	    	  if(title.contains(partialwindowTitle)) //need production (here e mention partial )
	    	  {
	    		  break;
	    	  }
	      }
	
	}
	public void mouseOverOnElement(WebDriver driver, WebElement morelink) {
		// TODO Auto-generated method stub
		
	}

}
