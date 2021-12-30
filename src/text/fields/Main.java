package text.fields;

import javax.swing.*;
import javax.swing.text.Caret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField field;
    myFrame(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        button=new JButton("Submit");
        button.addActionListener(this);

        field=new JTextField();
        field.setPreferredSize(new Dimension(250,40));
        field.setFont(new Font("Consolas",Font.PLAIN,35));
        field.setForeground(Color.GREEN);
        field.setBackground(Color.BLACK);
        field.setCaretColor(Color.white);
        field.setText("UserName");

        this.add(button);
        this.add(field);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==button){
    System.out.println(field.getText());
    field.setEditable(false);
    button.setEnabled(false);
}
    }
}
public class Main {
    public static void main(String[] args) {
        //A text field is a basic text control that enables the user to type a small amount of text. When the user indicates that text entry is complete
myFrame frame=new myFrame();
    }
}
