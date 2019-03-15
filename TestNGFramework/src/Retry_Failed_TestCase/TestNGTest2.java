package Retry_Failed_TestCase;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGTest2 {

		@Test(retryAnalyzer = RetryClass.class)
		public void reportNGTest3Test()
		{
			System.out.println("First Test NG Test 2");
		}
		
		@Test(retryAnalyzer = RetryClass.class)
		public void reportNGTest4Test()
		{
			//int i = 6/0;
			Assert.assertTrue(5>6);
			System.out.println("Second Test NG Test 2");
		}
		
	
}
