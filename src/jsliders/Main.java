package jsliders;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class sliderDemo implements ChangeListener {
JFrame frame;
JPanel panel;
JLabel label;
JSlider slider;

    sliderDemo(){
        frame=new JFrame("Slider tutorial");
        panel=new JPanel();
        label=new JLabel();
       // panel.setBackground(Color.lightGray);
        slider=new JSlider(0,100,50);//Add the spectrum of values of minimun and maximum values and the starting pont
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);//Sets the ticks
        slider.setMinorTickSpacing(10);//sets the spacing between ticks
        slider.setMajorTickSpacing(25);//sets the major spacing between ticks
        slider.setPaintTrack(true);//sets the paint for the track of the slider
        slider.setPaintLabels(true);//sets numebers for the major ticks
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);
        label.setText("°C = "+slider.getValue());  // but if you adjust this in the begging the vlaue doesn;t change and you have tpo add this function to the action change listener

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = "+slider.getValue());
    }
}
public class Main {
    public static void main(String[] args) {
        //J-slider is A component that lets the user graphically select a value by sliding a knob within a bounded interval.
        sliderDemo sm=new sliderDemo();
    }
}
