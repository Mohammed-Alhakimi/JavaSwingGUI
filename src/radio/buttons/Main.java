package radio.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame extends JFrame implements ActionListener{
//You have to limit the amount by adding the radio buttons to a single radio group
JRadioButton pizzabutton,Hambutton,Hoddogbutton;
ButtonGroup bg;
JButton button;
myFrame(){
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

     pizzabutton=new JRadioButton("Pizza");
     Hambutton=new JRadioButton("Ham");
     Hoddogbutton=new JRadioButton("Hotdog");
     button=new JButton("What is selected?");
     button.addActionListener(this);

     pizzabutton.addActionListener(this);
     Hambutton.addActionListener(this);
     Hoddogbutton.addActionListener(this);

     bg=new ButtonGroup();

     bg.add(pizzabutton);
     bg.add(Hambutton);
     bg.add(Hoddogbutton);


     this.add(button);
     this.add(pizzabutton);
     this.add(Hambutton);
     this.add(Hoddogbutton);
    this.pack();
    this.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==pizzabutton){
    System.out.println("You selected pizza");
}else if (e.getSource()==Hambutton){
    System.out.println("You selected ham");
}else if (e.getSource()==Hoddogbutton){
    System.out.println("You selected HotDog");
}else{
    System.out.println("No selection was made");
}
    }
}
public class Main {
    public static void main(String[] args) {
myFrame frame=new myFrame();
    }
}
