import javax.swing.JFrame;
import javax.swing.JSlider;
public class Jslider extends JFrame 
{
    JSlider js;
    Jslider()
    {
        //intializing frame        
        setLayout(null);
        setTitle("Mouse Listener Implentati");
        setSize(700,700);       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //intializing slider
        JSlider js =new JSlider();
        js.setBounds(100,100,200,100);
        add(js);
            //enabling ticks
            js.setPaintTicks(true);
            // setting spacing
            js.setMinorTickSpacing(10);
            //enabling labels
            js.setPaintLabels(true);
            // setting major spacing
            js.setMajorTickSpacing(20);
        
         setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Jslider();
    }
}
