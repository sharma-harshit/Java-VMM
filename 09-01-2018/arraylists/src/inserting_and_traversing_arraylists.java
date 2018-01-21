import java.io.*;
import java.util.ArrayList;
public class inserting_and_traversing_arraylists
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);        
        //declaring array list
        ArrayList<Integer> al = new ArrayList() ;
        
        System.out.println("Enter the number of elements in the list");        
        int n = Integer.parseInt(br.readLine());        
         
        //insertion with iteration
        for (int i = 0; i < n ; i++) 
        {
            System.out.print("Enter the element number "+(i+1)+" ");
            al.add(Integer.parseInt(br.readLine()));
        }
        
        System.out.println("Values you entered using enhanced for : ");
        for(int i : al)
        {
            System.out.println(i);
        }
        
        System.out.println("Values you entered using get function : ");
        for(int i =0 ; i < al.size() ; i++)
        {
            System.out.println(al.get(i));
        }
        
        
    }
}
