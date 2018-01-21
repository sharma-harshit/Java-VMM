import java.io.*;
public class ObjectOutputStream_Object_InputStream
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        //Writing an object
        //oos can't directly work alone so creatinng fos for it as a platform
        FileOutputStream fos = new FileOutputStream("./xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("Writing to file");
        player p1 = new player();
        p1.show();
        p1.fire();
        p1.hit();
        p1.show();
        oos.writeObject(p1);
        oos.close();
        fos.close();
        
        //Reading an Object
        FileInputStream fis = new FileInputStream("./xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        player p2= (player) ois.readObject();
        System.out.println("Reading from file");
        p2.show();
    }
}
//class whose object has to be read/written must be implmented as Serializeable
class player implements Serializable
{
    int health;
    int bullets;
    player()
    {
        bullets = 100;
        health = 100 ;
    }
    void fire()
    {
        bullets--;
    }
    void hit()
    {
        health-=10;
    }
    void show()
    {
        System.out.println("Health : "+health+"\nBullets : "+bullets);
    }
}