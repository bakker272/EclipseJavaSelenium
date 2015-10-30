package Tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import CommonActions.LoginActions;
import TestData.LoginData;
import Utilities.SuiteBase;

public class LoginToGMail extends SuiteBase {

	
	
	LoginData lData = new LoginData();
	
	@Test(priority=2)
	public void verifyValidloginToGmail()
	{
		// Defining Suite Wait-Time
		WebDriverWait wait = new WebDriverWait(driver,60);
		// Initializing Utilities
		// Initializing CommonActions
		LoginActions lAct = new LoginActions(driver,wait);
		driver.get(lData.appURL);
		driver.manage().window().maximize();
		lAct.LoginToGmail();	
	}
	
	@Test(priority=1)
	public void verifyInValidloginToGmail()
	{
		// Defining Suite Wait-Time
		WebDriverWait wait = new WebDriverWait(driver,60);
		// Initializing Utilities
		// Initializing CommonActions
		LoginActions lAct = new LoginActions(driver,wait);
		driver.get(lData.appURL);
		driver.manage().window().maximize();
		lAct.LoginToGmail();	
	}
	
}
