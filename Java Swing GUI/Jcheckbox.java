import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jcheckbox extends JFrame{
    JCheckBox c1,c2,c3,c4,c5;
    JLabel l1;
    public Jcheckbox(){
        super("CheckBox");
        setLayout(new GridLayout(6,1,5,5));
        setVisible(true);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Your Hobbies");
        c1 = new JCheckBox("Dancing");
        c2 = new JCheckBox("Singing");
        c3 = new JCheckBox("Coding");
        c4 = new JCheckBox("Playing Games");
        c5 = new JCheckBox("Video Games");
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                System.out.println("Dancer");// It will be printed in your terminal
            }
        });
    }
    public static void main(String[] args) {
        Jcheckbox j = new Jcheckbox();
    }
}
