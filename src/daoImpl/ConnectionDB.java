package daoImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionDB {
	
	private Connection con;
	
	public ConnectionDB() throws SQLException{
		
	//get DB properties 
		
		Properties props=new Properties();
		//try {
			//props.load(new FileInputStream("hospital.properties"));
			
			String user="root";
			String	password="";
			String	dburl="jdbc:mysql://localhost:3306/hopital0";
			
			con=DriverManager.getConnection(dburl,user,password);
//			System.out.println("connection successful to "+dburl);
		/*} catch (IOException  | SQLException e) {
			e.printStackTrace();
		}*/
		

	}
	
	
	public Connection getCon() {
		return this.con;
	}
	
	

	public void close() {
		try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


}
