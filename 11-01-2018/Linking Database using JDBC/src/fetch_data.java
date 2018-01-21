import java.sql.*;
public class fetch_data
{
    public static void main(String[] args) throws SQLException 
    {
        
        try 
        {
            //CONNECTING DATABASE
                // Loading and Registering Jdbc Driver
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver loaded successfully");

                // Creating connection with database
                String address = "jdbc:mysql://localhost:3306/db1";
                String username = "root";
                String password = "127997";
                Connection conn = DriverManager.getConnection(address,username,password);
                System.out.println("Connectoin built");

                //Creating Statement
                Statement stmt = conn.createStatement();

                //Executing and collecting results 
                ResultSet rs = stmt.executeQuery("Select * from student");
                System.out.println("Executed sucessfully");
            
            //FETCHING data
            
            while(rs.next())
            {                
                System.out.print("Roll number is : "+rs.getInt("roll_no"));
                System.out.print("\tName is : "+rs.getString("name"));
                System.out.print("\tMarks : "+rs.getInt("marks")+"\n");
            }
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        } 
        
    }
}
