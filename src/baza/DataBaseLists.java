package baza;

import java.sql.SQLException;

public class DataBaseLists extends DataBase
{
	public DataBaseLists()
{
	
}
	public void CreateTableLists() 
	{
		
		try{  
			 stmt=conn.createStatement();
			stmt.executeUpdate("Drop Table lists");
		     String sql = "Create table lists (name VARCHAR(50), description VARCHAR(100), users VARCHAR(50), deadline VARCHAR(50), done VARCHAR(5),project VARCHAR(50) );";
			stmt.executeUpdate(sql);
			System.out.println("DODANO TABELE LISTS");
		     
		}catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
	}
	
		
	public void AddLists(String Name, String Description, String Users, String Deadline, String Done, String Project)
	{
		try{
		      stmt = conn.createStatement();
		      sql="Insert Into Lists( name, description, users, deadline, done, project) VALUES ("+Name+","+Description+","+Users+","+Deadline+","+Done+","+Project+");";
		      stmt.executeUpdate(sql);
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		
	}
	
	public void AddLists()
	{
		try{
			//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (1,'Jaszczyk','Wojciech','1111','jaszczyk@example.com');");
			//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (2,'Bochniarz','Wojciech','2222','bochniarz@example.com');");
			//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (3,'Baum','Tadeusz','3333','baum@example.com');");
			//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (4,'Skrzypiec','Kamil','4444','skrzypiec@example.com');");
		      
			stmt = conn.createStatement();
			
	   	 stmt.executeUpdate("Insert Into lists(name, description, users, deadline,done,project) VALUES ('jeden','brak1','Wojciech','brak','0','pierwszy');");	
	   	stmt.executeUpdate("Insert Into lists(name, description, users, deadline,done,project) VALUES ('dwa','brak2','Kamil','brak','0','drugi');");
	   	stmt.executeUpdate("Insert Into lists(name, description, users, deadline,done,project) VALUES ('trzy','brak3','Wojciech','brak','0','trzeci');");
	   	stmt.executeUpdate("Insert Into lists(name, description, users, deadline,done,project) VALUES ('cztery','brak4','Tadek','brak','0','czwarty');");
	   	 
	   	 System.out.println("DODANO Listy");
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
	}
	
	
	
	
	
	
	
	
	
	
}
