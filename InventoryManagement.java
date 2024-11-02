
package javaapplication9;

import java.awt.Color;
import java.awt.event.*;
//import java.util.*;
import javax.swing.*;
 
public class InventoryManagement extends JFrame implements ActionListener{
    
        
//    JFrame FRAME3 = new JFrame();
    //BUTTONS
    JButton SMoption=new JButton("Service Management");
    JButton VSLoption=new JButton("Service View List");
    JButton IMoption=new JButton("Inventory Management");
    JButton PMoption=new JButton("Payment Management");
    JButton help=new JButton("Help");
    JButton exit=new JButton("Exit");
    //LABELS
    JLabel label3 = new JLabel("Inventory Management");
    JLabel TENT = new JLabel("TENT"); 
    JLabel CHAIR = new JLabel("CHAIR");
    JLabel CROSS = new JLabel("CROSS");
    JLabel LIGHTS = new JLabel("LIGHT");
    JLabel COFFIN = new JLabel("COFFIN"); 
    JLabel CURTAINS = new JLabel("CURTAIN");
    JLabel FLOWERS = new JLabel("FLOWER");
    
    JLabel TENTcon = new JLabel(); 
    JLabel CHAIRcon = new JLabel();
    JLabel CROSScon = new JLabel();
    JLabel LIGHTScon = new JLabel();
    JLabel COFFINcon = new JLabel(); 
    JLabel CURTAINcon = new JLabel();
    JLabel FLOWERScon = new JLabel();
    
public InventoryManagement(){  
    //JSWINGS
   
   setTitle("Funeral Service Management System");
   getContentPane().setBackground(Color.white);
   setVisible(true);
   setSize(1000,800);
   setLocationRelativeTo(null);
   setLayout(null);
 //locations of the functionalities (a,b,c,d)
  
   //locations of textfield 
 label3.setBounds(725 ,50 ,270 , 80 );  
 SMoption.setBounds(110 ,105 ,195 , 45 ); 
 VSLoption.setBounds(110 ,175 ,195 , 45 ); 
 IMoption.setBounds(110 ,245 ,195 , 45 ); 
 PMoption.setBounds(110 ,315 ,195 , 45 ); 
 help.setBounds(110 ,385 ,90 , 45 ); 
 exit.setBounds(210 ,385 ,90 ,45 );
 TENT.setBounds(475 ,110 ,270 , 80 );  
 CHAIR.setBounds(475 ,150 ,270 , 80 );  
 CROSS.setBounds(475 ,190 ,270 , 80 );  
 LIGHTS.setBounds(475 ,230 ,270 , 80 );
 COFFIN.setBounds(475 ,270 ,270 , 80 );
 CURTAINS.setBounds(475 ,310 ,270 , 80 );
 FLOWERS.setBounds(475 ,350 ,270 , 80 );  
 
 //adding button on frame  
 setVisible(true);
 add(label3);
 add(TENT);
 add(CHAIR);
 add(CROSS);
 add(LIGHTS);
 add(COFFIN);
 add(CURTAINS);
 add(FLOWERS);
 add(SMoption);
 add(VSLoption);
 add(IMoption);
 add(PMoption);
 add(help);
 add(exit);
 
 SMoption.addActionListener(this);
 VSLoption.addActionListener(this);
// IMoption.addActionListener(this);
 PMoption.addActionListener(this);
 help.addActionListener(this);
 exit.addActionListener(this);

 
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
            dispose();
            ServiceList sl = new ServiceList();
            sl.setVisible(true);
            sl.setSize(1028,680);
            sl.setLocationRelativeTo(null);
            
        }
        else if(ev.getSource() == IMoption){
//            dispose();
//            InventoryManagement im = new InventoryManagement();
//            im.setVisible(true);
//            im.setSize(1028,680);
            
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


