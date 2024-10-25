
package javaapplication9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ForgotClass extends JFrame implements ActionListener
{
    
    JLabel lblCont = new JLabel("FORGOT PASSWORD");
    JLabel lblEmail = new JLabel("E-mail Address");
    JLabel lblUser = new JLabel("UserName");
    JLabel lblPass = new JLabel("New Password");
    JLabel lblConfirm = new JLabel("Confirm Password");
    
    JTextField txtEmail = new JTextField();
    JTextField txtUser = new JTextField();
    JTextField txtPass = new JTextField();
    JTextField txtConfirm = new JTextField();
    
    JButton btnCont = new JButton("Continue");
    JButton btnBack = new JButton("Back");
    JButton btnExit = new JButton("Exit");
    

    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();
    
    public ForgotClass() {
        
        setVisible(true);
        setTitle("Funeral Service Management System");
        getContentPane().setBackground(Color.white);
        setSize(1000,680);
        setLocationRelativeTo(null);
        setLayout(null);
        
        lblCont.setForeground(Color.BLACK);
        lblEmail.setForeground(Color.BLACK);
        lblUser.setForeground(Color.BLACK);
        lblPass.setForeground(Color.BLACK);
        lblConfirm.setForeground(Color.BLACK);

        lblCont.setFont(new Font("Arial", Font.BOLD, 24));
        
        lblCont.setBounds(375, 40, 300, 50);  
        separator1.setBounds(350, 90, 300, 20); 
        lblEmail.setBounds(350, 120, 200, 30);   
        txtEmail.setBounds(350, 150, 300, 35);   
        lblUser.setBounds(350, 200, 200, 30);  
        txtUser.setBounds(350, 230, 300, 35);  
        lblPass.setBounds(350, 280, 200, 30);   
        txtPass.setBounds(350, 310, 300, 35);   
        lblConfirm.setBounds(350, 360, 200, 30);   
        txtConfirm.setBounds(350, 390, 300, 35);
        
        btnCont.setForeground(Color.WHITE);
        btnCont.setBackground(Color.BLUE);
        btnCont.setBounds(350, 440, 300, 50); 
        separator2.setBounds(350, 520, 300, 20); 
        btnBack.setBounds(350, 560, 130, 50); 
        btnExit.setBounds(520, 560, 130, 50); 
        
        add(lblCont);
        add(lblEmail);
        add(lblUser);
        add(lblPass);
        add(lblConfirm);
        add(txtEmail);
        add(txtUser);
        add(txtPass);
        add(txtConfirm);
        add(separator1);
        add(separator2);
        add(btnCont);
        add(btnBack);
        add(btnExit);
        
        btnCont.addActionListener(this); 
        btnBack.addActionListener(this);  
        btnExit.addActionListener(this);   
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource()== btnCont)
        {
            dispose();
            Login back = new Login();
            back.setVisible(true);

        }
        
        else if (ev.getSource() == btnBack)
        {
            dispose();
            Login back = new Login();
            back.setVisible(true);

        }
        
        else if (ev.getSource() == btnExit)
        {
            System.exit(0);
        }
    }
    
    
}
