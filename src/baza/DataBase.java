package baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class DataBase //implements IDataBase
{
	protected Connection conn = null;
	protected static Statement stmt = null;
	protected static ResultSet rs = null;
	protected static String sql = null;

	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 static final String DB_URL = "jdbc:mysql://sql8.freemysqlhosting.net/sql8122359";
	 static final String User ="sql8122359";
	 static final String Password = "IyKN3AHaZm";
	private static DataBase instanceBase = null;
	
	protected static String projects[][];
	protected static  String users[][];
	protected static String lists[][];
	
	 public DataBase()
		{
			Connect();
		}
	 
	 public static DataBase getInstance()
	 {
		 if (instanceBase == null)
		 {
			 instanceBase = new DataBase();
		 }
		 return instanceBase;
	 }
	public void Connect()
	 {
		try{
		      Class.forName(JDBC_DRIVER);
		      conn = DriverManager.getConnection(DB_URL,User,Password);
		      //conn.createStatement().executeQuery("Select * from STUDENTS");
		      System.out.println("POLACZONO");
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   } 	
	 }
	public void Disconnect()
	{
		try{  
		      conn.close();
		      System.out.println("ROZLACZONO");
		     
		}catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
	}
	
	public void CreateTableUsers() 
	{
		try{  
		      stmt=conn.createStatement();
		    stmt.executeUpdate("Drop Table users;");
		      String sql = "Create table users(ID VARCHAR(3) NOT NULL,surname VARCHAR(50), name VARCHAR(50), password VARCHAR(50), email VARCHAR(50));";
			stmt.executeUpdate(sql);
			System.out.println("DODANO TABELE USERS");
		     
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
		      
		      conn.createStatement().executeQuery("Create table Projects(ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,Name VARCHAR2(15), Description VARCHAR2(40),Users VARCHAR2(10), email VARCHAR2(20)");
			
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
		      
		      conn.createStatement().executeQuery("Create table users(ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,surname VARCHAR2(15), name VARCHAR2(10),"
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
		      
		      conn.createStatement().executeQuery("Create table users(ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,surname VARCHAR2(15), name VARCHAR2(10),"
						+ "password VARCHAR2(10), email VARCHAR2(20)");
			
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
	}
	
public void AddNaSztywno()
{
	try{
		//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (1,'Jaszczyk','Wojciech','1111','jaszczyk@example.com');");
		//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (2,'Bochniarz','Wojciech','2222','bochniarz@example.com');");
		//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (3,'Baum','Tadeusz','3333','baum@example.com');");
		//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (4,'Skrzypiec','Kamil','4444','skrzypiec@example.com');");
	      
		stmt = conn.createStatement();
   	 stmt.executeUpdate("Insert Into users(ID, surname, name, password,email) VALUES ('1','Jaszczyk','Wojciech','1111','jaszczyk@example.com');");	
   	stmt.executeUpdate("Insert Into users(ID, surname, name, password,email) VALUES ('2','Bochniarz','Wojciech','2222','bochniarz@example.com');");	
   	stmt.executeUpdate("Insert Into users(ID, surname, name, password,email) VALUES ('3','Baum','Tadeusz','3333','baum@example.com');");	
   	stmt.executeUpdate("Insert Into users(ID, surname, name, password,email) VALUES ('4','Skrzypiec','Kamil','4444','skrzypiec@example.com');");	
   	
   	 
   	 
   	 System.out.println("DODANO UZYTKOWNIKOW");
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
		      
		      conn.createStatement().executeQuery("Insert Into users Values("+Surname+","+Name+","+Password+","+Email+")");
			
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
		boolean pass=false;
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users WHERE email LIKE '%"+ Login + "%'" + "AND password LIKE "+"'%"+Password+"%'");
			if (rs.next())
				pass=true;
		 }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }
		return pass;
	}
	
	public String[] GetUser(String Login)
	{
		//String[] Users= new String[2];
		String[] User = new String[3];
		try{
		 	  String sql = "SELECT * FROM users WHERE email LIKE " + "'%"+ Login + "%'";
		 	  	rs = stmt.executeQuery(sql);
		 	  	rs.next();
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
	
	
	public void DropTable()
	{
		try{
		      
			stmt = conn.createStatement();
		   	 stmt.executeUpdate("DROP TABLE Users;");
		   	
			 System.out.println("USUNIETO UZYTKOWNIKOW");
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		
	}
	
	
	
}
