//Creating a class as a child interface of Runnable
class b implements Runnable
{
    String name;
    b(String name)
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
        }
        
    }
}

public class Multi_Threading_using_runnable_interface
{
    public static void main(String[] args) 
    {
        //Making objects
        b obj1 = new b("ONE");
        b obj2 = new b("TWO");
        
        // Intializing respective threads of the objects
        Thread t1 = new Thread(obj1);
        Thread t2= new Thread(obj2);
        
        //starting thread t1
        t1.start();
        //starting thread t2
        t2.start();
        
        //using short form
        new Thread(new b("THREE")).start();
    }
}
