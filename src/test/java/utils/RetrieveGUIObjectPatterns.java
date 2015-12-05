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
	private Pattern artistLevelPlayButtonPattern = new Pattern("artist_play_button.png").similar((float)0.7);
	private Pattern activePlayButtonPattern = new Pattern("active_play_button.png").similar((float)0.7);
	private Pattern activePauseButtonPattern = new Pattern("active_pause_button.png").similar((float)0.7);
	private Pattern whenIWasYourManTopResultsInListPattern = new Pattern("when_i_was_your_man_top_results_in_list.png").similar((float)0.7);
	private Pattern getGenresAndMoodsPattern = new Pattern("genres_and_mood.png").similar((float)0.7);
	private Pattern trendingSongsThumbNailPattern = new Pattern("trending_songs_thumbnail_image.png").similar((float)0.7);
	private Pattern viralSongsThumbNailPattern = new Pattern("viral_hits_thumbnail_image.png").similar((float)0.7);
	private Pattern newPlayListCreationPattern = new Pattern("new_playlist_creation_button.png").similar((float)0.7);
	private Pattern newPlayListDefaultTextBoxPattern = new Pattern("new_playlist_default_textbox.png").similar((float)0.7);
	private Pattern testPlayListPattern = new Pattern("new_test_playlist.png").similar((float)0.7);
	private Pattern playListRightClickOptionPattern = new Pattern("play_list_right_click_options.png").similar((float)0.7);
	private Pattern deletePlayListOptionPattern  = new Pattern("play_list_delete_option.png").similar((float)0.7);

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

	public Pattern getArtistLevelPlayButtonPattern()
	{
		return artistLevelPlayButtonPattern;
	}

	public Pattern getArtistLevelPauseButtonPattern()
	{
		return activePauseButtonPattern;
	}

	public Pattern getActivePlayButtonPattern()
	{
		return activePlayButtonPattern;
	}

	public Pattern getWhenIWasYourManSongTopResultsInList()
	{
		return whenIWasYourManTopResultsInListPattern;
	}

	public Pattern getGenresAndMoodsPattern()
	{
		return getGenresAndMoodsPattern;
	}

	public Pattern getTrendingSongsThumbNailPattern()
	{
		return trendingSongsThumbNailPattern;
	}

	public Pattern getViralHitsThumbNailPattern()
	{
		return viralSongsThumbNailPattern;
	}

	public Pattern getNewPlayListCreationButtonPattern()
	{
		return newPlayListCreationPattern;
	}

	public Pattern getNewPlaylistDefaultTextBoxPattern()
	{
		return newPlayListDefaultTextBoxPattern;
	}

	public Pattern getTestPlayListPattern()
	{
		return testPlayListPattern;
	}

	public Pattern getPlayListRightClickOptionPattern()
	{
		return playListRightClickOptionPattern;
	}

	public Pattern getDeletePlayListOptionPattern()
	{
		return deletePlayListOptionPattern;
	}
}
