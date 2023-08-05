import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JFrame_to_JFrame{
    public JFrame_to_JFrame(){}
    public static void main(String[] args) {
        JFrame_to_JFrame j = new JFrame_to_JFrame();
        Add ad = new Add();
    }
}

class Add extends JFrame{
    public Add(){
        super("Addition Form");
        JButton b = new JButton("ADD FORM");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                new Sub();
                dispose();
            }
        });
        add(b);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// When app is closed then code will also stop
    }

}
class Sub extends JFrame{
    public Sub(){
        super("Subtraction Form");   
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// When app is closed then code will also stop     
    }

}
