package baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase //implements IDataBase
{
	private static Connection conn = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 static final String DB_URL = "sql8.freemysqlhosting.net";
	 static final String User ="sql8122354";
	 static final String Password = "ehmNeFqJvx";
	 
	 private static DataBase instanceBase = null;
	
	 private DataBase(){
		 Connect();
	 }
	 
	 public static DataBase getInstance(){
		 if (instanceBase==null){
			 instanceBase = new DataBase();
		 }
		 return instanceBase;
	 }
	 
	private void Connect()
	 {
		try{
		      Class.forName(JDBC_DRIVER);
		      conn = DriverManager.getConnection(DB_URL,User,Password);
		      //conn.createStatement().executeQuery("Select * from STUDENTS");

		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   
		   }
		
	 }
	
	public void CreateTableUsers() throws SQLException
	{

		try{
		      
		      conn.createStatement().executeQuery("Create table Users(ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,surname VARCHAR2(15), name VARCHAR2(10),"
						+ "password VARCHAR2(10), email VARCHAR2(20)");
			
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
	}
	
	public void CreateTableProjects() throws SQLException
	{

		try{
		      
		      conn.createStatement().executeQuery("Create table Projects(ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,Name VARCHAR2(15), Description VARCHAR2(40),"
						+ "Users VARCHAR2(10), email VARCHAR2(20)");
			
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		
	}
	public void CreateTableList() throws SQLException
	{

		try{
		      
		      conn.createStatement().executeQuery("Create table Users(ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,surname VARCHAR2(15), name VARCHAR2(10),"
						+ "password VARCHAR2(10), email VARCHAR2(20)");
			
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
	}
	
	public void CreateTableTask() throws SQLException
	{

		try{
		      
		      conn.createStatement().executeQuery("Create table Users(ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,surname VARCHAR2(15), name VARCHAR2(10),"
						+ "password VARCHAR2(10), email VARCHAR2(20)");
			
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
	}
	
	
	
	
	
	
	

	
	public void AddUser(String Surname, String Name, String Password, String Email)
	{
		try{
		      
		      conn.createStatement().executeQuery("Insert Into Users Values("+Surname+","+Name+","+Password+","+Email+")");
			
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
	}
	
	public boolean CheckPassword(String Login, String Password)
	{
		boolean pass=true;
		try{
		      
			conn.createStatement().executeQuery("SELECT * FROM STUDENTS WHERE email LIKE " + "'%"+ Login + "%'" + "AND password LIKE "+"'%"+Password+"%' )");
			
		 }catch(SQLException se){
		      pass=false;
		      se.printStackTrace();
		   }catch(Exception e){
		     pass=false;
		      e.printStackTrace();
		   }
		return pass;
	}
	public String[] GetUser(String Login)
	{
		//String[] Users= new String[2];
		String[] User = new String[2];
		try{
		 	  String sql = "SELECT * FROM STUDENTS WHERE email LIKE " + "'%"+ Login + "%'";
		 	  	rs = stmt.executeQuery(sql);
		 	  	  User[0] = rs.getString("surname");
		 	  	  User[1] = rs.getString("name");
		 	  	  User[2] = rs.getString("email");
		
		 }
		catch(SQLException se){
		      se.printStackTrace();
		   }
		catch(Exception e){
		      e.printStackTrace();
		   }
		return User;
	}
	
	
	
	
	
	
	
	
	public void AddProject(String Name, String Description, String[] Users, String[] Lists)
	{
		
		
		try{
		      
		      conn.createStatement().executeQuery("Insert Into Users Values(");
			
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		
		
		
		
		
	}
	
	

}
