// error : size automatically decreases

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBox_exp extends JFrame {

    JComboBox cb;
    DefaultComboBoxModel<String> model;

    JComboBox_exp() {
        setTitle("Jcombobox");
        setLayout(null);

        cb = new JComboBox();
        cb.setBounds(100, 100, 200, 30);
        add(cb);

        model = new DefaultComboBoxModel();
        model.addElement("abc");
        model.addElement("abc");
        model.addElement("abc");
        model.addElement("abc");

        cb.setModel(model);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBox_exp();
    }
}
