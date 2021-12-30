package panels;

import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        JLabel label=new JLabel();
        label.setText("Hello world");
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.CENTER);
        label.setFont(new Font("Sans serif",Font.PLAIN,25));

        JPanel orangePanel=new JPanel();
        orangePanel.setBackground(Color.ORANGE);//colors of panels
        orangePanel.setBounds(0,0,250,250);

        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.RED);//colors of panels
        redPanel.setBounds(250,0,250,250);

         JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.BLUE);//colors of panels
        bluePanel.setBounds(0,250,500,250);
        bluePanel.setLayout(new BorderLayout());
        bluePanel.add(label);

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(orangePanel);//don't forget to add the panel
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
    }
}
