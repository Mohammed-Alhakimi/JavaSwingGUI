package check.boxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox chkbok;

    myFrame(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        chkbok=new JCheckBox();
        chkbok.setText("I'm not a robot");
        chkbok.setFocusable(false);
        chkbok.setFont(new Font("Sans Serif",Font.PLAIN,25));
/*____________________________________________________________________*/
        button=new JButton("Is it selected?");
        button.addActionListener(this);
/*____________________________________________________________________*/
        this.add(button);
        this.add(chkbok);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==button){
    if (chkbok.isSelected()){
        System.out.println("is checked");
    }else{
        System.out.println("Isn't selected");
    }
}
    }
}
public class Main {
    public static void main(String[] args) {
myFrame frame=new myFrame();
    }
}
