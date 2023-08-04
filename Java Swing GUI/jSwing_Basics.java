import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;


class jSwing_Basics{
    public static void main(String[] args) {
        JFrame f = new JFrame("USER FORM");
        f.setVisible(true); // Default it is at False so if i make it true then it will show frame 
        f.setSize(350,400);//width and height of the frame

        f.setLayout(new FlowLayout());// it makes every component move to middle of the screen
        // it is like centre align feature in MS Office

        f.setLayout(new GridLayout(3,2));

        JLabel l1 = new JLabel("Username :"); // it creates new label at default position 
        f.add(l1); // First Label

        JTextField t1 = new JTextField(20); // it takes input as number 20 is character limit
        f.add(t1); // First TextField


        JLabel l2 = new JLabel("Password :"); // it creates new label at default position 
        f.add(l2); // Second Label

        JTextField t2 = new JTextField(20); // it takes input as number 20 is character limit
        f.add(t2); // Second TextField

        JButton b1 = new JButton("Submit");
        f.add(b1);
    }
}