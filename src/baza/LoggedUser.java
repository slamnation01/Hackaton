package baza;

import java.util.ArrayList;

import projekt.CProject;

public final class LoggedUser extends Login{
	private static LoggedUser singletonUser;
	
	private LoggedUser(){
		String [] daneUzytkownika = Login.getLoggedUserData();
		this.surname = daneUzytkownika[0];
		this.email = daneUzytkownika[1];
		this.userProjects = getUserProjects();
		this.currentProject = null;
	}
	
	public static LoggedUser getInstance(){
		if(singletonUser==null){
			singletonUser = new LoggedUser();
		}
		return singletonUser;
	}
}
