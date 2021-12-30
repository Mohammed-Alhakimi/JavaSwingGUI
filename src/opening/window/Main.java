package opening.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LaunchPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton myButton = new JButton("New window");
    LaunchPage(){
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(myButton);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
 if(e.getSource()==myButton){
     frame.dispose();//To prevent opening windows
     newWindows mywindow=new newWindows();
 }
    }
}
class newWindows{
JFrame frame=new JFrame();
JLabel label=new JLabel("Hello");
newWindows(){
    label.setBounds(0,0,100,50);
    label.setFont(new Font(null,Font.PLAIN,25));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.add(label);
    frame.setVisible(true);
}
}
public class Main {
    public static void main(String[] args) {
    LaunchPage lp=new LaunchPage();
    }
}
