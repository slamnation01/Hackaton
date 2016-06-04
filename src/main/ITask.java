package main;

import baza.LoggedUser;

public interface ITask {
	
	//public CTask createNewTask(String taskName, ArrayList<CUser> taskUsers, CDate taskDeadline);
	public void addUserForTask(LoggedUser user);
	public void removeUserFromTask(LoggedUser user);
	public void setTaskDeadlineDate(CDate date);
	public void setTaskName(String name);
	public void addTaskDescription(String description);
	public void addTaskComment(String comment);
	public void setTaskDone(boolean task);
	
}
