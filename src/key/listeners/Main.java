package key.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class myFrame extends JFrame implements KeyListener {
    JLabel label;
    myFrame(){
        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
/*________________________ Creating the frame _________________*/
        this.add(label);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {
    //Key typed is invoked when a key is types uses KeyChar, char output
    switch (e.getKeyChar()){
        case 'a':label.setLocation(label.getX()-1,label.getY() );
            break;
        case 's':label.setLocation(label.getX(),label.getY()+1 );
            break;
        case 'd':label.setLocation(label.getX()+1,label.getY() );
            break;
        case 'w':label.setLocation(label.getX(),label.getY()-1 );
            break;
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
    //Key realesed = invoked when a physical key is pressed down. uses keycode and an output of int
        //you use it for the arrow keys for example and the keys that don't produce a char instead a code
        switch (e.getKeyCode()){
            case 37:label.setLocation(label.getX()-1,label.getY() );
                break;
            case 40:label.setLocation(label.getX(),label.getY()+1 );
                break;
            case 39:label.setLocation(label.getX()+1,label.getY() );
                break;
            case 38:label.setLocation(label.getX(),label.getY()-1 );
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    //key released called whenever a button is released
        System.out.println("You released the key char:   "+e.getKeyChar());
        System.out.println("You released the key char:   "+e.getKeyCode());
    }
}
public class Main {
    public static void main(String[] args) {
new myFrame();
    }
}
