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

public class TestNewPlaylistCreation {

	@Test
	public void testNewPlayListCreation() throws InterruptedException, FindFailed
	{
		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		App app = new App(Configs.APP_NAME);
		UserSession userSession = new UserSession();
		PlayListNameGenerator playListName = new PlayListNameGenerator();

		app.focus();
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		//screen.click(guiPatterns.getUserNamePattern());
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
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

		// We will now try to delete the newly created playlist

		screen.rightClick(guiPatterns.getTestPlayListPattern());
		screen.wait(guiPatterns.getPlayListRightClickOptionPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		screen.click(guiPatterns.getDeletePlayListOptionPattern());

		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);

		userSession.logOut();
		app.close();

	}

}