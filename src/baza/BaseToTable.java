package baza;

import java.sql.SQLException;

public class BaseToTable extends DataBase {
	
	String projects[][];
	String users[][];
	String lists[][];
	
	
	public String[][] ProjectsToTable()
	{
      try{

	   	  rs = stmt.executeQuery("SELECT COUNT(*) FROM projects;");
    	  rs.next();
    	  projects = new String[rs.getInt(1)][4];
    	  sql= "SELECT * FROM projects ;";
      
      rs = stmt.executeQuery(sql);
      
      int i =0;
      while(rs.next()){
    	  projects[i][0] = rs.getString("name");
    	  projects[i][1] = rs.getString("description");
    	  projects[i][2] = rs.getString("manager");
    	  projects[i][3] = rs.getString("lists");
    	  i++;
      }
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		
		return projects;
	}
	
	public String[][] ListsToTable()
	{
      try{

	   	  rs = stmt.executeQuery("SELECT COUNT(*) FROM lists;");
    	  rs.next();
    	  lists= new String[rs.getInt(1)][6];
    	  sql= "SELECT * FROM lists;";
      
      rs = stmt.executeQuery(sql);
      
      int i =0;
      while(rs.next()){
    	  lists[i][0] = rs.getString("name");
    	  lists[i][1] = rs.getString("description");
    	  lists[i][2] = rs.getString("users");
    	  lists[i][3] = rs.getString("deadline");
    	  lists[i][4] = rs.getString("done");
    	  lists[i][5] = rs.getString("project");
    	  i++;
      }
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		
		return lists;
	}
	
	public String[][] UsersToTable()
	{
      try{

	   	  rs = stmt.executeQuery("SELECT COUNT(*) FROM users;");
    	  rs.next();
    	  users = new String[rs.getInt(1)][5];
    	  sql= "SELECT * FROM users;";
      
      rs = stmt.executeQuery(sql);
      
      int i =0;
      while(rs.next()){
    	  users[i][0] = rs.getString("ID");
    	  users[i][1] = rs.getString("surname");
    	  users[i][2] = rs.getString("name");
    	  users[i][3] = rs.getString("password");
    	  users[i][4] = rs.getString("email");
    	  i++;
      }
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		
		return users;
	}
	
	
	
	
	
	

}
