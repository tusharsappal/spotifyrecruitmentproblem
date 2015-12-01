package clientautomation;

import org.sikuli.script.*;
import java.awt.AWTException;

import org.junit.Assert;
import org.junit.Test;
import org.sikuli.basics.Debug;
import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.UserSession;

public class TestLoginScenarioWithInValidCredentials {

	@Test
	public void testLoginScenarioWithInvalidCredentials() throws FindFailed, InterruptedException, AWTException {

		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		UserSession userSession = new UserSession();
		App app = new App(Configs.APP_NAME);

		app.focus();
		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		userSession.enterInValidCredentials();
		screen.wait(guiPatterns.getInvalidCredentialsErrorPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);

		if(screen.exists(guiPatterns.getInvalidCredentialsErrorPattern()) != null)
		{
			// We will be adding more tests here like checking for the presence of login button etc.
			if ((screen.exists(guiPatterns.getLoginWithFacebookPattern())!= null) &&
					(screen.exists(guiPatterns.getSignUpOptionLoginScreenPattern())!= null))
				Assert.assertTrue(true);
			else
				Assert.assertTrue(false);
			// Need to improve some portions of the test script
		}

		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		app.close();
	}

}


