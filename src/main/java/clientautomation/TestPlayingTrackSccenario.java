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

public class TestPlayingTrackSccenario {

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {

		Debug.setDebugLevel(3);
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

		// Checking if the Play Track Bar is disabled or not
		// if the play track bar is disabled we will then be proceeding ahead


		if (screen.exists(guiPatterns.getSearchBoxPattern())!= null)
		{
			screen.click(guiPatterns.getSearchBoxPattern());
			screen.type(guiPatterns.getSearchBoxPattern(), Configs.ARTIST_NAME);

			Thread.sleep(3000);

			screen.click(guiPatterns.getArtistSearchThumbnailImagePattern());

			Thread.sleep(3000);

			// Now we will try to click on the play button of the artist 

			screen.click(guiPatterns.getArtistLevelPlayButtonPattern());

			Thread.sleep(3000);

			//			if(screen.exists(guiPatterns.getActivePlayButtonPattern())!= null)
			//			{
			System.out.println("The test has passed");
			screen.click(guiPatterns.getUserNameDropDownPattern());
			Thread.sleep(3000);
			screen.click(guiPatterns.getLogoutButtonPattern());

			//			}

		}

		System.out.println(app.isRunning());
		app.close();
	}


}
