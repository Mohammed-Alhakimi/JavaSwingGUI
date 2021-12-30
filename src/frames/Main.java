package frames;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
       /* JFrame frame=new JFrame(); //Creates a frame

        frame.setVisible(true);//Makes a frame visible
        frame.setSize(420,420);//Sets the size of the Jframe sets the x-dim and the y-dim
        frame.setTitle("Jframe title goes here");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Exit out of application   do nothing does nothing and hide hides it
        frame.setResizable(false);//prevents frame from being resized

ImageIcon icon=new ImageIcon("trans logo.png");//Creates an image an icon
        frame.setIconImage(icon.getImage());//Change icon of frame
        frame.getContentPane().setBackground(new Color(0,0,0));//Change a color of background*/

//Another way to create a frame is to create a class for it that extendsJframe
        myFrame myFrame=new myFrame();

    }
}
