/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_gui;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
    

public class SubClass extends JFrame implements ActionListener {     
     JLabel lb1 = new JLabel("Do have crush on me, do you?");
     JLabel lb2 =  new JLabel("YIIEE HAHHAHAHAHAHA KAKELEGH");
     JLabel lb3 =  new JLabel("If you close this without answerin it means YES lol"); 
     
     JButton btnY = new JButton("YES");
     JButton btnN = new JButton("NO");
      
   
       SubClass(){
        
        setVisible(true);
        setSize(400,200);
        setLocationRelativeTo(null);
        setLayout(null);
        
        lb1.setBounds(100,2,400,70);
        lb3.setBounds(45,5,400,90);
        
        btnY.setBounds(100,60,70,20);
        btnN.setBounds(180,60,70,20);
        
        add(lb1);
        add(lb3);
        add(btnY);
        add(btnN);
        
        
        btnY.addActionListener(this);
        btnN.addActionListener(this);
        
      }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == btnY){
          
           String n = "Silecene means yes";
           Practice_GUI pb = new Practice_GUI();
           pb.frame.setSize(400,200);
           pb.frame.setVisible(true);
           pb.frame.getContentPane().setBackground(Color.white);
           pb.frame.setLocationRelativeTo(null);
           pb.frame.setLayout(null);
           pb.frame.add(lb2);
           
           
           
           
           dispose();
       }
       else if(ae.getSource() == btnN){
           int y = 60, x = 180;
           
           Practice_GUI pb = new Practice_GUI();
           pb.frame.setSize(400,200);
           pb.frame.setVisible(true);
           pb.frame.getContentPane().setBackground(Color.white);
           pb.frame.setLocationRelativeTo(null);
           pb.frame.setLayout(null);
           
           y = (int)(Math.random() * 80);
           x = (int) (Math.random() * 350);
           btnN.setBounds(x,y,70,20);
           
           pb.btnY.setBounds(100,60,70,20);
           pb.btnN.setBounds(x,y,70,20);
 
           
           pb.frame.add(lb1);
           pb.frame.add(btnY);
           pb.frame.add(btnN);
           dispose();
       }
    
    }

}