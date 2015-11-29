package utils;

import org.sikuli.script.*;

public class RetrieveGUIObjectPatterns {

	private Pattern userNamePattern = new Pattern("user_name_image.png").similar((float)0.7);
	private Pattern userPasswordPattern = new Pattern("user_password_image.png").similar((float)0.7);
	private Pattern loginButtonPattern = new Pattern("login_button.png").similar((float)0.7);
	private Pattern userNameTopBanner =  new Pattern("user_name_top_banner.png").similar((float)0.7);
	private Pattern userNameDropDownPattern = new Pattern("user_name_drop_down.png").similar((float)0.7);
	private Pattern logoutButtonPattern = new Pattern("logout_button.png").similar((float)0.7);
	private Pattern invalidCredentialsErrorPattern = new Pattern("invalid_credentials_error.png").similar((float)0.7);
	private Pattern spotifyLogoLoginScreenPattern = new Pattern("spotify_logo_login_screen.png").similar((float)0.7);
	private Pattern loginWithFaceBookPattern = new Pattern("login_with_facebook.png").similar((float)0.7);
	private Pattern signupOptionLoginScreenPattern = new Pattern("signup_option_login_screen.png").similar((float)0.7);
	private Pattern resetPasswordLoginScreenPattern = new Pattern("reset_password_login_screen.png").similar((float)0.7);
	private Pattern settingsLoginScreenPattern = new Pattern("settings_option_login_screen.png").similar((float)0.7);
	private Pattern searchBoxPattern = new Pattern("search_box.png").similar((float)0.7);
    private Pattern brunoMarsSearchThumbnailPattern = new Pattern("bruno_mars_search_thumbnail_image.png").similar((float)0.7);
	
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

	public Pattern getUserNameDropDownPattern() 
	{
		return userNameDropDownPattern;
	}

	public Pattern getLogoutButtonPattern()
	{
		return logoutButtonPattern;
	}

	public Pattern getInvalidCredentialsErrorPattern()
	{
		return invalidCredentialsErrorPattern;	    	
	}

	public Pattern getSpotifyLogoLoginScreenPattern()
	{
		return spotifyLogoLoginScreenPattern;
	}

	public Pattern getLoginWithFacebookPattern()
	{
		return loginWithFaceBookPattern;
	}

	public Pattern getSignUpOptionLoginScreenPattern()
	{
		return signupOptionLoginScreenPattern;
	}

	public Pattern getResetPasswordLoginScreenPattern()
	{
		return resetPasswordLoginScreenPattern;
	}

	public Pattern getSettingsLoginScreenPattern()
	{
		return settingsLoginScreenPattern;
	}

	public Pattern getSearchBoxPattern()
	{
		return searchBoxPattern;
	}
	
	public Pattern getArtistSearchThumbnailImagePattern()
	{
		// Here we are assuming that the artist we search for is Bruno Mars
		return brunoMarsSearchThumbnailPattern;
	}

}
