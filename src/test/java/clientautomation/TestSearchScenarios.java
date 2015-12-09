package clientautomation;

import java.awt.AWTException;
import org.junit.Assert;
import org.junit.Test;
import org.sikuli.basics.Debug;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.UserSession;

public class TestSearchScenarios {

	@Test
	public void testSearchScenarios() throws FindFailed, InterruptedException, AWTException {

		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		App app = new App(Configs.APP_NAME);
		UserSession userSession = new UserSession();
		boolean isArtistListed = false;

		app.focus();
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);

		try
		{
		userSession.loginUsingValidCredentials();
		screen.wait(guiPatterns.getSearchBoxPattern());

		if (screen.exists(guiPatterns.getSearchBoxPattern())!= null)
		{
			screen.click(guiPatterns.getSearchBoxPattern());
			screen.type(guiPatterns.getSearchBoxPattern(), Configs.ARTIST_SONG_NAME);
			// Lets wait till the search result gets displayed in the list
			screen.wait(guiPatterns.getWhenIWasYourManSongTopResultsInList(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			//Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			if(screen.exists(guiPatterns.getWhenIWasYourManSongTopResultsInList(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!= null)
				isArtistListed = true;
			else
				isArtistListed = false;

			// Now we will try to click on the song to play it .

			Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			
		}

		if (isArtistListed == true)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	    }

	    catch (Exception e)
	    {
	    	System.out.println(e.getStackTrace());
	    }

        userSession.logOut();
		app.close();
	}

}