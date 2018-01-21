import java.io.File;
import java.io.IOException;
public class intro_to_files
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\HARSHIT\\Pictures\\Saved Pictures\\img.jpg");
        //these three functions work even if file doesn't even exist
        System.out.println("Name : " + f.getName());
        System.out.println("Path : " + f.getPath());
        System.out.println("Parent : "+f.getParent());
        
        
        System.out.println("Exists ? : "+f.exists());
        System.out.println("Can Read ? : "+f.canRead());
        System.out.println("Can Write ? : "+f.canWrite());
        System.out.println("Can Execute ? : "+f.canExecute());
        
        System.out.println("Is Directory : "+f.isDirectory());
        System.out.println("Is file : "+f.isFile());
        
        System.out.println("Length : " + f.length());
        //to make directory at given path
        File file = new File("C:\\Users\\HARSHIT\\Pictures\\Saved Pictures\\directory");
            file.mkdir();    // for single directory
            file.mkdirs();    // for multiple directories
        // to make new file at given path
        
        File file1 = new File("C:\\Users\\HARSHIT\\Pictures\\Saved Pictures\\directory\\abc.txt");
        file1.createNewFile();
        
    }
}
