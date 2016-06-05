package layout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static MainFrame instancjaFrame;
	
	public static MainFrame getInstance() {
		if (instancjaFrame == null){
			instancjaFrame=new MainFrame();
		}
		return instancjaFrame;
	}
	
	private MainFrame() {
		//setSize(SZEROKOSC/2, (WYSOKOSC/2)+100);
		setVisible(true);
		setSize(800,800);
		setLocation(SZEROKOSC/4, (WYSOKOSC/4)-100);
		setTitle("Baza studentów");
		setResizable(false);
		addWindowListener(new WindowAdapter()
		{
			@Override
		    public void windowClosing(WindowEvent e)
		    {
		       dispose();
		    }
		});

	}
	/**
	 * Prywatna funkcja pobieraj¹ca rozdzielczoœæ ekranu przy pomocy klasy Toolkit.
	 */
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