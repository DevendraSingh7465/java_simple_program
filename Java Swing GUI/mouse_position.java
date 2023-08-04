import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouse_position extends JFrame{
    public mouse_position(){
        super("Mouse Position");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                int x = e.getX();
                int y = e.getY();
                System.out.println("x:"+x +" y:"+ y );// this will be printed on your terminal
            }
        });

    }
    public static void main(String[] args) {
        mouse_position mp = new mouse_position();
    }
    
}
