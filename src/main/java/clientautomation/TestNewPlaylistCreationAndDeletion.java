package clientautomation;

import org.junit.Test;
import org.sikuli.basics.Debug;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.RetrieveUpdateLoginCredentials;

public class TestNewPlaylistCreationAndDeletion {

	@Test

	public void testNewPlayListCreationDeletion() throws InterruptedException, FindFailed
	{
		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		App app = new App(Configs.APP_NAME);
		app.focus();
		Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		screen.click(guiPatterns.getUserNamePattern());
		screen.type(guiPatterns.getPasswordPattern(),RetrieveUpdateLoginCredentials.getPassWord());
		screen.click(guiPatterns.getLoginButtonPattern());
		screen.wait(guiPatterns.getSearchBoxPattern());

		// Now we will check for the presence of the New Playlist Creation Button 
		// and will try to create a new playlist
		
		System.out.println(app.isRunning());
		app.close();

	}

}
