package clientautomation;

import org.sikuli.script.*;
import java.awt.AWTException;
import org.sikuli.basics.Debug;

public class TestLoginScenarioWithValidCredentials {

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {

		Debug.setDebugLevel(3);
		Screen screen = new Screen();
		ImagePath.add(System.getProperty("user.dir")+"/src/main/resources/images");
		Pattern userNamePattern = new Pattern("user_name_image.png").similar((float)0.7);
		Pattern userPasswordPattern = new Pattern("user_password_image.png").similar((float)0.7);
		Pattern loginButtonPattern = new Pattern("login_button.png").similar((float)0.7);
		Pattern userNameTopBanner =  new Pattern("user_name_top_banner.png").similar((float)0.7);
		Pattern userNameDropDown = new Pattern("user_name_drop_down.png").similar((float)0.7);
		Pattern logoutButton = new Pattern("logout_button.png").similar((float)0.7);

		App app = new App("Spotify");
		app.focus();
		Thread.sleep(5000);
		screen.click(userNamePattern);

		screen.type(userPasswordPattern,"Accompany123");

		screen.click(loginButtonPattern);

		Thread.sleep(5000);

		if(screen.exists(userNameTopBanner) != null)
		{
			screen.click(userNameDropDown);
			//screen.wait()
			screen.wait(userNameDropDown);
			screen.click(logoutButton);
			Thread.sleep(3000);

		}

		System.out.println(app.isRunning());
		Thread.sleep(2000);
		app.close();
	}

}


