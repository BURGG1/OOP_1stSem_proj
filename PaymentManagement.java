
package javaapplication9;

import java.awt.*;
import java.awt.event.*;
//import java.util.*;
import javax.swing.*;

public class PaymentManagement extends JFrame implements ActionListener{
//    JFrame FRAME4 = new JFrame();
    //BUTTONS
    JButton SMoption=new JButton("Service Management");
    JButton VSLoption=new JButton("Service View List");
    JButton IMoption=new JButton("Inventory Management");
    JButton PMoption=new JButton("Payment Management");
    JButton help=new JButton("Help");
    JButton exit=new JButton("Exit");
    //LABELS
    JLabel label4 = new JLabel("Payment Management");
    JLabel Name = new JLabel("Name: "); 
    JLabel Package = new JLabel("Package: ");
    JLabel Date = new JLabel("Date: ");
    JLabel ItemsAmount = new JLabel("No. of items");
    JLabel ItemsNeeded = new JLabel("Items needed"); 
    JLabel Price = new JLabel("Price ");
    JLabel Total = new JLabel("Total: ");
   
  
public PaymentManagement(){  
    //JSWINGS
         setTitle("Funeral Service Management System");
         getContentPane().setBackground(Color.white);
         setVisible(true);
         setSize(1000,800);
         setLocationRelativeTo(null);
         setLayout(null);
 //locations of the functionalities (a,b,c,d)
  
   //locations of textfield 
 label4.setBounds(725 ,50 ,270 , 80 );  
 SMoption.setBounds(80 ,105 ,195 , 45 ); 
        VSLoption.setBounds(80 ,175 ,195 , 45 ); 
        IMoption.setBounds(80 ,245 ,195 , 45 ); 
        PMoption.setBounds(80 ,315 ,195 , 45 ); 
        help.setBounds(80 ,385 ,90 , 45 ); 
        exit.setBounds(180 ,385 ,90 ,45 );
 
 Name.setBounds(475 ,110 ,270 , 80 );  
 Package.setBounds(675 ,110 ,270 , 80 );  
 Date.setBounds(875 ,110 ,270 , 80 );  
 ItemsAmount.setBounds(475 ,170 ,270 , 80 );
 ItemsNeeded.setBounds(625 ,170 ,270 , 80 );
 Price.setBounds(825 ,170 ,270 , 80 );
 Total.setBounds(660 ,550 ,270 , 80 );  
 
 //adding button on frame  
 setVisible(true);
 add(label4);
 add(Name);
 add(Package);
 add(Date);
 add(ItemsAmount);
 add(ItemsNeeded);
 add(Price);
 add(Total);
 add(SMoption);
 add(VSLoption);
 add(IMoption);
 add(PMoption);
 add(help);
 add(exit);
 
 SMoption.addActionListener(this);
 VSLoption.addActionListener(this);
 IMoption.addActionListener(this);
 PMoption.addActionListener(this);
 help.addActionListener(this);
 exit.addActionListener(this);
        
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    @Override
    public void actionPerformed(ActionEvent ev) {
         if(ev.getSource() == SMoption){
           dispose();
           ServiceManagement sm = new ServiceManagement();
           sm.setVisible(true);
           sm.setSize(1028,680);
           sm.setLocationRelativeTo(null);
         
        }
        else if(ev.getSource() == VSLoption){
            dispose();
            ServiceList sl = new ServiceList();
            sl.setVisible(true);
            sl.setSize(1028,680);
            sl.setLocationRelativeTo(null);
            
        }
        else if(ev.getSource() == IMoption){
            dispose();
            InventoryManagement im = new InventoryManagement();
            im.setVisible(true);
            im.setSize(1028,680);
            im.setLocationRelativeTo(null);
        }
        else if(ev.getSource() == PMoption){
            dispose();
            PaymentManagement pm = new PaymentManagement();
            pm.setVisible(true);
            pm.setSize(1028,680);
            pm.setLocationRelativeTo(null);
        }
        else if(ev.getSource() == help){
            
        }
        else if(ev.getSource()== exit){
        dispose(); 
            int n = JOptionPane.showConfirmDialog(null, "Are you sure?", "FSMS", JOptionPane.YES_NO_OPTION);
            System.out.print(n);
            
            if (n==0){ // 0 is YES, 1 is NO
                System.exit(0);
               
            }           
            else{
                Admin back = new Admin();
                back.setVisible(true); 
            }
        }
    }
    
}


