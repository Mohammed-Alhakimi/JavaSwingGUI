package joptin.pane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // JOptionPane is a class library that makes it easy to pop up a simple dialog box that either provides an information message or asks for a simple input from the user.
     /*   JOptionPane.showMessageDialog(null,"Hello","Title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello","Title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello","Title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello","Title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello","Title",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null,"Hello","title",JOptionPane.OK_CANCEL_OPTION);
        JOptionPane.showConfirmDialog(null,"Hello","title",JOptionPane.YES_NO_CANCEL_OPTION);*/

   /*   System.out.println(JOptionPane.showConfirmDialog(null,"Hello","title",JOptionPane.YES_NO_CANCEL_OPTION));
        //yes returns 0 and no returns 1 and cancel 2 and x -1
int answer =JOptionPane.showConfirmDialog(null,"Hello","title",JOptionPane.YES_NO_CANCEL_OPTION);*/
        String name= JOptionPane.showInputDialog(null,"Enter your name","enter here");
        System.out.println(name);
        String[] responses={"No you are awesome","meow","woof"};
        JOptionPane.showOptionDialog(null,
                "You are awesome",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                responses,
                0);
    }
}
