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

		app.focus();
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		userSession.loginUsingValidCredentials();
		screen.wait(guiPatterns.getSearchBoxPattern());

		if (screen.exists(guiPatterns.getSearchBoxPattern())!= null)
		{
			screen.click(guiPatterns.getSearchBoxPattern());
			screen.type(guiPatterns.getSearchBoxPattern(), Configs.ARTIST_SONG_NAME);
			Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			if(screen.exists(guiPatterns.getWhenIWasYourManSongTopResultsInList())!= null)
				Assert.assertTrue(true);
			else
				Assert.assertTrue(false);

			// Now we will try to click on the song to play it .

			Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			userSession.logOut();
		}
		app.close();
	}

}