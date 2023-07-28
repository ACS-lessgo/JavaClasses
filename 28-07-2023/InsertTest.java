import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class InsertTest 
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
			PreparedStatement statement1 = con.prepareStatement("INSERT INTO mydept120 VALUES (?,?,?)");
			System.out.println("Prepared Statement is created: "+statement1);
			
			// 4. execute the statement
			statement1.setInt(1, 40);
			statement1.setString(3, "Testing");
			statement1.setString(2, "Pune");
			int rows = statement1.executeUpdate();
			
			//ResultSet result = statement1.executeQuery("SELECT* FROM mydept120");
			
			System.out.println("Rows created : "+rows);
			// 5. process that statement
			
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
