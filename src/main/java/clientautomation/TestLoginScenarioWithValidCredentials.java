package clientautomation;

import org.sikuli.script.*;
import java.awt.AWTException;
import org.sikuli.basics.Debug;
import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.RetrieveUpdateLoginCredentials;

import org.junit.Assert;
import org.junit.Test;

public class TestLoginScenarioWithValidCredentials {

	@Test
	public void testLoginScenarioWithValidCredentials() throws FindFailed, InterruptedException, AWTException {

		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		boolean isUserLoggedIn = false;
		App app = new App(Configs.APP_NAME);
		app.focus();
		Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		screen.click(guiPatterns.getUserNamePattern());
		screen.type(guiPatterns.getPasswordPattern(),RetrieveUpdateLoginCredentials.getPassWord());

		screen.click(guiPatterns.getLoginButtonPattern());

		screen.wait(guiPatterns.getUserNameTopBannerPattern());

		if(screen.exists(guiPatterns.getUserNameTopBannerPattern()) != null)
		{
			isUserLoggedIn = true;
			Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
			screen.click(guiPatterns.getUserNameDropDownPattern());
			screen.wait(guiPatterns.getUserNameDropDownPattern());
			screen.click(guiPatterns.getLogoutButtonPattern());
			Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		}

		if (isUserLoggedIn == true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

		System.out.println(app.isRunning());
		Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		app.close();
	}

}


