//Creating a class as a child class of thread
class a extends Thread
{
    String name;
    a(String name)
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

public class Multi_Threading_using_Thread_Class
{
    public static void main(String[] args) 
    {
        new a("ONE").start();
        new a("TWO").start();
        // if we call  - new a("ONE").run()  here it will not generate a new thread instead will just work as a function
        
    }
}
