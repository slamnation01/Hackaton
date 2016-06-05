package projekt;

import java.util.ArrayList;

import baza.LoggedUser;
import baza.User;
import main.CList;

public class CProject implements IProject{
	protected String projectName, projectDescription;
	protected ArrayList<User> projectManagersArray = new ArrayList<>();
	protected ArrayList<User> projectUsersArray = new ArrayList<>();
	protected ArrayList<CList> projectListsArray = new ArrayList<>();
	
	//Konstruktor
	
	public CProject(String name, User user)
	{
		this.projectName = name;
		this.projectManagersArray.add(user);
		this.projectDescription = null;
		this.projectUsersArray = null;
		//this.projectListsArray = null;
	}
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public ArrayList<User> getProjectManagersArray() {
		return projectManagersArray;
	}

	public void setProjectManagersArray(ArrayList<User> projectManagersArray) {
		this.projectManagersArray = projectManagersArray;
	}

	public ArrayList<User> getProjectUsersArray() {
		return projectUsersArray;
	}

	public void setProjectUsersArray(ArrayList<User> projectUsersArray) {
		this.projectUsersArray = projectUsersArray;
	}

	public ArrayList<CList> getProjectListsArray() {
		return projectListsArray;
	}

	public void setProjectListsArray(ArrayList<CList> projectListsArray) {
		this.projectListsArray = projectListsArray;
	}
	
	

	@Override
	public void editProjectManagers(ArrayList<User> managerArray) {

		this.projectManagersArray = managerArray;
		
	}

	@Override
	public void editProjectUsers(ArrayList<User> userArray) {

		this.projectUsersArray = userArray;
		
	}

	@Override
	public void setProjectDescribtion(String desc) {

		this.projectDescription = desc;
		
	}

	@Override
	public void addNewList(String listName, String listDescription, LoggedUser listCreator) {

		CList newList = new CList(listName, listDescription);
		projectListsArray.add(newList);
		
	}


	@Override
	public void removeProjectManager() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addProjectManager() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeProjectUser() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addProjectUser() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewList(CList list) {
		
		projectListsArray.add(list);
	}

	/*@Override
	public void addNewList(CList list) {
		
		projectListsArray.add(list);
	}*/
}
