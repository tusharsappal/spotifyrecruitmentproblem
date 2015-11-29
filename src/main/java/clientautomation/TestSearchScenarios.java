package clientautomation;

import java.awt.AWTException;

import org.sikuli.basics.Debug;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.RetrieveUpdateLoginCredentials;

public class TestSearchScenarios {

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {

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

		if (screen.exists(guiPatterns.getSearchBoxPattern())!= null)
		{
			screen.click(guiPatterns.getSearchBoxPattern());
			screen.type(guiPatterns.getSearchBoxPattern(), Configs.ARTIST_NAME);

			Thread.sleep(3000);

			screen.click(guiPatterns.getArtistSearchThumbnailImagePattern());

			Thread.sleep(3000);

			screen.click(guiPatterns.getUserNameDropDownPattern());
			Thread.sleep(3000);
			screen.click(guiPatterns.getLogoutButtonPattern());
		}

		System.out.println(app.isRunning());
		app.close();
	}


}
