package two.diminsional.graphics;

import javax.swing.*;
import java.awt.*;

class myFrame extends JFrame{
myPanel panel;
    myFrame(){
        panel=new myPanel();
        this.add(panel);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
class myPanel extends JPanel{
    myPanel(){
this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics2D g2D= (Graphics2D) g;
        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.BLUE);
        g2D.drawLine(0,0,500,500);
        g2D.drawRect(0,0,100,200);
        g2D.fillRect(0,0,100,200);
        g2D.drawOval(300,300,100,100);
        g2D.fillOval(300,300,100,100);
        g2D.setPaint(Color.red);
        g2D.fillArc(0,300,100,100,0,180);
    }
}

public class Main {
    public static void main(String[] args) {
        new myFrame();
        
    }
}
