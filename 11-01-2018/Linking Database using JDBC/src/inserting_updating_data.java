import java.sql.*;
public class inserting_updating_data
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
            
            //INSERTING DATA
            //move cursor to add row
            rs.moveToInsertRow();
            
            //inserting values
            rs.updateInt("roll_no", 5);
            rs.updateString("name","pundeya");
            rs.updateString("class","llb");
            rs.updateString("section","d");
            rs.updateInt("marks", 70);
            
            //commiting changes
            rs.insertRow();
            
            System.out.println("Done insertion!!!");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        } 
    }
}
