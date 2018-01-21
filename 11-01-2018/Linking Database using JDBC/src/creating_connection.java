import java.sql.*;
public class creating_connection
{
    public static void main(String[] args) throws SQLException
    {
        
        try 
        {
            // Loading and Registering Jdbc Driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
            
            // Creating connection with database
            String address = "jdbc:mysql://localhost:3306/db1";
            String username = "root";
            String password = "127997";
            Connection conn = DriverManager.getConnection(address,username,password);
            System.out.println("Connectoin built");
            
            //Creating Statement which can just read data by default
            Statement stmt = conn.createStatement();
            
            //Executing and collecting results 
            ResultSet rs = stmt.executeQuery("Select * from student");
            System.out.println("Executed sucessfully");
            
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        } 
        
    }
}
