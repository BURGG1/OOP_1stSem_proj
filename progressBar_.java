package javaapplication9;

import java.awt.Color;
import javax.swing.JProgressBar;

import javax.swing.*;
public class progressBar_ extends JFrame {
  
       
    JProgressBar pb = new JProgressBar();       
    JLabel pls = new JLabel("Please wait...");
    JLabel ld = new JLabel("Loading");   
   public progressBar_(){
       
       setSize(500,250);
       setLayout(null);
       setUndecorated(true);// para mawala yung nasa taas ng frame
       
       pb.setForeground(Color.DARK_GRAY);
       pb.setBounds(90,100,300,30);
       pb.setValue(0);// set lang yung value ng progress bar sa 0
       pb.setStringPainted(true); // ito yung percent sa gitna ng bar
       
       pls.setBounds(200,130,300,30);
       ld.setBounds(210,70,300,30);
       
//       add(ld);
       add(pls);
       add(pb);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);
       iterate();
   }
    public void iterate(){
       int i = 0;
       while(i <= 100){
       pb.setValue(i);
       i = i + 10;
       try{Thread.sleep(500);}catch(Exception e){ e.printStackTrace();}
      }
       dispose();
   }
   
}
