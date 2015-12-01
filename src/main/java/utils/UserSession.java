package utils;

import utils.RetrieveGUIObjectPatterns;
import org.sikuli.script.*;


// This class is a wrapper class to provide basic methods for typing username and password in text fields etc.

public class UserSession {

	RetrieveGUIObjectPatterns guiPatterns;
	Screen screen ;

	public UserSession() {
		guiPatterns = new RetrieveGUIObjectPatterns();
		screen = new Screen();
	}

	public void typetUserName() throws FindFailed
	{
		screen.click(guiPatterns.getUserNamePattern());
		screen.type(guiPatterns.getPasswordPattern(),RetrieveUpdateLoginCredentials.getUserName());
	}

	public void typeCorrectPassword() throws FindFailed
	{
		screen.type(guiPatterns.getPasswordPattern(),RetrieveUpdateLoginCredentials.getPassWord());
	}

	public void typeInCorrectPassword() throws FindFailed
	{
		screen.type(guiPatterns.getPasswordPattern(),RetrieveUpdateLoginCredentials.getInvalidPassword());
	}

	public void clickLoginButton() throws FindFailed
	{
		screen.click(guiPatterns.getLoginButtonPattern());
	}

	public void loginUsingValidCredentials() throws FindFailed
	{
		// We assume that the user name is already entered and we go ahead and type the password only
		typeCorrectPassword();
		clickLoginButton();
	}

	public void enterInValidCredentials() throws FindFailed
	{
		// We assume again that the user name is already entered and we only enter the invalid password
		typeInCorrectPassword();
		clickLoginButton();
	}
}
