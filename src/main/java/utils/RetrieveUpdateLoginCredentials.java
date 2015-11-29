package utils;

public class RetrieveUpdateLoginCredentials {

	private static String userName = "sappal_tushar";
	private static String passWord = "Accompany123";
	private static String inValidPassword = "test123";

	public static String getUserName()
	{
		return userName;
	}
	
	public static String getPassWord()
	{
		return passWord;
	}
	
	public static String getInvalidPassword() 
	{
		return inValidPassword;
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
