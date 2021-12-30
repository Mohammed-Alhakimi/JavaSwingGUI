package color.chooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame extends JFrame implements ActionListener {
    JLabel label=new JLabel("Please change my color");
    JButton button =new JButton("Choose color");
    myFrame() {
        button.addActionListener(this);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setFont(new Font("Comic Sans",Font.PLAIN,100));
        /*________________________ Creating the frame _________________*/
        this.add(button);
        this.add(label);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==button){
    JColorChooser cs=new JColorChooser();
    Color color=JColorChooser.showDialog(null,"Choose a color",Color.BLACK);
    label.setForeground(color);//SETTING THE CHOSEN COLOR TO THE LABEL
    //label.setBackground(color);
}
    }
}
public class Main {
    public static void main(String[] args) {
        new myFrame();
    }
}
