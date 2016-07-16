package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class SuiteBase {
	public WebDriver driver;
	
@BeforeTest
public void setupTest()
{
	driver = new FirefoxDriver();
}

@AfterTest
public void tearownTest()
{
	driver.close();
	driver.quit();
	
}
	
}
