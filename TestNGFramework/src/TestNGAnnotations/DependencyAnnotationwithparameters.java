package TestNGAnnotations;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependencyAnnotationwithparameters {

	
	@Test
	public void openingBrowser()
	{
		int i=5/0;
		System.out.println("Opening Browser");
	}
	

	@Test(dependsOnMethods={"openingBrowser"},alwaysRun=true)
	public void flightBooking()
	{
		System.out.println("Flight booking");
	}
}
