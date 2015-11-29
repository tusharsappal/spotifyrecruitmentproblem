package clientautomation;

import org.sikuli.script.*;
import java.awt.AWTException;

import org.junit.Assert;
import org.junit.Test;
import org.sikuli.basics.Debug;
import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.RetrieveUpdateLoginCredentials;

public class TestLoginScenarioWithInValidCredentials {

	@Test
	public void testLoginScenarioWithInvalidCredentials() throws FindFailed, InterruptedException, AWTException {

		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		App app = new App(Configs.APP_NAME);
		app.focus();
		Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		screen.click(guiPatterns.getUserNamePattern());
		screen.type(guiPatterns.getPasswordPattern(),RetrieveUpdateLoginCredentials.getInvalidPassword());

		screen.click(guiPatterns.getLoginButtonPattern());
		Thread.sleep(3000);

		screen.wait(guiPatterns.getInvalidCredentialsErrorPattern());

		if(screen.exists(guiPatterns.getInvalidCredentialsErrorPattern()) != null)
		{
			// We will be adding more tests here like checking for the presence of login button etc.
			if ((screen.exists(guiPatterns.getLoginWithFacebookPattern())!= null) &&
					(screen.exists(guiPatterns.getSignUpOptionLoginScreenPattern())!= null))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			// Need to improve some portions of the test script
		}

		System.out.println(app.isRunning());
		Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		app.close();
	}

}


