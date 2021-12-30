package jprogress.bar;

import javax.swing.*;
import java.awt.*;

class ProgressBarTutorial{
JFrame frame=new JFrame();
JProgressBar bar=new JProgressBar(0,100);//you can add a minemum and a maximum values to this progress bar like an Hp vbar for a video game
    ProgressBarTutorial(){
        bar.setBounds(0,0,420,50);
        bar .setStringPainted(true);//Adds a precentage the bar
        bar.setFont(new Font("Comic Sans",Font.BOLD,20));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);
frame.add(bar);
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
frame.setSize(500,500);
frame.setLayout(null);
frame.setVisible(true);
        fill();
    }
    private void fill() {
        int counter=100;
        while(counter>=0){
            bar.setValue(counter);
            bar.setString(Integer.toString(counter)+" / "+"100 HP");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter-=1;
        }
        bar.setString("Done !");
    }
}
public class Main {
    public static void main(String[] args) {
        //A progress bar is a graphical control element used to visualize the progression of an extended computer operation, such as a download, file transfer
        ProgressBarTutorial demo=new ProgressBarTutorial();
    }
}
