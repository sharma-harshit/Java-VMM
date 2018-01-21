import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class image_on_label extends JFrame 
{
    JLabel lb;
    image_on_label()
    {
        //intializing frame
        setTitle("Mouse Listener Implentation");
        setSize(1000,700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        //intializing label
        lb = new JLabel();
        ImageIcon img = new ImageIcon("C:\\Users\\HARSHIT\\Pictures\\Saved Pictures\\IMG-20171019-WA0015.jpg");
        lb.setBounds(100,100,500,300);
        lb.setIcon(img);
        add(lb);
       
        setVisible(true);

    }
    public static void main(String[] args) 
    {
        new image_on_label();
    }
}
