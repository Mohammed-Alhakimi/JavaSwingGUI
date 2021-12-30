package combo.boxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame extends JFrame implements ActionListener {
    JComboBox comboBox;
    myFrame(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


//If you want to insert an Integer data into the JComboBox you Have to add the data usingthe wrapper class of the data type for example the integers with the wrapper class of Integer
        String[] animals={"Cat","Dog","Wolf"};
        comboBox=new JComboBox(animals);//You must add a reference data type like
        comboBox.addActionListener(this);
        comboBox.setEditable(true); //You can actually type things to look for
        comboBox.getItemCount();//Prints the count of items in the comboBox
        comboBox.addItem("Horse");//adds item to the combo box
        comboBox.insertItemAt("sheep",0);//Inserts an item at a certian index
        comboBox.setSelectedIndex(0);//selects the certian index when the application starts
        comboBox.removeItem("Cat");//removes an item
        comboBox.removeItemAt(0);//removes an item using a certain index
        //comboBox.removeAllItems();//removes the comboBox

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==comboBox){

    System.out.println(comboBox.getSelectedItem());
    System.out.println(comboBox.getSelectedIndex());//Returns the index of the selected item
}
    }
}
public class Main {
    public static void main(String[] args) {
        new myFrame();
    }
}
