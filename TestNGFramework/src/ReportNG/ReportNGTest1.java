package ReportNG;

import org.testng.annotations.Test;

public class ReportNGTest1 {

	@Test
	public void reportNGTest1Test()
	{
		System.out.println("First Report NG Test");
		
		int i = 5/0;
	}
	
	@Test
	public void reportNGTest2Test()
	{
		System.out.println("Second Report NG Test");
	}
}
