package clientautomation;

import org.sikuli.script.*;
import java.awt.AWTException;
import org.sikuli.basics.Debug;
import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.RetrieveUpdateLoginCredentials;
import utils.UserSession;

import org.junit.Assert;
import org.junit.Test;

public class TestLoginScenarioWithValidCredentials {

	@Test
	public void testLoginScenarioWithValidCredentials() throws FindFailed, InterruptedException, AWTException {

		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		UserSession userSession = new UserSession();
		boolean isUserLoggedIn = false;
		App app = new App(Configs.APP_NAME);
		app.focus();

		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		userSession.loginUsingValidCredentials();
		screen.wait(guiPatterns.getUserNameTopBannerPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);

		if(screen.exists(guiPatterns.getUserNameTopBannerPattern()) != null)
		{
			isUserLoggedIn = true;
			Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			userSession.logOut();
			Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
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
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		app.close();
	}

}


