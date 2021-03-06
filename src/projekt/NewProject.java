package projekt;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

import baza.LoggedUser;
import baza.User;
import main.CList;

public class NewProject implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JLabel projectName, listName;
	protected JButton createNewList, newListAcceptButton, newListCancelButton;
	protected String projectNameString;
	protected JTextField newListFormName;
	protected JTextArea newListFormDesc;
	private JScrollPane ListFormDescScroll;
	private JFrame uchwyt;
	
	//FIX ME: tworzenie usera musi byc gdzies przy loginie i nie na sztywno
	public User loggedUser = new User("Jan", "Kowalski", "jankowal@gmail.com");
	
	//FIX ME: pobieranie i tworzenie projektow ma byc w innym miejscu
	//public CProject currentProject = new CProject("Projekt1", loggedUser);
	public CProject currentProject = new CProject("Projekt1", loggedUser);
	public CList tempList;
	
	
	public NewProject(JFrame uchwyt)
	{		
		this.uchwyt = uchwyt;
		//currentProject = LoggedUser.getInstance().getCurrentProject();
		//System.out.println(currentProject);
        loggedUser.setCurrentProject(currentProject);   
        //projectNameString = loggedUser.getCurrentProject().getProjectName();
        projectNameString = loggedUser.getCurrentProject().getProjectName();
        
        CList test = new CList("Lista1", "opis");
        currentProject.addNewList(test);
        //currentProject.addNewList("nazwa", "opis");
        System.out.println(currentProject.getProjectListsArray());
        
        //System.out.println(tempList);
        /*tempList = new CList("Lista12", "opis", loggedUser);
        currentProject.addNewList(tempList);*/
        
        DrawMainScreen();
        
        for (CList tempList : currentProject.getProjectListsArray()) {
			int i = 0;
        	DrawListName(tempList, i);
        	i++;
		}
        
        
        
        SwingUtilities.updateComponentTreeUI(uchwyt);
	}
	
	public void DrawMainScreen()
	{
		DrawProjectName();
        DrawListButton();
        DrawNewListForm();
        VisibleNewListForm(false); //ukrywanie menu
        
        //FIX ME: dodac wyswietlanie list i taskow
	}
	
	public void DrawProjectName()
	{
        projectName = new JLabel(projectNameString);        
        projectName.setBounds(100, 30, 400, 30);       
        uchwyt.add(projectName);	
	}
	
	public void DrawListName(CList tempList, int i)
	{
		listName = new JLabel(tempList.getListName());
		listName.setBounds(100, 280 + i*40, 400, 30);
		listName.setForeground(Color.WHITE);
		uchwyt.add(listName);
	}
	
	public void DrawListButton()
	{
        createNewList = new JButton("Stworz nowa liste");
        createNewList.setBounds(180, 30, 400, 30);
        createNewList.addActionListener(this);
        uchwyt.add(createNewList);
	}
	
	public void DrawNewListForm()
	{
		newListFormName = new JTextField();
		newListFormName.setBounds(100, 80, 500, 30);
		uchwyt.add(newListFormName);
		
		newListFormDesc = new JTextArea();
		
		ListFormDescScroll = new JScrollPane(newListFormDesc);
		ListFormDescScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		ListFormDescScroll.setBounds(100, 120, 500, 120);
		uchwyt.add(ListFormDescScroll);
		
		newListAcceptButton = new JButton("Dodaj liste");
		newListAcceptButton.setBounds(100, 240, 200, 30);
		newListAcceptButton.addActionListener(this);
		uchwyt.add(newListAcceptButton);
		
		newListCancelButton = new JButton("Anuluj");
		newListCancelButton.setBounds(400, 240, 200, 30);
		newListCancelButton.addActionListener(this);
		uchwyt.add(newListCancelButton);
	}
	
	public void VisibleNewListForm(boolean b)
	{
		newListFormName.setVisible(b);
		ListFormDescScroll.setVisible(b);
		newListAcceptButton.setVisible(b);
		newListCancelButton.setVisible(b);
	}

	@Override
	public void actionPerformed(ActionEvent e) throws NullPointerException{
		
		if (e.getSource() == createNewList)
		{	
			VisibleNewListForm(true);

			SwingUtilities.updateComponentTreeUI(uchwyt);
		}
		
		 if (e.getSource() == newListAcceptButton)
			{
				VisibleNewListForm(false);
				tempList = new CList(newListFormName.getText(), newListFormDesc.getText());
				newListFormName.setText("");
				newListFormDesc.setText("");
				currentProject.addNewList(tempList);
				
				SwingUtilities.updateComponentTreeUI(uchwyt);
				uchwyt.repaint();
		}
		
		if (e.getSource() == newListCancelButton)
		{
			VisibleNewListForm(false);
			newListFormName.setText("");
			newListFormDesc.setText("");
			
			SwingUtilities.updateComponentTreeUI(uchwyt);
		}
	}
}
