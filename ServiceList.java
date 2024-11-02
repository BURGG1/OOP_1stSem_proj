
package javaapplication9;

import java.awt.Color;
import java.awt.event.*;
//import java.util.*;
import javax.swing.*;

public class ServiceList extends JFrame implements ActionListener{
//    JFrame FRAME2 = new JFrame();
   
    JButton SMoption=new JButton("Service Management");
    JButton VSLoption=new JButton("Service View List");
    JButton IMoption=new JButton("Inventory Management");
    JButton PMoption=new JButton("Payment Management");
    JButton help=new JButton("Help");
    JButton exit=new JButton("Exit");
    
    JLabel label2 = new JLabel("Service View List");
    JLabel ID = new JLabel("ID"); 
    JLabel NAMED = new JLabel("Name");
    JLabel DATE = new JLabel("Date");
    JLabel PACKAGE = new JLabel("Package");
    
    JLabel IDcon = new JLabel();
    JLabel Namecon = new JLabel();
    JLabel Datecon = new JLabel();
    JLabel Packagecon = new JLabel();    
    
    
    
 public ServiceList(){  
    //JSWINGS
    setTitle("Funeral Service Management System");
    getContentPane().setBackground(Color.white);
    setVisible(true);
    setSize(1000,800);
    setLocationRelativeTo(null);
    setLayout(null);
   
 //locations of the functionalities (a,b,c,d)
  
   //locations of textfield 
   
 SMoption.setBounds(80 ,105 ,195 , 45 ); 
 VSLoption.setBounds(80 ,175 ,195 , 45 ); 
 IMoption.setBounds(80 ,245 ,195 , 45 ); 
 PMoption.setBounds(80 ,315 ,195 , 45 ); 
 help.setBounds(80 ,385 ,90 , 45 ); 
 exit.setBounds(180 ,385 ,90 ,45 );
 label2.setBounds(725 ,50 ,270 , 80 ); 

 
 ID.setBounds(375 ,110 ,270 , 80 );  
 NAMED.setBounds(550 ,110 ,270 , 80 );  
 DATE.setBounds(775 ,110 ,270 , 80 );  
 PACKAGE.setBounds(950 ,110 ,270 , 80 );  

 
 
 IDcon.setBounds(475, 140,270,80);
 
 //adding button on frame  
setVisible(true);
add(ID);
add(NAMED);
add(DATE);
add(PACKAGE);
add (label2);
add(SMoption);
add(VSLoption);
add(IMoption);
add(PMoption);
add(help);
add(exit);
setSize(400,500);  
setLayout(null);  
setVisible(true);  

SMoption.addActionListener(this);
//VSLoption.addActionListener(this);
IMoption.addActionListener(this);
PMoption.addActionListener(this);
help.addActionListener(this);
exit.addActionListener(this);

 
 add(IDcon);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
   
    @Override
    public void actionPerformed(ActionEvent ev) {
        if(ev.getSource() == SMoption) {
           dispose();
           ServiceManagement sm = new ServiceManagement();
           sm.setVisible(true);
           sm.setSize(1028,680);
           sm.setLocationRelativeTo(null);
        }
        else if(ev.getSource() == VSLoption){
//            dispose();
//            ServiceList sl = new ServiceList();
//            sl.setVisible(true);
//            sl.setSize(1028,680);
//            sl.setLocationRelativeTo(null);
            
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


