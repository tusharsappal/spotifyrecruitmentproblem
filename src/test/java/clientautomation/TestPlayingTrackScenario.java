package clientautomation;

import java.awt.AWTException;
import org.junit.Test;
import org.sikuli.basics.Debug;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import configs.Configs;
import junit.framework.Assert;
import utils.RetrieveGUIObjectPatterns;
import utils.UserSession;

public class TestPlayingTrackScenario {

	@Test
	public void testPlayingTrack() throws FindFailed, InterruptedException, AWTException {

		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		App app = new App(Configs.APP_NAME);
		UserSession userSession = new UserSession();

		app.focus();
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		try
		{
		  userSession.loginUsingValidCredentials();
		  screen.wait(guiPatterns.getSearchBoxPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		  screen.mouseMove(guiPatterns.getGenresAndMoodsPattern());
		  screen.click(guiPatterns.getGenresAndMoodsPattern());
		  Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		  screen.mouseMove(guiPatterns.getTrendingSongsThumbNailPattern());
		  screen.click(guiPatterns.getTrendingSongsThumbNailPattern());
		  Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		  screen.mouseMove(guiPatterns.getViralHitsThumbNailPattern());
		  screen.click(guiPatterns.getViralHitsThumbNailPattern());
		  // Lets wait for a couple of seconds for the track to play
		  Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);

		// Checking if the search box and the Active PlayButton is present , in this manner we will ensure that the 
		// user is logged in and actively playing the track
		  if (screen.exists(guiPatterns.getActivePlayButtonPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!= null 
				&& (screen.exists(guiPatterns.getSearchBoxPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!=null))
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