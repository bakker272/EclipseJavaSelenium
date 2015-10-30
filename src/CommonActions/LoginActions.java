package CommonActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import UI_Map.Login_UI;

public class LoginActions {

	// Declaring Driver and Wait Objects for Actions
    WebDriver driver;
    WebDriverWait wait;
	//Initializing UI_Map Classes
	Login_UI loginUI = new Login_UI();
	
	public LoginActions(WebDriver driver,WebDriverWait wait)
	{
        this.driver = driver;
        this.wait = wait;
	}
	
	public String LoginToGmail()
	{
		String loggedInUserName = "";
		
		driver.findElement(loginUI.signInBtn).click();
		
		
		return loggedInUserName;
	}
	
}
