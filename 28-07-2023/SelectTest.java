import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest 
{
		public static void main(String[] args) 
		{
			// 1. Load the driver
			System.out.println("Trying to load driver");
			try 
			{
				
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());


			System.out.println("Driver Loaded");
			
			// 2. Acquire connection
			System.out.println("Trying to connect..");

			Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
			System.out.println("Connected: "+con);

			
			
			// 3. make desired statement insert/delete/create
			Statement statement1 = con.createStatement();
			System.out.println("Statement is created: "+statement1);
			
			// 4. execute the statement
			ResultSet result = statement1.executeQuery("SELECT* FROM mydept120");
			
			// 5. process that statement
			while(result.next())
			{
				System.out.println("DEPT NO: "+result.getInt(1));
				System.out.println("DNAME: "+result.getString(2));
				System.out.println("LOC: "+result.getString(3));
				System.out.println("<--------------->");
			}
			
			// 6. close statement and connections
			con.close();
			System.out.println("Disconnected from the database...");
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
}
