package frames;

import javax.swing.*;
import java.awt.*;


public class myFrame extends JFrame {
    //Another way to create frames

    myFrame() {

        this.setVisible(true);//Makes a this visible
        this.setSize(420,420);//Sets the size of the Jframe sets the x-dim and the y-dim
        this.setTitle("Jframe title goes here");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Exit out of application   do nothing does nothing and hide hides it
        this.setResizable(false);//prevents frame from being resized

    ImageIcon icon = new ImageIcon("trans logo.png");//Creates an image an icon
        this.setIconImage(icon.getImage());//Change icon of frame
        this.getContentPane().

    setBackground(new Color(0,0,0));//Change a color of background
}
}
