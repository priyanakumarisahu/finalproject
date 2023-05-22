package Generic_Utility;

import java.util.Random;

public class java_Utility {
	/*
	 * This method is used to avoid duplicates
	 * @author priyanka
	 */
	
	public int getRandomNum() 
	{
		Random ran=new Random() ;
		int RanNum = ran.nextInt(1000);
			
		return RanNum;
		
	}

}
