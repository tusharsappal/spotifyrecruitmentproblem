package clientautomation;

import org.sikuli.script.*;
import java.awt.AWTException;
import org.sikuli.basics.Debug;
import configs.Configs;
import utils.RetrieveGUIObjectPatterns;
import utils.RetrieveUpdateLoginCredentials;

public class TestLoginScenarioWithInValidCredentials {

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {

		Debug.setDebugLevel(3);
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
			System.out.println("Test");

			// Need to improve some portions of the test script
		}

		//     
		//		screen.wait(guiPatterns.getUserNameTopBannerPattern());
		//
		//		if(screen.exists(guiPatterns.getUserNameTopBannerPattern()) != null)
		//		{
		//			Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		//			screen.click(guiPatterns.getUserNameDropDownPattern());
		//			//screen.wait()
		//			screen.wait(guiPatterns.getUserNameDropDownPattern());
		//			screen.click(guiPatterns.getLogoutButtonPattern());
		//			Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		//		}
		//
		System.out.println(app.isRunning());
		Thread.sleep(Configs.DEFAULT_SLEEP_VALUE);
		app.close();
	}

}


