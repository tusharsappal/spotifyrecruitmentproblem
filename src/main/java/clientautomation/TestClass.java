package clientautomation;

import org.sikuli.script.*;
import java.awt.AWTException;
import org.sikuli.basics.Debug;

public class TestClass {

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {
		System.out.println("Current directory is "+ System.getProperty("user.dir"));
		Debug.setDebugLevel(3);
		Screen screen = new Screen();
		ImagePath.add(System.getProperty("user.dir")+"/src/main/resources/images");
		//System.out.println("Path is"+ TestClass.class.getCanonicalName());
		Pattern userNamePattern = new Pattern("user_name_image_2.png").similar((float)0.7);
		Pattern userPasswordPattern = new Pattern("user_password_image.png").similar((float)0.7);
		Pattern loginButtonPattern = new Pattern("login_button.png").similar((float)0.7);
		Pattern userNameTopBanner =  new Pattern("user_name_top_banner.png");
		Pattern userNameDropDown = new Pattern("user_name_drop_down.png");

		App app = new App("Spotify");
		app.focus();
		Thread.sleep(5000);
		screen.click(userNamePattern);

		// Now navigating to the password field


		screen.type(userPasswordPattern,"Accompany123");

		// Now we will be clicking on the Sign in Button



		screen.click(loginButtonPattern);

		Thread.sleep(5000);

		// First Checking if the user is logged in or not 

		if(screen.exists(userNamePattern) != null)
		{
			screen.click(userNameDropDown);
			//screen.wait()

		}

		// Adding the code to logout from the Client




		System.out.println(app.isRunning());
		Thread.sleep(2000);
		app.close();
	}

}


