package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Utility {
	/**
	 * This method is used to Launch the Application
	 * @param key
	 * @return
	 * @throws Throwable
	 * @author DELL
	 */
	public  String getKeyValue(String key) throws Throwable
	{
		 FileInputStream fis=new FileInputStream("./src/test/resources/propertyfilesData.properties");
	        Properties pro=new Properties();
	        pro.load(fis);
	        String Value = pro.getProperty(key);
	        return Value;
	        
	}
}