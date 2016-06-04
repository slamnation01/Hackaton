package layout;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

import baza.LoggedUser;
import baza.Login;
import projekt.NewProject;

public class Menu extends JFrame implements ActionListener {
	private JLabel napis1, napis2, napis3,napis4,napis5,napis6;
    private JTextField temat, login;
    private JButton zaloguj,nowyProjekt,zatwierdz,powrot, harmonogram;
    private JTextArea opis;
    private JScrollPane pane;
    private JPasswordField password;
    private LoggedUser currentUser = null;
    private MainFrame glowneOkno;
 
    public Menu(MainFrame glowneOkno)
    {
    	this.glowneOkno = glowneOkno;
        napis1 = new JLabel("Podej dane:");
        napis1.setForeground(Color.blue);
        napis1.setFont(new Font("Serif", Font.BOLD, 20));
 
        napis2 = new JLabel("Login:");
        napis3 = new JLabel("Haslo:");
        napis4 = new JLabel("Temat:");
        napis5 = new JLabel("Opis:");
        napis6 = new JLabel("");
        temat = new JTextField();
        opis = new JTextArea(10,50);
        zaloguj = new JButton("Dalej");
        zatwierdz = new JButton("Zatwierdz");
        powrot = new JButton("Powrót");
        pane = new JScrollPane(opis);
        nowyProjekt = new JButton("Nowy projekt");
        harmonogram = new JButton("Harmonogram");
        
        LoginForm loginPaneForm = new LoginForm();
        login = loginPaneForm.getLogin();
        password = loginPaneForm.getPassword();
        login.setText("jaszczyk@example.com");
        password.setText("1111");
        
        pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        napis1.setBounds(100, 30, 400, 30);
        napis2.setBounds(80, 70, 200, 30);
        napis3.setBounds(80, 110, 200, 30);
        napis4.setBounds(200, 50, 200, 30);
        napis5.setBounds(210, 95, 200, 30);
        napis6.setBounds(300, 160, 200, 30);
        login.setBounds(300, 70, 200, 30);
        password.setBounds(300, 110, 200, 30);
        zaloguj.setBounds(150, 160, 100, 30);
        nowyProjekt.setBounds(100, 100, 125, 125);
        harmonogram.setBounds(300, 100, 125, 125);
        temat.setBounds(250, 50, 300, 30);
        pane.setBounds(250, 100, 300, 300);
        zatwierdz.setBounds(250, 425, 140, 30);
        powrot.setBounds(410, 425, 140, 30);
       
        opis.setLineWrap(true);
 
        add(napis1);
        add(napis2);
        add(login);
        add(napis3);
        add(password);
        add(zaloguj);
        zaloguj.addActionListener(this);
        nowyProjekt.addActionListener(this);
        zatwierdz.addActionListener(this);
        powrot.addActionListener(this);
        this.setResizable(false);
        SwingUtilities.updateComponentTreeUI(this); 
    }
 
    public void actionPerformed(ActionEvent e)
    {
    	if (e.getSource() == zaloguj){
	        if (Login.passwordCheck(login, password)){
			     remove(napis2);
			     remove(login);
			     remove(napis3);
			     remove(password);
			     remove(zaloguj);
			     currentUser = LoggedUser.getInstance();
			     napis1.setText("Wiaj " + LoggedUser.getName());
			     add(nowyProjekt);
			     add(harmonogram);
	        }
        	else {
        		login.setText("");
        		password.setText("");
        		add(napis6);
        		napis6.setText("Podaj poprawne dane logowania");
        		napis6.setForeground(Color.red);
			}
	        SwingUtilities.updateComponentTreeUI(this);
    	}
        if (e.getSource() == nowyProjekt)
        {
        	remove(nowyProjekt);
        	remove(harmonogram);
        	new NewProject(glowneOkno);
        	SwingUtilities.updateComponentTreeUI(this);
        }
        
        if (e.getSource() == zatwierdz)
        {
        	opis.setText("");
        	temat.setText("");
        	SwingUtilities.updateComponentTreeUI(this);
        }
        
        if (e.getSource() == powrot)
        {
        	remove(zatwierdz);
        	remove(napis4);
        	remove(napis5);
        	remove(powrot);
        	remove(pane);
        	add(nowyProjekt);
        	remove(temat);
        	remove(opis);
        	add(harmonogram);
        	
        	SwingUtilities.updateComponentTreeUI(this);
        }
    }
    
    public void newFrame()
    {
    	JFrame menu = new JFrame();
    	menu.setVisible(true);
        menu.setSize(600, 600);
        menu.setLayout(null);
        
    }
    
 
   /* public void showData()
    {
        JFrame f1 = new JFrame();
        JLabel l, l0;
 
        String str1 = login.getText();
        char[] p = password.getPassword();
        String str2 = new String(p);
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@mcndesktop07:1521:xe", "sandeep", "welcome");
            PreparedStatement ps = con.prepareStatement("select name from reg where email=? and pass=?");
            ps.setString(1, str1);
            ps.setString(2, str2);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                f1.setVisible(true);
                f1.setSize(600, 600);
                f1.setLayout(null);
                l = new JLabel();
                l0 = new JLabel("you are succefully logged in..");
                l0.setForeground(Color.blue);
                l0.setFont(new Font("Serif", Font.BOLD, 30));
                l.setBounds(60, 50, 400, 30);
                l0.setBounds(60, 100, 400, 40);
 
                f1.add(l);
                f1.add(l0);
                l.setText("Welcome " + rs.getString(1));
                l.setForeground(Color.red);
                l.setFont(new Font("Serif", Font.BOLD, 30));
 
            } else
            {
                JOptionPane.showMessageDialog(null,
                   "Incorrect email-Id or password..Try Again with correct detail");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }*/
 
}
