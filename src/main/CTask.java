package main;

import java.util.ArrayList;

import baza.LoggedUser;

public class CTask  implements ITask{

	protected String taskName, taskDescription, taskComment;
	protected ArrayList<LoggedUser> taskUsersArray = new ArrayList<>();
	protected CDate taskDeadlineDate;
	protected boolean done;
	
	
	//Konstruktor
	
	public CTask(String taskName, ArrayList<LoggedUser> taskUsers, CDate taskDeadline)
	{
		this.taskName = taskName;
		this.taskUsersArray = taskUsers;
		this.taskDeadlineDate = taskDeadline;
		this.taskDescription = null;
		this.taskComment = null;
		this.done = false;
	}
	
	//Settery i Gettery
	
	public String getTaskComment() {
		return taskComment;
	}
	public void setTaskComment(String taskComment) {
		this.taskComment = taskComment;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public ArrayList<LoggedUser> getListedUsers() {
		return taskUsersArray;
	}
	public void setListedUsers(ArrayList<LoggedUser> listedUsers) {
		this.taskUsersArray = listedUsers;
	}
	public CDate getDeadlineDate() {
		return taskDeadlineDate;
	}
	public void setDeadlineDate(CDate deadlineDate) {
		this.taskDeadlineDate = deadlineDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public String getTaskName() {
		return taskName;
	}
	
	
	//Metody
	
	@Override
	public void addUserForTask(LoggedUser user) {

		taskUsersArray.add(user);
		
	}
	@Override
	public void removeUserFromTask(LoggedUser user) {

		taskUsersArray.remove(user);
		
	}
	@Override
	public void setTaskDeadlineDate(CDate date) {

		this.taskDeadlineDate = date;
		
	}
	@Override
	public void setTaskName(String name) {

		this.taskName = name;
		
	}
	@Override
	public void addTaskDescription(String description) {

		this.taskDescription = description;
		
	}
	@Override
	public void addTaskComment(String comment) {

		this.taskComment = comment;
		
	}
	@Override
	public void setTaskDone(boolean done) {
		
		this.done = done;
		
	}

	/*
	@Override
	public CTask createNewTask(String taskName, ArrayList<CUser> taskUsers, CDate taskDeadline) {
		
		CTask newTask = new CTask(taskName, taskUsers, taskDeadline);
		
		return newTask;
	}*/


}
