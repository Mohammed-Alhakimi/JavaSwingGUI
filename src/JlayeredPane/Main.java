package JlayeredPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JlayeredPane is a GUI Component that provides a third dimension z-index - Depth for our components
        JLabel label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        JLabel label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100,100,200,200);

        JLabel label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane=new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
        //or  layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2,JLayeredPane.MODAL_LAYER);
        layeredPane.add(label3,JLayeredPane.DRAG_LAYER);


        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(layeredPane);
        frame.setVisible(true);
    }
}
