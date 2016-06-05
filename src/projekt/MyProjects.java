package projekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import baza.LoggedUser;

public class MyProjects implements ActionListener{

	protected ArrayList<CProject> myProjectsArray = new ArrayList<>();
	protected JButton buttonTemp;
	
	protected ArrayList<JButton> buttonsArray = new ArrayList<>();
	
	private JFrame uchwytFrame;
	
	final ImageIcon imageIcon = new ImageIcon("images/proj.png");
	final ImageIcon imageIcon2 = new ImageIcon("images/hover4.png");
	
	public MyProjects(JFrame uchwyFrame)
	{
		this.uchwytFrame = uchwyFrame;
		myProjectsArray = LoggedUser.getInstance().getUserProjects();
		
		CProject temProject = new CProject("nazwa112", LoggedUser.getInstance());
		myProjectsArray.add(temProject);
		
		CProject temProject1 = new CProject("naz", LoggedUser.getInstance());
		myProjectsArray.add(temProject1);
		
		for(int i = 0; i < myProjectsArray.size(); i++)
		{
			switch(i){
				case 0:
					addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 90, 70, 142, 139); 
					break;
				case 1:
					addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 330, 70, 142, 139);
					break;
				case 2:
					addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 570, 70, 142, 139);
					break;
				case 3:
					addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 90, 270, 142, 139);
					break;
				case 4:
					addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 330, 270, 142, 139);
					break;
				case 5:
					addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 570, 270, 142, 139);
					break;
				case 6:
					addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 90, 470, 142, 139);
					break;
				case 7:
					addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 330, 470, 142, 139);
					break;
				case 8:
					addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 570, 470, 142, 139);
					break;
			}
		}
	}
	
	void addButton(String s, int x, int y, int width, int height)
	{
		buttonTemp = new JButton(imageIcon);
		buttonTemp.setOpaque(false);
	    buttonTemp.setContentAreaFilled(false);
	    buttonTemp.setBorderPainted(false);
	    buttonTemp.addMouseListener(new MouseListener() {            
	           @Override
	           public void mouseReleased(MouseEvent arg0) {}           
	           @Override
	           public void mousePressed(MouseEvent arg0) {
	        	   buttonTemp.setIcon(imageIcon);
	           }            
	           @Override
	           public void mouseExited(MouseEvent arg0) { 
	               buttonTemp.setIcon(imageIcon);
	           }           
	           @Override
	           public void mouseEntered(MouseEvent arg0) {
	               buttonTemp.setIcon(imageIcon2);
	           }           
	           @Override
	           public void mouseClicked(MouseEvent arg0) {}
	       });
	    
		buttonTemp.setBounds(x, y, width, height);
		buttonTemp.addActionListener(this);
		uchwytFrame.add(buttonTemp);
		buttonsArray.add(buttonTemp);		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == buttonsArray.get(0))
		{	
			//Przeskok do projektu 1
		}
		
		if (e.getSource() == buttonsArray.get(1))
		{	
			//Przeskok do projektu 2
		}
	}

	
		
}