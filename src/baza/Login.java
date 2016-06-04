package baza;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login{
	private static String sLogin;
	private static String sPassword;
	private static String username;
		
	public static String getUsername() {
		return DataBase.getInstance().GetUser(sLogin)[1];
	}

	public static boolean login(JTextField login, JPasswordField password){
		sLogin = login.getText().trim();
		sPassword = password.getText().trim();
		return DataBase.getInstance().CheckPassword(sLogin, sPassword);
	}
}
