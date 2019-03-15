package Retry_Failed_TestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer{

	int count = 1; int max_count = 10;
	@Override
	public boolean retry(ITestResult result) {
		if(count<max_count)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
