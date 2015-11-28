package utils;

import org.sikuli.script.*;
import configs.*;

import configs.Configs;

public class RetrieveGUIObjectPatterns {
	
	private Pattern userNamePattern = new Pattern("user_name_image.png").similar((float)0.7);
	private Pattern userPasswordPattern = new Pattern("user_password_image.png").similar((float)0.7);
	private Pattern loginButtonPattern = new Pattern("login_button.png").similar((float)0.7);
	private Pattern userNameTopBanner =  new Pattern("user_name_top_banner.png").similar((float)0.7);
	private Pattern userNameDropDownPattern = new Pattern("user_name_drop_down.png").similar((float)0.7);
	private Pattern logoutButtonPattern = new Pattern("logout_button.png").similar((float)0.7);

	public Pattern getUserNamePattern()
	{
		return userNamePattern;
	}

	public Pattern getPasswordPattern() 
	{
		return userPasswordPattern;
	}

	public Pattern getLoginButtonPattern()
	{
		return loginButtonPattern;
	}

	public Pattern getUserNameTopBannerPattern()
	{
		return userNameTopBanner;
	}

	public Pattern getNameDropDownPattern() 
	{
		return userNameDropDownPattern;
	}

	public Pattern getLogoutButtonPattern()
	{
		return logoutButtonPattern;
	}

}
