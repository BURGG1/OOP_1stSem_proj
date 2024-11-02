package javaapplication9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SignUp extends JFrame implements ActionListener 
{  
    JLabel lblSignUp = new JLabel("S I G N   U P");
    JLabel lblEmail = new JLabel("E-mail Address");
    JLabel lblUser = new JLabel("UserName");
    JLabel lblPass = new JLabel("Password");
    JLabel lblConfirm = new JLabel("Confirm Password");
    JLabel lblpos = new JLabel("Position");
    
    JTextField txtEmail = new JTextField();
    JTextField txtUser = new JTextField();
    JTextField txtPass = new JTextField();
    JTextField txtConfirm = new JTextField();
    
    JButton btnSignUp = new JButton("Sign Up");
    JButton btnBack = new JButton("Back");
    JButton btnExit = new JButton("Exit");
    
    final String [] account = {"Normal User","Administrator"};
    JComboBox pos = new JComboBox(account);

    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();
    
    public SignUp() {
        setVisible(true);
        setTitle("Funeral Service Management System");
        getContentPane().setBackground(Color.white);
        setSize(1000,680);
        setLocationRelativeTo(null);
        setLayout(null);
        
        lblSignUp.setForeground(Color.BLACK);
        lblEmail.setForeground(Color.BLACK);
        lblUser.setForeground(Color.BLACK);
        lblPass.setForeground(Color.BLACK);
        lblConfirm.setForeground(Color.BLACK);

        lblSignUp.setFont(new Font("Arial", Font.BOLD, 30));  
        lblSignUp.setBounds(415, 40, 300, 50);  // iibahin size
         
        separator1.setBounds(350, 90, 300, 20); // y = 50 if ever ibabalik
        lblEmail.setBounds(350, 120, 200, 30);   // 70
        txtEmail.setBounds(350, 150, 300, 30);   // 100
        lblUser.setBounds(350, 200, 200, 30);  //150
        txtUser.setBounds(350, 230, 300, 30);  //180
        lblPass.setBounds(350, 280, 200, 30);   //230
        txtPass.setBounds(350, 310, 300, 30);   //260
        lblConfirm.setBounds(350, 360, 200, 30);   //310
        txtConfirm.setBounds(350, 390, 300, 30);   //340
//        lblpos.setBounds(350, 390, 200, 30);
//        pos.setBounds(350, 420, 300, 30);  
        btnSignUp.setForeground(Color.WHITE);
        btnSignUp.setBackground(Color.BLUE);
        btnSignUp.setBounds(350, 440, 300, 50); //470
        separator2.setBounds(350, 520, 300, 20); //540
        btnBack.setBounds(350, 560, 130, 50); //570
        btnExit.setBounds(520, 560, 130, 50); //570
        
        add(lblSignUp);
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
        add(lblpos);
        add(pos);
        add(btnSignUp);
        add(btnBack);
        add(btnExit);
        
        btnSignUp.addActionListener(this); 
        btnBack.addActionListener(this);  
        btnExit.addActionListener(this);   
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent ev) {
        
        if (ev.getSource()== btnSignUp)
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

