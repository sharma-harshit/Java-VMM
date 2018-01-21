import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class J_Progress_Bar extends JFrame
{
    JProgressBar pb;    
    public J_Progress_Bar()
    {
        //intializing frame
        setLayout(null);
        setVisible(true);
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //intializing bar
        pb = new JProgressBar();
        pb.setBounds(100,100,200,30);
        pb.setValue(30);
        pb.setBackground(Color.GRAY);
        pb.setForeground(Color.BLACK);
        pb.setStringPainted(true); //showing percentage
        add(pb);
    }
    
    public static void main(String[] args)
    {
        new J_Progress_Bar();
    }
}
