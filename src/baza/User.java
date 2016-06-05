package baza;

import java.util.ArrayList;

import projekt.CProject;

public class User {
	public User(){};
	public User(String string, String string2, String string3) {
		this.name = string;
		this.surname = string2;
		this.email = string3;
	}
	
	protected String name;
	protected static String email;
	protected String surname;
	protected ArrayList<CProject> userProjects  = new ArrayList<>();
	protected CProject currentProject;
	
	public static String getName() {
		return email;
	}

	public String getSurname() {
		return surname;
	}
	
	public String getEmail() {
		return email;
	}

	protected ArrayList<CProject> getUserProjects() {
		return userProjects;
	}

	public void setUserProjects(ArrayList<CProject> userProjects) {
		this.userProjects = userProjects;
	}

	public CProject getCurrentProject() {
		return currentProject;
	}

	public void setCurrentProject(CProject currentProject) {
		this.currentProject = currentProject;
	}
}
