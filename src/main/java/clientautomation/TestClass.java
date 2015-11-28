package clientautomation;

import org.sikuli.script.*;
import org.sikuli.basics.Debug;

public class TestClass {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		Debug.setDebugLevel(3);
		//Screen s = new Screen();
		//s.find(s.userCapture().getFile()).highlight(2);
		App app = new App("Spotify");
		app.open();
		Thread.sleep(20000);
		//app.openAndWait(5);
		System.out.println(app.isRunning());
		app.close();
	}

}


