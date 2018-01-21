
import java.util.logging.Level;
import java.util.logging.Logger;

//Creating a class as a child interface of Runnable
class c implements Runnable
{
    String name;
    c(String name)
    {
        this.name = name;
    }
    //overiding the run method of that class
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++) 
        {
            System.out.println("Executing the thread "+ name+ " : " + i);
            //thread.sleep() throws some exception which needs to be catched
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
        
    }
}


public class Using_sleep_function
{
    public static void main(String[] args) 
    {
        new Thread(new c("ONE")).start();
        new Thread(new c("TWO")).start();        
    }
}
