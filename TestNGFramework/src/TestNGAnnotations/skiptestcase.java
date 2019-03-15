package TestNGAnnotations;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptestcase {

	@Test(enabled=true)
	public void AopeningBrowser()
	{
		//int i=5/0;
		System.out.println("Opening Browser");
	}
	
	@Test
	public void flightBooking()
	{
		
		System.out.println("Flight booking");
		
		throw new SkipException("Test skipped");
		
		
	}
	
	@Test
	public void closingBrowser()
	{
		System.out.println("Closing Browser");
	}
}
