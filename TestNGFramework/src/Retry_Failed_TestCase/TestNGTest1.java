package Retry_Failed_TestCase;

import org.testng.annotations.Test;

public class TestNGTest1 {

	@Test(retryAnalyzer = RetryClass.class)
	public void TestNGTest1Test()
	{
		System.out.println("First Test NG Test 1");
	}
	
	@Test(retryAnalyzer = RetryClass.class)
	public void TestNGTest2Test()
	{
		System.out.println("Second Test NG Test 1");
	}
}
