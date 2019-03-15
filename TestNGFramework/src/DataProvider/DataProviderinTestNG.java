package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderinTestNG {

	@Test (dataProvider = "getData")
	public void testLogin(String username, String password)
	{
		
		System.out.println("Username is : " +username +" Password is : " +password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		
		Object[][] dataset = new Object[4][2];
		
		
		dataset[0][0] = "Parthesh";
		dataset[0][1] = "abc123";
		
		dataset[1][0] = "Abhinav";
		dataset[1][1] = "abc456";
		
		dataset[2][0] = "Ajeet";
		dataset[2][1] = "abc789";
		
		return dataset;
	}
	

}
