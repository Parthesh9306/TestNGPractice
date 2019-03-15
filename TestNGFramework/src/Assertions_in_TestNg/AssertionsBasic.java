package Assertions_in_TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertionsBasic {

	Assertion hardAssert = new Assertion();
	
	SoftAssert softAssert = new SoftAssert();
	
	/*@Test
	public void hardAssert()
	{
		System.out.println("First statement in Hard Assertion");
		
		hardAssert.assertEquals(3, 3);
		System.out.println("First hard assert is passed");
		
		hardAssert.assertEquals(3, 2);
		System.out.println("Second hard assert is failed"); // this statement will not be executed
	}*/
	
	@Test
	public void softAssert()
	{
		System.out.println("First statement in Soft Assertion");
		
		softAssert.assertEquals(2, 2);
		System.out.println("First soft assert is passed");
		
		softAssert.assertEquals(3, 2);
		System.out.println("Second soft assert is failed");
		
		softAssert.assertAll();
	}
}
