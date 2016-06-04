package baza;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import projekt.CProject;

public abstract class Login extends User{
	protected static String sLogin;
	private static String sPassword;
		
	protected static String[] getLoggedUserData(){
		return DataBase.getInstance().GetUser(sLogin);
	}
	
	protected static CProject []getLoggedUserProjects(){
		return null;
	}

	public static boolean passwordCheck(JTextField login, JPasswordField password){
		sLogin = login.getText().trim();
		sPassword = password.getText().trim();
		if (!sLogin.isEmpty() || !sPassword.isEmpty())
			return DataBase.getInstance().CheckPassword(sLogin, sPassword);
		return false;
	}
}
