package main;

import java.util.ArrayList;

import baza.LoggedUser;

public interface IList {
	
	//public CList createNewList(String listName, String listDescription, CUser listCreator);
	public void setListName(String name);
	public void setListDescribtion(String name);
	public void archiveList(boolean archivized);
	public void addNewTask(String taskName, ArrayList<LoggedUser> taskUsers, CDate taskDeadline);
	//public void SetDate();
	//public void setListUsers();
	
	

}
