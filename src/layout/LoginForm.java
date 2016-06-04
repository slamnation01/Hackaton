package layout;

import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {
	private JTextField login;
	private JPasswordField password;
	
	public JTextField getLogin() {
		return login;
	}
	public JPasswordField getPassword() {
		return password;
	}
	
	public LoginForm() {
		this.login = new JTextField();
		this.password = new JPasswordField();
	}
}
