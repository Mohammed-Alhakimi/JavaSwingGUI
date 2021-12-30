package flow.layout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //flow layout places components in a row sized at their preferred size if the horizontal space in the container is too small the flow laoyout class uses the next available row


        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));//The constants after are for the alignment

        JPanel panel=new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        frame.add(panel);

        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(500,500));
    }
}
