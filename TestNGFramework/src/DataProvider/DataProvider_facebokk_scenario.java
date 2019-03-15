package DataProvider;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_facebokk_scenario {

	WebDriver driver = null;

	@BeforeTest
	public void invokeApplication(){
	System.setProperty("webdriver.chrome.driver", "D:\\Parthesh IMP\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	}

	@Test(dataProvider = "getData")
	public void loginFaceBook(String userName, String passWord){

	      WebElement firstName = driver.findElement(By.cssSelector("input[id='u_0_2']"));
	  WebElement lastName = driver.findElement(By.cssSelector("input[id='u_0_4']"));
	  
	  firstName.clear();
	  lastName.clear();
	  
	  firstName.sendKeys(userName);
	  lastName.sendKeys(passWord);
	  
	  try {
	Thread.sleep(3000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	}

	@AfterTest
	public void closeApplication(){
	driver.close();
	}


	@DataProvider
	public Object[][] getData(){

	Object[][] dataSet = new Object[4][2];

	dataSet[0][0] = "anshul";
	dataSet[0][1] = "Anshul123";

	dataSet[1][0] = "Alex";
	dataSet[1][1] = "Alex123";

	dataSet[2][0] = "Merilla";
	dataSet[2][1] = "Merilla123";

	dataSet[3][0] = "Jason";
	dataSet[3][1] = "JasonRoy";

	return dataSet;
	}

}
	

