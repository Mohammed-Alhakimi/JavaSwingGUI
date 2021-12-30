package select.a.file;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class myFarme extends JFrame implements ActionListener {

    JButton button =new JButton("Select a file");
    myFarme(){
        button.addActionListener(this);


/*________________________ Creating the frame _________________*/
this.add(button);
this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());
this.pack();
this.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==button){
    //Lets you choose a file
    JFileChooser fileChooser =new JFileChooser();

    fileChooser.setCurrentDirectory(new File("C:\\Users"));//sets the defualt dirictory

/*
    int response= fileChooser.showOpenDialog(null);
    //System.out.println( fileChoose.showOpenDialog(null));//lets you open a file and it returns an integer value that you can store

    */
    //or we can show a show save dialog instead of the open dialog
    int response= fileChooser.showSaveDialog(null);


    if(response==JFileChooser.APPROVE_OPTION){
        File file=new File(fileChooser.getSelectedFile().getPath());//we saved the file path to the file from the file chooser
        System.out.println(file);


    }
}
    }
}

public class Main {
    public static void main(String[] args) {
        //Jfile is a gui mechanism that lets the user chooose a file
        new myFarme();
    }
}
