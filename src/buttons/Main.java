package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame extends JFrame implements ActionListener {
//You have to implement the action listner to make the button to do something
    JLabel label;//declared outside so that the action listner method has access to it
    JButton button;
    //we have to make the button global to use it in the action listner method
    myFrame(){
        ImageIcon icone=new ImageIcon("C:\\Users\\Moham\\OneDrive\\Desktop\\smile.png");
        ImageIcon icon2 =new ImageIcon("C:\\Users\\Moham\\OneDrive\\Desktop\\smile.png");

        label=new JLabel();
        label.setBounds(150,250,150,150);
        label.setIcon(icon2);
        label.setVisible(false);
        label.setBackground(Color.red);

        button=new JButton();
        button.setBounds(100,100,250,100);//We have to set the bounds for the bounds because  the layout is null
        button.addActionListener(this);//cause its implementing the action listener method
       // button.addActionListener(e -> System.out.println("poo"));//Lambda expression
        button.setText("I'm A button");//sets text for the button
        button.setFocusable(false);//remove the box around the text
        button.setIcon(icone);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.ITALIC,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
this.setLayout(null);
this.setSize(500,500);
this.setVisible(true);
this.add(button);//Adding the button to the frame
this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("POO");
            button.setEnabled(false); //you can make the button dsabled after clicking by adding this t the action listener
            label.setVisible(true);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        new myFrame();
    }
}
