import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 


public class add2numbers{
    public static void main(String[] args) {
        Addition obj = new Addition();


    }
}


class Addition extends JFrame {

    JTextField t1,t2;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4;

    public Addition(){
        super("Calculator"); // It adds the title
        l1 = new JLabel(" Enter First Number :");
        t1 = new JTextField(20);
        l2 = new JLabel("Enter Second Number :");
        t2 = new JTextField(20);
        b1 = new JButton("ADD");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Divide");
        l3 = new JLabel("Result");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);

        ActionListener al1 = new ActionListener(){  // This is anonymous class
            public void actionPerformed(ActionEvent ae) {

                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int addition = (num1 + num2);
                String addition1 = String.valueOf(addition); // we need to convert int to string to print value
                l3.setText(addition1);
            }
        };
        b1.addActionListener(al1); // Action Listener is an interface

        ActionListener al2 = new ActionListener(){  // This is anonymous class
            public void actionPerformed(ActionEvent ae) {

                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int addition = (num1 - num2);
                String addition1 = String.valueOf(addition); // we need to convert int to string to print value
                l3.setText(addition1);
            }
        };
        b2.addActionListener(al2); // Action Listener is an interface

        ActionListener al3 = new ActionListener(){  // This is anonymous class
            public void actionPerformed(ActionEvent ae) {

                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int addition = (num1 * num2);
                String addition1 = String.valueOf(addition); // we need to convert int to string to print value
                l3.setText(addition1);
            }
        };
        b3.addActionListener(al3); // Action Listener is an interface

        b4.addActionListener(new ActionListener(){  // This is anonymous class
            public void actionPerformed(ActionEvent ae) {

                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int addition = (num1 / num2);
                String addition1 = String.valueOf(addition); // we need to convert int to string to print value
                l3.setText(addition1);
            }
        });


        //setLayout(new FlowLayout());
        setLayout(new GridLayout(5,2,10,10));
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// When app is closed then code will also stop


    }

    
    


}