package clientautomation;

import org.sikuli.script.*;
import java.awt.AWTException;
import org.sikuli.basics.Debug;
import configs.Configs;
import utils.RetrieveGUIObjectPatterns;;

public class TestLoginScenarioWithValidCredentials {

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {

		Debug.setDebugLevel(3);
		Screen screen = new Screen();			
		ImagePath.add(System.getProperty("user.dir")+Configs.IMAGE_PATH);
		RetrieveGUIObjectPatterns guiPatterns = new RetrieveGUIObjectPatterns();	
		App app = new App(Configs.APP_NAME);
		app.focus();
		Thread.sleep(5000);
		screen.click(guiPatterns.getUserNamePattern());

		screen.type(guiPatterns.getPasswordPattern(),"Accompany123");

		screen.click(guiPatterns.getLoginButtonPattern());

		screen.wait(guiPatterns.getUserNameTopBannerPattern());

		if(screen.exists(guiPatterns.getUserNameTopBannerPattern()) != null)
		{
			screen.click(guiPatterns.getNameDropDownPattern());
			//screen.wait()
			screen.wait(guiPatterns.getNameDropDownPattern());
			screen.click(guiPatterns.getLogoutButtonPattern());
			Thread.sleep(3000);
		}

		System.out.println(app.isRunning());
		Thread.sleep(2000);
		app.close();
	}

}


