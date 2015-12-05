package clientautomation;

import org.junit.Test;
import org.sikuli.basics.Debug;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import configs.Configs;
import junit.framework.Assert;
import utils.PlayListNameGenerator;
import utils.RetrieveGUIObjectPatterns;
import utils.UserSession;

public class TestNewPlaylistCreationDeletion {

	@Test
	public void testNewPlayListCreationDeltion() throws InterruptedException, FindFailed
	{
		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		App app = new App(Configs.APP_NAME);
		UserSession userSession = new UserSession();
		PlayListNameGenerator playListName = new PlayListNameGenerator();
		boolean isPlaylistCreated = false; // Keeping the flag values as false
		boolean isPlayListDeleted = false; 

		app.focus();
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		try
		{
			userSession.loginUsingValidCredentials();
			screen.wait(guiPatterns.getSearchBoxPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			screen.mouseMove(guiPatterns.getNewPlayListCreationButtonPattern());
			screen.click(guiPatterns.getNewPlayListCreationButtonPattern());
			Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			screen.mouseMove(guiPatterns.getNewPlaylistDefaultTextBoxPattern());
			screen.click(guiPatterns.getNewPlaylistDefaultTextBoxPattern());
			Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			screen.type(guiPatterns.getNewPlayListCreationButtonPattern(), playListName.generateName());
			Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			screen.type(Key.ENTER);
			// Now we will be checking if the playlist is present on the screen or not

			if (screen.exists(guiPatterns.getTestPlayListPattern(),Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!=null)
				isPlaylistCreated = true;
			else
				isPlaylistCreated = false;

			// We will now try to delete the newly created playlist
			screen.rightClick(guiPatterns.getTestPlayListPattern());
			screen.wait(guiPatterns.getPlayListRightClickOptionPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			screen.click(guiPatterns.getDeletePlayListOptionPattern());
			// Lets wait for a couple of seconds , and then check for the dismissal of the new playlist from the screen
			Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);

			if (screen.exists(guiPatterns.getTestPlayListPattern())!=null)
				isPlayListDeleted = false;
			else
				isPlayListDeleted = true;

			if (isPlaylistCreated == true && isPlayListDeleted ==true)
				Assert.assertTrue(true);
			// If both the conditions are met we will be marking the test case as pass
			else
				Assert.assertTrue(false);
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}

		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		userSession.logOut();
		app.close();
	}
}