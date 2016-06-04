package layout;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static MainFrame instancjaFrame = null;
	
	public static MainFrame getInstance(){
		if(instancjaFrame==null)
			instancjaFrame=new MainFrame();
		return instancjaFrame;
	}
	
	private MainFrame(){
		setTitle("Witaj w programie WellDone");
        setVisible(true);
		setSize(SZEROKOSC/2, (WYSOKOSC/2)+100);
		setLocation(SZEROKOSC/4, (WYSOKOSC/4)-100);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private static int pobierzRozdzielczosc(String wymiar){
		Toolkit zestaw = Toolkit.getDefaultToolkit();
		Dimension rozmiarEkranu = zestaw.getScreenSize();
		if (wymiar.equals("szerokosc")){
			int wysEkranu = rozmiarEkranu.width;
			return wysEkranu;
		}
		else if (wymiar.equals("wysokosc")){
			int szerEkranu = rozmiarEkranu.height;	
			return szerEkranu;
		}
		else 
			return 0;
	}
		
	private static final int SZEROKOSC = pobierzRozdzielczosc("szerokosc");
	private static final int WYSOKOSC = pobierzRozdzielczosc("wysokosc");
}
