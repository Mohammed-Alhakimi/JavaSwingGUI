package mouse.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
class myFrame extends JFrame implements MouseListener {
JLabel label=new JLabel();
    myFrame(){
        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.addMouseListener(this);
        this.add(label);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
//Invoked whe the mouse button has been clicked (Pressed and released)
        System.out.println("You clicked the mouse");
    }
    @Override
    public void mousePressed(MouseEvent e) {
//Invoked whe the mouse button has been pressed on a component
        System.out.println("You pressed the mouse");
        label.setBackground(Color.BLUE);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
//Invoked whe the mouse button has been released on a component
        System.out.println("You relesed the mouse");
        label.setBackground(Color.yellow);
    }
    @Override
    public void mouseEntered(MouseEvent e) {
//Invoked whe the mouse button has entered a component
        System.out.println("You entered the component");
        label.setBackground(Color.green);
    }
    @Override
    public void mouseExited(MouseEvent e) {
//Invoked whe the mouse button has exited a component
        System.out.println("You exited the component");
        label.setBackground(Color.magenta);
    }
}
public class Main {
    public static void main(String[] args) {
new myFrame();
    }
}
