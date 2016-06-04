package projekt;

import java.util.ArrayList;

import baza.LoggedUser;
import baza.User;
import main.CList;

public interface IProject {
	public void addNewList(CList list);
	public void setProjectName(String name);
	public void addNewList(String listName, String listDescription, LoggedUser listCreator);
	public void editProjectManagers(ArrayList<User> managerArray);
	public void editProjectUsers(ArrayList<User> userArray);
	public void setProjectDescribtion(String desc);
	
	public void removeProjectManager();
	public void addProjectManager();
	public void removeProjectUser();
	public void addProjectUser();
	
	public void deleteList();
}
