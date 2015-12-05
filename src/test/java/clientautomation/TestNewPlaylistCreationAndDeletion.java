package clientautomation;

import org.junit.Test;
import org.sikuli.basics.Debug;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

import configs.Configs;
import utils.RandomNameGenerator;
import utils.RetrieveGUIObjectPatterns;
import utils.UserSession;

public class TestNewPlaylistCreationAndDeletion {

	@Test
	public void testNewPlayListCreationDeletion() throws InterruptedException, FindFailed
	{
		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		App app = new App(Configs.APP_NAME);
		UserSession userSession = new UserSession();
		RandomNameGenerator randString = new RandomNameGenerator();

		app.focus();
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		screen.click(guiPatterns.getUserNamePattern());
		userSession.loginUsingValidCredentials();
		screen.wait(guiPatterns.getSearchBoxPattern());
		screen.mouseMove(guiPatterns.getNewPlayListCreationButtonPattern());
		screen.click(guiPatterns.getNewPlayListCreationButtonPattern());
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		screen.mouseMove(guiPatterns.getNewPlaylistDefaultTextBoxPattern());
		screen.click(guiPatterns.getNewPlaylistDefaultTextBoxPattern());
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		screen.type(guiPatterns.getNewPlayListCreationButtonPattern(), randString.nextSessionId(20)+Configs.TEST_PLAYLIST_NAME);
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);

		userSession.logOut();
		app.close();

	}

}
