package baza;

import java.sql.SQLException;

public class DataBaseProjects extends DataBase
{
	public DataBaseProjects()
	{
	
	};
	public void CreateTableProjects() 
	{

		try{  
		      stmt=conn.createStatement();  	
		      stmt.executeUpdate("Drop Table projects");  
		     String sql = "Create table projects(Name VARCHAR(50), Description VARCHAR(100), Manager VARCHAR(50), Lists VARCHAR(50));";
			stmt.executeUpdate(sql);
			System.out.println("DODANO TABELE PROJECTS");
		     
		}catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
	}

	public void AddProject(String Name, String Description, String Users, String Lists)
	{
		try{
		      stmt = conn.createStatement();
		      sql="Insert Into projects( Name, Description, Manager, Lists) VALUES ("+Name+","+Description+","+Users+","+Lists+");";
		      stmt.executeUpdate(sql);
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		
	}
	//public CProject ImportProject(String Email)
//	{
	//	CProject project = new CProject(Email, Email);
		//Object [][] tabela;
		//rs = stmt.executeQuery("SELECT COUNT(*) FROM Projects WHERE email LIKE '%"+ Email + "%');");
	  	//rs.next();
		//stmt = conn.createStatement();
		//rs = stmt.executeQuery("SELECT * FROM Projects WHERE name LIKE '%"+ Email + "%');");
		//if (rs.next())
  	  //sql= "SELECT * FROM STUDENTS WHERE id LIKE " + "'%"+ Email + "%');";
      //rs = stmt.executeQuery(sql);
   //CProject  tablica[];
   
    //int i =0;
    //while(rs.next()){
  	 // tabela[i][0] = rs.getString("Name");
  	  //tabela[i][1] = rs.getString("Description");
  	  //tabela[i][2] = rs.getString("Manager");
  	  //tabela[i][3] = rs.getString("Lists");
  	 // tablica[i] = new CProject(tabela[i][0],tabela[i][1],tabela[i][2],tabela[i][3]);
  	 // i++;
   // }
	//	return project;
//	}

	public void AddProjects()
	{
		try{
			//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (1,'Jaszczyk','Wojciech','1111','jaszczyk@example.com');");
			//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (2,'Bochniarz','Wojciech','2222','bochniarz@example.com');");
			//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (3,'Baum','Tadeusz','3333','baum@example.com');");
			//conn.createStatement().executeQuery("Insert Into Users(ID, surname, name, password,email) VALUES (4,'Skrzypiec','Kamil','4444','skrzypiec@example.com');");
		      
			stmt = conn.createStatement();
			
	   	 stmt.executeUpdate("Insert Into projects(name, description, manager, lists) VALUES ('pierwszy','brak','Wojciech','1');");	
	   	stmt.executeUpdate("Insert Into projects(name, description, manager, lists) VALUES ('drugi','brak','Kamil','2');");
	   	stmt.executeUpdate("Insert Into projects(name, description, manager, lists) VALUES ('trzeci','brak','Wojciech','3');");
	   	stmt.executeUpdate("Insert Into projects(name, description, manager, lists) VALUES ('czwarty','brak','Tadek','4');");
	   	 
	   	 
	   	 System.out.println("DODANO Projekty");
		 }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
