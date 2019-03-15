package TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	
	

	@BeforeMethod
	public void CreateUserID()
	{
		System.out.println("UserId created");
	}
	@AfterMethod
	public void DeleteUserID()
	{
		System.out.println("UserId Deleted");
	}
	
	@BeforeTest
	public void setCookies()
	{
		System.out.println("Created cookies before test");
	}
	@AfterTest
	public void DeleteCookies()
	{
		System.out.println("Deleted cookies after test");
	}
	
	@Test
	public void openBrowser()
	{
		System.out.println("Opening Browser");
	}
	
	
	//below method will not be executed as @Test is not mentioned.
	public void CloseBrowser()
	{
		System.out.println("Closing Browser");
	}
	
	@Test
	public void flightBooking()
	{
		//OpenBrowser();
		System.out.println("Flight Booking");
	}
	
}
