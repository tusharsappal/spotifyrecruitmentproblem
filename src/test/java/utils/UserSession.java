package utils;

import utils.RetrieveGUIObjectPatterns;
import org.sikuli.script.*;

import configs.Configs;


// This class is a wrapper class to provide basic methods for typing username and password in text fields etc.

public class UserSession {

	RetrieveGUIObjectPatterns guiPatterns;
	Screen screen ;

	public UserSession() {
		guiPatterns = new RetrieveGUIObjectPatterns();
		screen = new Screen();
	}

	private void clickLoginButton() throws FindFailed
	{
		screen.click(guiPatterns.getLoginButtonPattern());
	}

	private void typetUserName() throws FindFailed
	{
		screen.click(guiPatterns.getUserNamePattern());
		screen.type(guiPatterns.getPasswordPattern(),RetrieveUpdateLoginCredentials.getUserName());
	}

	private void typeCorrectPassword() throws FindFailed
	{
		screen.type(guiPatterns.getPasswordPattern(),RetrieveUpdateLoginCredentials.getPassWord());
	}

	private void typeInCorrectPassword() throws FindFailed
	{
		screen.type(guiPatterns.getPasswordPattern(),RetrieveUpdateLoginCredentials.getInvalidPassword());
	}

	private void clickUserProfileDropDown() throws FindFailed
	{
		screen.click(guiPatterns.getUserNameDropDownPattern());
		screen.wait(guiPatterns.getUserNameDropDownPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
	}

	private void clickLogOutButtonOnDropDownMenu() throws FindFailed
	{
		screen.click(guiPatterns.getLogoutButtonPattern());
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

	public void logOut() throws FindFailed
	{
		clickUserProfileDropDown();
		clickLogOutButtonOnDropDownMenu();
	}
}
