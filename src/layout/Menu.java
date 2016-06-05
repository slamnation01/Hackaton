package layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import baza.Login;
import projekt.MyProjects;
import projekt.NewProject;

public class Menu extends JFrame implements ActionListener {
	private Font font1 = new Font("SansSerif", Font.BOLD, 20);
	JLabel napis1, napis2, napis3,napis4,napis5,napis6;
    JTextField login,temat,imie,nazwisko,email,haslo,haslo2;
    JPasswordField password;
    JButton zaloguj,lista,zatwierdz,powrot,dodajZadanie,nowy,harmonogram,rejestracja,zarejestruj,powrot2;
    JTextArea opis;
    JScrollPane pane;
    JLabel textfield;
 
    public Menu() {
    {
    	
    	
        setTitle("Menu");
        setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setContentPane(new JLabel(new ImageIcon("images/back.png")));
        final ImageIcon imageIcon = new ImageIcon("images/textfield.png");
        final ImageIcon imageIcon2 = new ImageIcon("images/button.png");
        final ImageIcon imageIcon3 = new ImageIcon("images/lista.png");
        final ImageIcon imageIcon4 = new ImageIcon("images/nowy.png");
        final ImageIcon imageIcon5 = new ImageIcon("images/harmonogram.png");
        final ImageIcon imageIcon6 = new ImageIcon("images/hover1.png");
        final ImageIcon imageIcon7 = new ImageIcon("images/hover2.png");
        final ImageIcon imageIcon8 = new ImageIcon("images/hover3.png");
        final ImageIcon imageIcon9 = new ImageIcon("images/button2.png");
        final ImageIcon imageIcon10 = new ImageIcon("images/powrot.png");
        
        napis1 = new JLabel("Podej dane:");
        napis1.setForeground(Color.blue);
        napis1.setFont(new Font("font/koz.otf", Font.ITALIC, 15));
 
        napis2 = new JLabel("Login:");
        napis3 = new JLabel("Haslo:");
        napis4 = new JLabel("Temat:");
        napis5 = new JLabel("Opis:");
        napis6 = new JLabel("");
        temat = new JTextField();
        opis = new JTextArea(10,50);
        zaloguj = new JButton(imageIcon2);
        lista = new JButton(imageIcon3);
        nowy = new JButton(imageIcon4);
        harmonogram = new JButton(imageIcon5);
        rejestracja = new JButton(imageIcon9);
        zarejestruj = new JButton(imageIcon2);
        zatwierdz = new JButton("Zatwierdz");
        powrot = new JButton(imageIcon10);
        powrot2 = new JButton(imageIcon10);
        pane = new JScrollPane(opis);
        dodajZadanie = new JButton("Dodaj zadanie");
        
        pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

       login = new JTextField() {
           Image image = imageIcon.getImage();
           {
              setOpaque(false);
           }
           public void paintComponent (Graphics g) {
              g.drawImage(image, 0, 0, this);
              setForeground(Color.white);
              super.paintComponent(g);
           }
       };
       
     
       password = new JPasswordField() {
           Image image = imageIcon.getImage();
           {
              setOpaque(false);
           }
           public void paintComponent (Graphics g) {
              g.drawImage(image, 0, 0, this);
              setForeground(Color.white);
              super.paintComponent(g);
           }
       };
       
       imie = new JTextField() {
           Image image = imageIcon.getImage();
           {
              setOpaque(false);
           }
           public void paintComponent (Graphics g) {
              g.drawImage(image, 0, 0, this);
              setForeground(Color.white);
              super.paintComponent(g);
           }
       };
       
       nazwisko = new JTextField() {
           Image image = imageIcon.getImage();
           {
              setOpaque(false);
           }
           public void paintComponent (Graphics g) {
              g.drawImage(image, 0, 0, this);
              setForeground(Color.white);
              super.paintComponent(g);
           }
       };
       
       email = new JTextField() {
           Image image = imageIcon.getImage();
           {
              setOpaque(false);
           }
           public void paintComponent (Graphics g) {
              g.drawImage(image, 0, 0, this);
              setForeground(Color.white);
              super.paintComponent(g);
           }
       };
       
       
       haslo = new JTextField() {
           Image image = imageIcon.getImage();
           {
              setOpaque(false);
           }
           public void paintComponent (Graphics g) {
              g.drawImage(image, 0, 0, this);
              setForeground(Color.white);
              super.paintComponent(g);
           }
       };
       
       haslo2 = new JTextField() {
           Image image = imageIcon.getImage();
           {
              setOpaque(false);
           }
           public void paintComponent (Graphics g) {
              g.drawImage(image, 0, 0, this);
              setForeground(Color.white);
              super.paintComponent(g);
           }
       };
       
       login.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
       password.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
       imie.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
       nazwisko.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
       email.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
       haslo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
       haslo2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
       
       login.setFont(font1);
       password.setFont(font1);
       imie.setFont(font1);
       nazwisko.setFont(font1);
       email.setFont(font1);
       haslo.setFont(font1);
       haslo2.setFont(font1);

       
       lista.setOpaque(false);
       lista.setContentAreaFilled(false);
       lista.setBorderPainted(false);
       nowy.setOpaque(false);
       nowy.setContentAreaFilled(false);
       nowy.setBorderPainted(false);
       harmonogram.setOpaque(false);
       harmonogram.setContentAreaFilled(false);
       harmonogram.setBorderPainted(false);
       
       
       lista.addMouseListener(new MouseListener() {            
           @Override
           public void mouseReleased(MouseEvent arg0) {}           
           @Override
           public void mousePressed(MouseEvent arg0) {
        	   lista.setIcon(imageIcon3);
           }            
           @Override
           public void mouseExited(MouseEvent arg0) { 
               lista.setIcon(imageIcon3);
           }           
           @Override
           public void mouseEntered(MouseEvent arg0) {
               lista.setIcon(imageIcon6);
           }           
           @Override
           public void mouseClicked(MouseEvent arg0) {}
       });
       
       nowy.addMouseListener(new MouseListener() {            
           @Override
           public void mouseReleased(MouseEvent arg0) {}           
           @Override
           public void mousePressed(MouseEvent arg0) {
        	   nowy.setIcon(imageIcon4);
           }            
           @Override
           public void mouseExited(MouseEvent arg0) { 
               nowy.setIcon(imageIcon4);
           }           
           @Override
           public void mouseEntered(MouseEvent arg0) {
               nowy.setIcon(imageIcon7);
           }           
           @Override
           public void mouseClicked(MouseEvent arg0) {}
       });
       
       
       harmonogram.addMouseListener(new MouseListener() {            
           @Override
           public void mouseReleased(MouseEvent arg0) {}           
           @Override
           public void mousePressed(MouseEvent arg0) {
        	   harmonogram.setIcon(imageIcon5);
           }            
           @Override
           public void mouseExited(MouseEvent arg0) { 
               harmonogram.setIcon(imageIcon5);
           }           
           @Override
           public void mouseEntered(MouseEvent arg0) {
               harmonogram.setIcon(imageIcon8);
           }           
           @Override
           public void mouseClicked(MouseEvent arg0) {}
       });
        napis4.setBounds(200, 50, 200, 30);
        napis5.setBounds(210, 95, 200, 30);
        napis6.setBounds(250, 50, 300, 30);
        login.setBounds(224, 345, 352, 47);
        login.setText("jaszczyk@example.com");
        password.setBounds(224, 445, 352, 47);
        password.setText("1111");
        zaloguj.setBounds(224, 560, 354, 60);

        lista.setBounds(90, 130, 142, 139);
        nowy.setBounds(320, 130, 142, 139);
        harmonogram.setBounds(570, 130, 142, 139);
        
        temat.setBounds(250, 50, 300, 30);
        pane.setBounds(250, 100, 300, 300);
        zatwierdz.setBounds(250, 425, 140, 30);
        powrot.setBounds(630, 670, 123, 60);
        powrot2.setBounds(630, 670, 123, 60);
        dodajZadanie.setBounds(300, 120, 200, 30);
        rejestracja.setBounds(297, 640, 207, 34);
        zarejestruj.setBounds(224, 670, 354, 60);
        
        imie.setBounds(224, 180, 352, 47);
        nazwisko.setBounds(224, 280, 352, 47);
        email.setBounds(224, 380, 352, 47);
        haslo.setBounds(224, 480, 352, 47);
        haslo2.setBounds(224, 580, 352, 47);
 
        opis.setLineWrap(true);
 
        add(login);
        add(password);
        add(zaloguj);
        add(rejestracja);
        
        nowy.addActionListener(this);
        zarejestruj.addActionListener(this);
        rejestracja.addActionListener(this);
        zaloguj.addActionListener(this);
        lista.addActionListener(this);
        zatwierdz.addActionListener(this);
        powrot.addActionListener(this);
        powrot2.addActionListener(this);
        this.setResizable(false);
        SwingUtilities.updateComponentTreeUI(this);
    }
    }
 
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == zaloguj){
        	if (Login.passwordCheck(login, password)){
		        setContentPane(new JLabel(new ImageIcon("images/back3.png")));
		        remove(napis1);
		        remove(napis2);
		        remove(login);
		        remove(napis3);
		        remove(password);
		        remove(zaloguj);
		        add(lista);
		        add(nowy);
		        add(harmonogram);
		        add(powrot);
        	}
        	else {
        		password.setText("");
        		napis1 = new JLabel("Podano z³e dane !!!");
                napis1.setForeground(Color.red);
                napis1.setFont(font1);
                napis1.setBounds(224, 500, 352, 47);
                add(napis1);
			}
        
        SwingUtilities.updateComponentTreeUI(this);
        }

        if(e.getSource() == rejestracja)
        {
        	setContentPane(new JLabel(new ImageIcon("images/back4.png")));
        	remove(napis1);
            remove(napis2);
            remove(login);
            remove(napis3);
            remove(password);
            remove(zaloguj);
            
            add(imie);
            add(nazwisko);
            add(email);
            add(haslo);
            add(haslo2);
            add(zarejestruj);
            add(powrot);
            
            
            SwingUtilities.updateComponentTreeUI(this);
        }
        
        if (e.getSource() == nowy)
        {
        	setContentPane(new JLabel(new ImageIcon("images/back2.png")));
/*        	add(napis4);
        	add(napis5);
        	add(temat);
        	add(pane);
        	add(zatwierdz);*/
        	add(powrot2);
        	remove(lista);
        	remove(nowy);
            remove(harmonogram);
            remove(powrot);
            NewProject nowy = new NewProject(this);
        	SwingUtilities.updateComponentTreeUI(this);
        }
        
        if (e.getSource() == powrot2)
        {
        	setContentPane(new JLabel(new ImageIcon("images/back3.png")));
        	remove(napis4);
        	remove(napis5);
        	remove(temat);
        	remove(pane);
        	remove(zatwierdz);
        	remove(powrot2);
        	add(lista);
            add(nowy);
            add(harmonogram);
            add(powrot);
            SwingUtilities.updateComponentTreeUI(this);
        }
        
        if (e.getSource() == zatwierdz)
        {
        	
        	napis6.setText(temat.getText());
        	remove(temat);
        	remove(pane);
        	remove(zatwierdz);
        	remove(powrot);
        	remove(napis5);
        	add(napis6);
        	add(dodajZadanie);
        	SwingUtilities.updateComponentTreeUI(this);
        }
        
        if (e.getSource() == powrot)
        {
        	setContentPane(new JLabel(new ImageIcon("images/back.png")));
        	add(login);
            add(password);
            add(zaloguj);
            add(rejestracja);
            
        	remove(imie);
        	remove(nazwisko);
        	remove(email);
        	remove(haslo);
        	remove(haslo2);
        	remove(zarejestruj);
        	remove(powrot);
        	remove(lista);
        	remove(nowy);
        	remove(harmonogram);
        	

        	
        	SwingUtilities.updateComponentTreeUI(this);
        }
        if (e.getSource() == lista){
        	setContentPane(new JLabel(new ImageIcon("images/back2.png")));
        	add(powrot2);
        	remove(powrot);
        	remove(lista);
        	remove(nowy);
        	remove(harmonogram);
        	new MyProjects(this);
        	SwingUtilities.updateComponentTreeUI(this);
        }

    }
}