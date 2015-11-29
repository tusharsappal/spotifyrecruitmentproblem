package clientautomation;

import org.sikuli.script.*;
import java.awt.AWTException;
import org.sikuli.basics.Debug;
import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.RetrieveUpdateLoginCredentials;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLoginScenarioWithValidCredentials {

	@Test
	public void testLoginScenarioWithValidCredentials() throws FindFailed, InterruptedException, AWTException {

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

		screen.wait(guiPatterns.getUserNameTopBannerPattern());

		if(screen.exists(guiPatterns.getUserNameTopBannerPattern()) != null)
		{
			Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
			screen.click(guiPatterns.getUserNameDropDownPattern());
			//screen.wait()
			screen.wait(guiPatterns.getUserNameDropDownPattern());
			screen.click(guiPatterns.getLogoutButtonPattern());
			Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		}

		System.out.println(app.isRunning());
		Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		app.close();
	}

}


