import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class RadioDemo extends JFrame{
    JLabel l1,l2;
    JButton b1;
    JTextField t1,t2;
    JRadioButton r1,r2;
    public RadioDemo(){
        super("Radio Demo Button"); // Example male and female button
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// When app is closed then code will also stop

        l1 = new JLabel("Name :");
        add(l1);
        t1 = new JTextField(20);
        add(t1);

        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        add(r1);
        add(r2);
        b1 = new JButton("Sumbit");
        add(b1);
        l2 = new JLabel("Result");
        add(l2);
        
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String name = t1.getText();
                if(r1.isSelected()){
                    name = "Mr. "+ name;
                }
                else{
                    name="Ms. "+name ;
                }
                l2.setText("Hello "+name);
            }
        });


    }
    public static void main(String[] args) {
        RadioDemo r = new RadioDemo();

    }

    
}
