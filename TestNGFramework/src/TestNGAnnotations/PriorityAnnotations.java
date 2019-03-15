package TestNGAnnotations;

import org.testng.annotations.Test;

public class PriorityAnnotations {

	
	@Test(priority=0)
	public void openingBrowser()
	{
		//int i=5/0;
		System.out.println("Opening Browser");
	}
	

	@Test(priority=1)
	public void flightBooking()
	{
		System.out.println("Flight booking");
	}
}
