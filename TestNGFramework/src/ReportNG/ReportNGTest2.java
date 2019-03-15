package ReportNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class ReportNGTest2 {

		@Test (groups = "smoke")
		public void reportNGTest3Test()
		{
			long id = Thread.currentThread().getId();
			System.out.println("Third Report NG Test " +id);
		}
		
		@Test (groups = "sanity")
		public void reportNGTest4Test()
		{
			long id = Thread.currentThread().getId();
			System.out.println("Fourth Report NG Test " +id);
			
			throw new SkipException("Skip if true");
		}
		
		@Test (groups = "regression")
		public void reportNGTest5Test()
		{
			long id = Thread.currentThread().getId();
			System.out.println("Fifth Report NG Test " +id);
		}
	
}
