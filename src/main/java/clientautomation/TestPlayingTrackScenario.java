package clientautomation;

import java.awt.AWTException;

import org.junit.Test;
import org.sikuli.basics.Debug;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.RetrieveUpdateLoginCredentials;

public class TestPlayingTrackScenario {

	@Test
	public void testPlayingTrack() throws FindFailed, InterruptedException, AWTException {

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
		Thread.sleep(3000);

		screen.click(guiPatterns.getPopChillOutThumbNailImagePattern());
		Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		//screen.click(guiPatterns.getTrendingThumbnailImagePattern());
		//screen.click(guiPatterns.getViralHitsThumbnailPattern());


		Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		screen.click(guiPatterns.getUserNameDropDownPattern());
		Thread.sleep(3000);
		screen.click(guiPatterns.getLogoutButtonPattern());


		System.out.println(app.isRunning());
		app.close();
	}

}
