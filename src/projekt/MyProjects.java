package projekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import baza.LoggedUser;

public class MyProjects implements ActionListener{

	protected ArrayList<CProject> myProjectsArray = new ArrayList<>();
	protected JButton buttonTemp;
	
	protected ArrayList<JButton> buttonsArray = new ArrayList<>();
	
	private JPanel jPanel;
	
	
	public MyProjects()
	{
		myProjectsArray = LoggedUser.getInstance().getUserProjects();
		
		for(int i = 0; i < myProjectsArray.size(); i++)
		{
			switch(i){
				case 0:
				{ addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 90, 70, 142, 139); }
				case 1:
				{ addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 330, 70, 142, 139); }
				case 2:
				{ addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 570, 70, 142, 139); }
				case 3:
				{ addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 90, 270, 142, 139); }
				case 4:
				{ addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 330, 270, 142, 139); }
				case 5:
				{ addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 570, 270, 142, 139); }
				case 6:
				{ addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 90, 470, 142, 139); }
				case 7:
				{ addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 330, 470, 142, 139); }
				case 8:
				{ addButton(LoggedUser.getInstance().getUserProjects().get(i).projectName, 570, 470, 142, 139); }	
			}
			
		}
		
	}
	
	void addButton(String s, int x, int y, int width, int height)
	{
		buttonTemp = new JButton(s);
		buttonTemp.setBounds(x, y, width, height);
		buttonTemp.addActionListener(this);
		jPanel.add(buttonTemp);
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
