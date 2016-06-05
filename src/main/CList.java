package main;

import java.util.ArrayList;

import baza.LoggedUser;
import baza.User;

public class CList implements IList{

	protected String listName, listDescription;  //Nazwa i opis listy
	//protected CDate date;
	protected ArrayList<CTask> listTasksArray = new ArrayList<>();  //Tablica przechowujaca wszystkie taski z tej listy
	protected User listOwner;  //Tworca listy
	//protected ArrayList<CUser> listUsersArray = new ArrayList<>();  //Tablica przechowujaca uzytkownikow majacych dostep do tej listy
	protected boolean done;  //Flaga sprawdzajaca czy wszytkie taski nalezace do listy sa wykonane
	protected boolean archivized;  //Flaga sprawdzajaca czy lista jest zarchiwizowana czy aktualna
	
	
	//Konstruktor
	
	public CList(String listName, String listDescription)//, User User)
	{
		this.listName = listName;
		this.listDescription = listDescription;
		//this.listOwner = User;
		this.archivized = false;
		this.listTasksArray = null;
		this.done = false;				
	}
	
	
	//Settery i Gettery
	
	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public String getListDescription() {
		return listDescription;
	}

	public void setListDescription(String listDescription) {
		this.listDescription = listDescription;
	}

	public ArrayList<CTask> getListTasksArray() {
		return listTasksArray;
	}

	public void setListTasksArray(ArrayList<CTask> listTasksArray) {
		this.listTasksArray = listTasksArray;
	}

	public User getListOwner() {
		return listOwner;
	}

	public void setListOwner(LoggedUser listOwner) {
		this.listOwner = listOwner;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public boolean isArchivized() {
		return archivized;
	}

	public void setArchivized(boolean archivized) {
		this.archivized = archivized;
	}

	
	//Metody
	
	
	public CList createNewList(String listName, String listDescription){ //CUser listCreator) {

		CList newList = new CList(listName, listDescription);//, listCreator);
		
		return newList;
	}

	@Override
	public void archiveList(boolean archivized) {

		this.archivized = archivized;
		
	}


	@Override
	public void addNewTask(String taskName, ArrayList<LoggedUser> taskUsers, CDate taskDeadline) {
		
		CTask newTask = new CTask(taskName, taskUsers, taskDeadline);
		listTasksArray.add(newTask);
		
	}


	@Override
	public void setListDescribtion(String description) {
		
		this.listDescription = description;
		
	}

}
