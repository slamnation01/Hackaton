package main;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {
	public JTextField login;
	public JPasswordField password;
	
	public JTextField getLogin() {
		return login;
	}

	public JPasswordField getPassword() {
		return password;
	}

	public LoginForm() {
		login = new JTextField();
		password = new JPasswordField();
	}
}
