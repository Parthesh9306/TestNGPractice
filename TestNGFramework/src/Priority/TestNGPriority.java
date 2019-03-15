package Priority;

import org.testng.annotations.Test;

public class TestNGPriority {

	@Test 
	public void firstTest()
	{
		System.out.println("First Test");
	}

	@Test (priority = 1)
	public void secondTest()
	{
		System.out.println("Second Test");
	}
	
	@Test
	public void thirdTest()
	{
		System.out.println("third Test");
	}
	
	@Test (priority = 3)
	public void fourthTest() 
	{
		System.out.println("fourth Test");
	}
	
	@Test (priority = 2)
	public void fifthTest()
	{
		System.out.println("fifth Test");
	}
}
