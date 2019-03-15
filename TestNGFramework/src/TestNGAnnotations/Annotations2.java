package TestNGAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {

	
	@BeforeSuite
	public void checkrequirement()
	{
		System.out.println("Check System Configurations");
		
	}
	@AfterSuite
	public void checkInstallation()
	{
		System.out.println("Installation Completed");
		
	}
	/*@BeforeMethod //Scope is at class level
	public void checkCompatibility()
	{
		System.out.println("OS is : UNIX");
	}
	
	
	/*@BeforeTest
	public void getproperversion()
	{
		System.out.println("selected version is : 3.1.8");
	}*/
	
	
	@Test
	public void znstallSoftware()
	{
		System.out.println("Installation Started..");
	}
}
