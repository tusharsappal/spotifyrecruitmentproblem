import java.net.PasswordAuthentication;

public class LoginCredentials {
	private String userName;
	private String passWord;

	public static getUserName()
	{
		return userName;
	}
	public static getPassWord()
	{
		return passWord;
	}

	public static setUserName(String newUserName)
	{
		userName = newUserName;
	}

	public static setPassword(String newPassWord)
	{
		passWord = newPassWord;
	}
}
