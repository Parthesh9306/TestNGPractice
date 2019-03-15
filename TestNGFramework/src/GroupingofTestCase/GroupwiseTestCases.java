package GroupingofTestCase;

import org.testng.annotations.Test;

public class GroupwiseTestCases {

	@Test (groups = {"smoke" , "sanity"})
	public void firstTest()
	{
		long id = Thread.currentThread().getId();
		System.out.println("First Test " +id);
	}

	@Test (priority = 1 , groups = "sanity")
	public void secondTest()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Second Test " +id);
	}
	
	@Test (groups = "sanity")
	public void thirdTest()
	{
		long id = Thread.currentThread().getId();
		System.out.println("third Test " +id);
	}
	
	@Test (priority = 3 , groups = "regression")
	public void fourthTest() 
	{
		long id = Thread.currentThread().getId();
		System.out.println("fourth Test " +id);
	}
	
	@Test (priority = 2 , groups = "sanity")
	public void fifthTest()
	{
		long id = Thread.currentThread().getId();
		System.out.println("fifth Test " +id);
	}
	
}
