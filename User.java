
package javaapplication9;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class User extends JFrame implements ActionListener{
    JButton SMoption=new JButton("Service Management");
    JButton VSLoption=new JButton("Service View List");
    JButton IMoption=new JButton("Inventory Management");
    JButton PMoption=new JButton("Payment Management");
    JButton help=new JButton("Help");
    JButton exit=new JButton("Exit");
    
    public User(){
        setTitle("Funeral Service Management System");
        setSize(1028,680);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        
        IMoption.setBackground(Color.LIGHT_GRAY);
        SMoption.setBounds(80 ,105 ,195 , 45 ); 
        VSLoption.setBounds(80 ,175 ,195 , 45 ); 
        IMoption.setBounds(80 ,245 ,195 , 45 ); 
        PMoption.setBounds(80 ,315 ,195 , 45 ); 
        help.setBounds(80 ,385 ,90 , 45 ); 
        exit.setBounds(180 ,385 ,90 ,45 );
        
        add(SMoption);
        add(VSLoption);
        add(IMoption);
        add(PMoption);
        add(help);
        add(exit);
        
        SMoption.addActionListener(this);
        VSLoption.addActionListener(this);
//        IMoption.addActionListener(this);
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
