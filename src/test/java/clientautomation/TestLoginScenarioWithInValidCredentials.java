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
		// This test script checks that the user is not allowed to enter the Spotify Client app using the false / invalid credentials

		Debug.setDebugLevel(Configs.DEBUG_LEVEL);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();
		UserSession userSession = new UserSession();
		App app = new App(Configs.APP_NAME);
		boolean isUserLoggedin = false; // We will keep that false , to denote that user with invalid credentials is not able to log in 

		app.focus();
		try
		{
			Thread.sleep(Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);
			userSession.enterInValidCredentials();
			screen.wait(guiPatterns.getInvalidCredentialsErrorPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC);

			if(screen.exists(guiPatterns.getInvalidCredentialsErrorPattern()) != null)
			{			
				if ((screen.exists(guiPatterns.getLoginWithFacebookPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!= null) &&
						(screen.exists(guiPatterns.getSignUpOptionLoginScreenPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!= null) &&
						(screen.exists(guiPatterns.getLoginButtonPattern(), Configs.DEFAULT_WAIT_TIME_IN_MILLISEC)!= null))
					isUserLoggedin = false;
				// If all the required elements are present on the screen , we will be passing the test case, we will keep tha flag as false to suggest that user is not logged in
				else
					isUserLoggedin = true;
				// This would mean that the user is logged in by some means and we would fail the test case around this
			}

			if (isUserLoggedin == false)
				Assert.assertTrue(true); // User is not able to login and we will state that the test case has passed
			else
				Assert.assertTrue(false);  // We will be failing the test case 
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}

		app.close();
	}

}