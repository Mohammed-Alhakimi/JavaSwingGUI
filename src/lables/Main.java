package lables;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
// Jlabel= a GUI display area for a string of text,Image, or both
        //We need to create a frame to add the label to it cause the label is a component
        ImageIcon icon=new ImageIcon("C:\\Users\\Moham\\OneDrive\\Desktop\\translogo.png");
        Border border=BorderFactory.createLineBorder(Color.ORANGE,3);//creates a border
        JLabel label=new JLabel(); //Creates a label
label.setText("hello"); //sets the text of swing
        label.setIcon(icon); //adds icon to the lael
       // label.setIconTextGap(2); //gap between icon and text
       label.setHorizontalTextPosition(SwingConstants.CENTER); //Text in center overlapping omage
        label.setVerticalTextPosition(JLabel.TOP);//aligning the vertical image position
        label.setForeground(Color.GREEN);//Set font color
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//sets font ,font style,font size
        label.setBackground(new Color(123,50,100));
        label.setOpaque(true);//Displays the background color
        label.setBorder(border); //sets the border of the frame
        label.setVerticalAlignment(SwingConstants.CENTER);//SET VERTICAL POSITION OF ICON +TEXT WITHIN LABEL
        label.setHorizontalAlignment(SwingConstants.CENTER);//Sets horizontal positioning of icon plus text
      // label.setBounds(0,0,250,250);//sets the bounds of the label
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // frame.setLayout(null);//sets the layout of the label and origionally its border layout but if you set it to null you have to set the bounds of the label where it shows
        frame.setSize(500,500);
        frame.add(label); //don't forget to add the label to the frame after you finish
        frame.setVisible(true);
        frame.pack();//resize the size of the frame to accomidate the components
    }
}
