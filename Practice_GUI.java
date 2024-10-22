/*
Torres Adrian A.
BSIT 2A G1 
Last Edit (October 16,24)
Practice GUI(JFrame, ActionListener, etc)
 */
package practice_gui;

//import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice_GUI extends JFrame implements ActionListener{
     JFrame frame = new JFrame();
     JPanel panel = new JPanel();
     
     JLabel lb1 = new JLabel("Do have crush on me, do you?");
     JButton btnLOG = new JButton("Log In");
     JButton btnSIGN = new JButton("Sign In");
     JButton btnY = new JButton("YES");
     JButton btnN = new JButton("NO");
     
     JLabel usrn = new JLabel("Username");
     JLabel pasw = new JLabel("Password");
     JLabel forg = new JLabel("Forgot Password?");
     JLabel Logo = new JLabel();
     
     JTextField user = new JTextField();
     JPasswordField pass = new JPasswordField(7);
     
     
     public Practice_GUI(){
         frame.setTitle("Try");
         frame.getContentPane().setBackground(Color.lightGray);
         frame.setVisible(true);
         frame.setSize(700,400);
         frame.setLocationRelativeTo(null);
         frame.setLayout(null);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/practice_gui/DOVE.png"));
        Image img3=icon.getImage();
        Image img4=img3.getScaledInstance(80, 80, Image.SCALE_SMOOTH);         
        ImageIcon i = new ImageIcon(img4);
        Logo.setIcon(i);
         
         
         usrn.setForeground(Color.black);
         usrn.setBounds(400, 50, 400,100); // x, y , w, h
         pasw.setForeground(Color.black);
         pasw.setBounds(400,120,400,100);
         forg.setForeground(Color.BLUE);
         forg.setBounds(400,170,400,100);
         //txt field
         user.setBounds(400,110,120,30);
         pass.setBounds(400, 180, 120, 30);
         
         btnLOG.setBounds(550, 270, 80, 20);
         btnSIGN.setBounds(550,300,80,20);        

         frame.add(usrn);
         frame.add(pasw);
         frame.add(Logo);
         frame.add(btnLOG);
         frame.add(btnSIGN);
         frame.add(forg);
         frame.add(user);
         frame.add(pass);
         
         btnLOG.addActionListener(this);
         
         
        
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
    
    
    public static void main(String[] args) {
        Practice_GUI prac = new Practice_GUI();
        prac.setVisible(true);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== btnLOG){
           SubClass nframe = new SubClass();
           nframe.setVisible(true);
           
        }
        else if(ae.getSource()== btnSIGN){
            
       }
    }
    
}
