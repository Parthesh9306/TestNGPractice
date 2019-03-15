package TestNGAnnotations;

import org.testng.annotations.Test;

public class DependencyAnnotations {

	
	@Test
	public void openingBrowser()
	{
		//int i=5/0;
		System.out.println("Opening Browser");
	}
	

	@Test(dependsOnMethods={"openingBrowser"})
	public void flightBooking()
	{
		System.out.println("Flight booking");
	}
}
