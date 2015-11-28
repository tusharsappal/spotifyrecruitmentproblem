package utils;

public class RetrieveUpdateLoginCredentials {
	
	private static String userName;
	private static String passWord;

	public static String getUserName()
	{
		return userName;
	}
	public static String getPassWord()
	{
		return passWord;
	}

	public static void setUserName(String newUserName)
	{
		userName = newUserName;
	}

	public static void setPassword(String newPassWord)
	{
		passWord = newPassWord;
	}

}
