import java.sql.*;
public class deleting_rows
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

                //Creating Statement which can add/edit data in database tables
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

                //Executing and collecting results 
                ResultSet rs = stmt.executeQuery("Select * from student");
                System.out.println("Executed sucessfully");
            
            rs.next();
            rs.deleteRow();
            System.out.println("Deleted first row!!!");
            
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        } 
    }
}
