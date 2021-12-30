package menu.bar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class myFrame extends JFrame implements ActionListener{

    JMenuItem exitItem,loadItem,saveItem;
     myFrame(){
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         this.setSize(500,500);

         JMenuBar menuBar=new JMenuBar();
         JMenu fileMenu=new JMenu("File");
         JMenu editMenu=new JMenu("Edit");
         JMenu helpMenu=new JMenu("Help");

          loadItem=new JMenuItem("Load");
          saveItem=new JMenuItem("Save");
          exitItem=new JMenuItem("Exit");

         loadItem.addActionListener(this);
         saveItem.addActionListener(this);
         exitItem.addActionListener(this);
/*________________________Setting shortcuts for the items_________________*/
//We use the set Mnomanic item methos
         loadItem.setMnemonic(KeyEvent.VK_L);
         saveItem.setMnemonic(KeyEvent.VK_S);
         exitItem.setMnemonic(KeyEvent.VK_E);
/*________________________Setting shortcuts for the items_________________*/
         fileMenu.add(loadItem);
         fileMenu.add(saveItem);
         fileMenu.add(exitItem);
/*________________________Setting shortcuts for the MENUS_________________*/
         fileMenu.setMnemonic(KeyEvent.VK_F);//ALT+ F
         editMenu.setMnemonic(KeyEvent.VK_T);//ALT+T
         helpMenu.setMnemonic(KeyEvent.VK_H);//ALT+Hccc
/*________________________Setting shortcuts for the MENUS_________________*/
         menuBar.add(fileMenu);
         menuBar.add(editMenu);
         menuBar.add(helpMenu);
         this.setJMenuBar(menuBar);//you don't add it you set it
         this.setLayout(new FlowLayout());
         this.setVisible(true);
     }
    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==loadItem){
    System.out.println("Loading item");
}else if (e.getSource()==saveItem){
    System.out.println("Saving item");
}else if (e.getSource()==exitItem){
    this.dispose(); //OR
    System.exit(0);
}
    }
}
public class Main {
    public static void main(String[] args) {
        new myFrame();
    }
}
