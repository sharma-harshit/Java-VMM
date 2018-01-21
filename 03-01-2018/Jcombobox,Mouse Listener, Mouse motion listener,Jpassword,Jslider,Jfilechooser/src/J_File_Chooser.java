import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class J_File_Chooser extends JFrame  implements ActionListener
{
    JLabel lb;
    JButton bt;
    JFileChooser fc;
    J_File_Chooser()
    {
        //intializing frame        
        setLayout(null);
        setTitle("Mouse Listener Implentation");
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //intializing button
        bt = new JButton("Open File Chooser");
        bt.setBounds(100,100,100,50);
        add(bt);
        bt.addActionListener(this);
        
    }
    public static void main(String[] args) 
    {
        new J_File_Chooser();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        fc = new JFileChooser("C:\\");
        fc.showOpenDialog(this);
        int r = fc.showSaveDialog(this);
        if(r == JFileChooser.APPROVE_OPTION)
        {
            File f = fc.getSelectedFile();
            bt.setText(f.getName());
        }
    }
}
