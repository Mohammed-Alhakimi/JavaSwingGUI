package binding.key;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class Game{
    Action upAction;
    Action actionDown;
    Action actionRight;
    Action actionLeft;
    JFrame frame;
    JLabel label;

    Game(){
frame=new JFrame("Key Binding demo");
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
frame.setSize(420,420);
frame.setLayout(null);
label =new JLabel();
label.setBackground(Color.red);
label.setOpaque(true);
label.setBounds(100,100,100,100);

        upAction=new UpAction();
        actionDown=new DownAction();
        actionLeft=new LeftAction();
        actionRight=new RightAction();

label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"UPAction");
label.getActionMap().put("UPAction",upAction);

label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"DOWNAction");
label.getActionMap().put("DOWNAction",actionDown);
label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"LEFTAction");
label.getActionMap().put("LEFTAction",actionLeft);
label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"RIGHTAction");
label.getActionMap().put("RIGHTAction",actionRight);

//The steps :
        /*
        * 1) Creating the inner classes for each keybinding with them implementing the Action events
        *2) Instanciating your inner classes
        *3) select you swing components and use the method of getinput map then . put with 2 args  1/key stroke(Keystroke.getkeystroke("UP")), and its a sting holding the key  2 actionmap key which is a temp name for the keystroke that you shpuld use for the next method
        *4)The name of the componentthe get the action map that you just created. put that takes 2 args 1/key(the one u used in the temp name above) 2/the action which is the instance of the inner classes you created for the bindings
        * note: if you want to use chars use the small chars
        * */

frame.add(label);
frame.setVisible(true);
    }
    //You must create an action by creating  specific classes
    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
label.setLocation(label.getX(),label.getY()-10);
        }
    }
    public class DownAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
label.setLocation(label.getX(),label.getY()+10);
        }
    }
    public class LeftAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
label.setLocation(label.getX()-10,label.getY());
        }
    }
    public class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
label.setLocation(label.getX()+10,label.getY());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        //Key bindings they bind the actions to keystrokes
        //not required to click a component to give it focus all of the components have keybindings
        //cann assign to seperate components
        //more difficult to setup
        Game game=new Game();
    }
}
