
package javaapplication9;
import java.awt.Color;
import java.awt.event.*;
//import java.util.*;
import javax.swing.*;

public class ServiceManagement extends JFrame implements ActionListener{
//    JFrame FRAME1 = new JFrame();
    public static String cname ,dname ,bdate ,ddate ,addr ,contact ,s_service ,t_service ,atime; 
    public static String id, ran;
    public static int rand ,rand2; 
   
   
    JLabel error = new JLabel();
    JLabel Client = new JLabel("Name of the Client");
    JLabel Death  = new JLabel("Name of the deceased person");
    JLabel bday   = new JLabel("Birthday of the deceased person");
    JLabel death  = new JLabel("Date of Death");
    JLabel address1 = new JLabel("Address");
    JLabel phonenumber = new JLabel("Contact Number");
    JLabel Servicespecial = new JLabel("Special Service"); //combobox later
    JLabel Type  = new JLabel("Service Type");
    JLabel Arrive = new JLabel("Time of Arrival"); // also combobox
    
    JTextField Clientname= new JTextField(8);
    JTextField Deadname = new JTextField(8);
    JTextField dateofbday = new JTextField(8);
    JTextField deathdate = new JTextField(8);
    JTextField address= new JTextField(8);
    JTextField numberphone = new JTextField(8);
    JTextField Specialservice = new JTextField(8);
    JTextField servicetype = new JTextField(8);
    JTextField Arrivaltime = new JTextField(8);
    
    JButton SMoption=new JButton("Service Management");
    JButton VSLoption=new JButton("Service View List");
    JButton IMoption=new JButton("Inventory Management");
    JButton PMoption=new JButton("Payment Management");
    JButton help=new JButton("Help");
    JButton exit=new JButton("Exit");
    JButton Confirm = new JButton("Confirm");
    JLabel label1 = new JLabel("Service Management");

   public ServiceManagement(){  
    //JSWINGS
    setTitle("Funeral Service Management System");
    getContentPane().setBackground(Color.white);
    setVisible(true);
    setSize(1000,700);
    setLocationRelativeTo(null);
    setLayout(null);
   
 //locations of the functionalities (a,b,c,d)
   Client.setBounds(480 ,115 ,195 , 30 );
   Death.setBounds(480 ,185 ,195 , 30 );
   bday.setBounds(480 ,255 ,195 , 30 );
   death.setBounds(480 ,325 ,195 , 30 );
   address1.setBounds(480 ,395 ,195 , 30 );
   phonenumber.setBounds(780 ,115 ,195 , 30 );
   Servicespecial.setBounds(780 ,185 ,195 , 30 );
   Type.setBounds(780 ,255 ,195 , 30 );
   Arrive.setBounds(780 ,325 ,195 , 30 );
   //locations of textfield
   Clientname.setBounds(480 ,145 ,195 , 35 );
   Deadname.setBounds(480 ,215 ,195 , 35 );
   dateofbday.setBounds(480 ,285 ,195 , 35 );
   deathdate.setBounds(480 ,355 ,195 , 35 );
   Arrivaltime.setBounds(480 ,425 ,195 , 35 );
   address.setBounds(780 ,145 ,195 , 35 );
   numberphone.setBounds(780 ,215 ,195 , 35 );
   Specialservice.setBounds(780 ,285 ,195 , 35 );
   servicetype.setBounds(780 ,355 ,195 , 35 );
 
   Confirm.setBounds(840 ,430 ,80 , 35 );
 
   SMoption.setBounds(80 ,115 ,195 , 45 ); 
   VSLoption.setBounds(80 ,180 ,195 , 45 ); 
   IMoption.setBounds(80 ,255 ,195 , 45 ); 
   PMoption.setBounds(80 ,325 ,195 , 45 ); 
   help.setBounds(80 ,395 ,90 , 45 ); 
   exit.setBounds(180 ,395 ,90 ,45 );
   label1.setBounds(675 ,50 ,270 , 80 );  
   error.setBounds(500, 400, 300, 300);
 //adding button on frame  
   setVisible(true);
   add(Client);
   add(Death);
   add(bday);
   add(death);
   add(address1);
   add(phonenumber);
   add(Servicespecial);
   add(Type);
   add(Arrive);
   add(Confirm);
   add(Clientname);
   add(Deadname);
   add(dateofbday);
   add(deathdate);
   add(address);
   add(numberphone);
   add(Specialservice);
   add(servicetype);
   add(Arrivaltime);
   add (label1);
   add(SMoption);
   add(VSLoption);
   add(IMoption);
   add(PMoption);
   add(help);
   add(exit);
   add(error);
   setSize(400,500);  
   setLayout(null);  
   setVisible(true); 

   SMoption.addActionListener(this);
   VSLoption.addActionListener(this);
   IMoption.addActionListener(this);
   PMoption.addActionListener(this);
   help.addActionListener(this);
   exit.addActionListener(this);
   Confirm.addActionListener(this);
   
  
   
   
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
   
       public void actionPerformed(ActionEvent ev) {
        if(ev.getSource() == Confirm){
           dispose();
              
             error.setVisible(false);
             cname = Clientname.getText();
             dname = Deadname.getText();
             bdate = dateofbday.getText();
             ddate = deathdate.getText();
             addr = address.getText();
             contact = numberphone.getText();
             s_service = Specialservice.getText();
             t_service = servicetype.getText();
             atime = Arrivaltime.getText();
           
             
             
             if(cname.isEmpty()){                 
                 setVisible(true);
                 error.setText("Incomplete information please try again!");
                 error.setForeground(Color.RED);
                 error.setVisible(true);
             }
             else{
                 rand = (int)(Math.random() * 99);
                 rand2 = (int)(Math.random() * 9);
                 ran = Integer.toString(rand);
                 id = "2024" + rand2 + "0"  + ran;
                 PaymentManagement pm = new PaymentManagement();             
                  pm.setVisible(true);             
                  pm.setSize(1028,680);             
                  pm.setLocationRelativeTo(null);
                  pm.Cname.setText(cname);
             }
         
             
             
             
             
             
             
             
             
        }
       else if(ev.getSource() == VSLoption){
            dispose();
            ServiceList sl = new ServiceList();
            sl.setVisible(true);
            sl.setSize(1028,680);
            sl.setLocationRelativeTo(null);
            sl.IDcon.setText(id);
            
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

