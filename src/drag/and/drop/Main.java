package drag.and.drop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class DragPanel extends JPanel{
    ImageIcon icon=new ImageIcon("C:\\Users\\Moham\\OneDrive\\Desktop\\smile.png");
    final int WIDTH=icon.getIconWidth();
    final int HIEGHT=icon.getIconHeight();
    Point imageCorner;
    Point pervPt;
    DragPanel(){
        imageCorner=new Point(0,0);//setting the corner of the image;
        ClickListner clickListner=new ClickListner();//Instanciating the listenrs we have
        DragListner dragListner=new DragListner();//Instanciating the listenrs we have
        this.addMouseListener(clickListner);
        this.addMouseMotionListener(dragListner);
    }
    public void paintComponent(Graphics g){
//Repaints the image after we update the new posiioning of it;
        super.paintComponent(g);
        icon.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }
//We need two inner classes one for the clicking and one for the motion
    private class ClickListner extends MouseAdapter{
public void mousePressed(MouseEvent e){
    pervPt=e.getPoint();
}
    }
    private class DragListner extends MouseMotionAdapter{
public void mouseDragged(MouseEvent e){
    Point currenpt=e.getPoint();
    imageCorner.translate(
            (int) (currenpt.getX()-pervPt.getX()),(int)(currenpt.getY()-pervPt.getY())
    );//moves the image to the chose point
    repaint();//to repaint the image

}
    }
}
class myFrame extends JFrame{

    DragPanel dragPanel=new DragPanel();
    myFrame(){
        this.add(dragPanel);
        this.setTitle("Frame drag and drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
public class Main {
    public static void main(String[] args) {
        new myFrame();
    }
}
