package clientautomation;

import org.sikuli.script.*;
import java.awt.AWTException;
import org.sikuli.basics.Debug;
import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.UserSession;
import org.junit.Assert;
import org.junit.Test;

public class TestLoginScenarioWithValidCredentials {

	@Test
	public void testLoginScenarioWithValidCredentials() throws FindFailed, InterruptedException, AWTException {
		// This test script checks that the user is allowed to enter the Spotify Client application using the correct credentials

		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		UserSession userSession = new UserSession();
		boolean isUserLoggedIn = false;
		App app = new App(Configs.APP_NAME);
		app.focus();
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		try
		{
			userSession.loginUsingValidCredentials();
			screen.wait(guiPatterns.getUserNameTopBannerPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			// If the user name top banner and the search box is present , 
			//we are sure that the user is logged in and we will be marking the test case as pass.

			if((screen.exists(guiPatterns.getUserNameTopBannerPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC) != null) &&
					(screen.exists(guiPatterns.getSearchBoxPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!= null))
			{
				isUserLoggedIn = true;		
				Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			}

			if (isUserLoggedIn == true)
				Assert.assertTrue(true);
			else
				Assert.assertTrue(false);
		}

		catch (Exception e)
		{
			System.out.println(e.getStackTrace());		
		}
		userSession.logOut();
		app.close();
	}

}