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
			if ((screen.exists(guiPatterns.getLoginWithFacebookPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!= null) &&
					(screen.exists(guiPatterns.getSignUpOptionLoginScreenPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!= null) &&
					(screen.exists(guiPatterns.getLoginButtonPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!= null))
				Assert.assertTrue(true);
			// If all the required elements are present on the screen , we will be passing the test case
			else
				Assert.assertTrue(false);
			// If any of the element is missing from the screen we would fail the test case
		}

		Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
		app.close();
	}

}


