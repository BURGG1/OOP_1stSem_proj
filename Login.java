
package javaapplication9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
    JLabel lblLogin = new JLabel("L O G I N");
    JLabel lblUser = new JLabel("Username");
    JLabel lblPass = new JLabel("Password");
    JLabel lblForgot = new JLabel("Forgot your password?");
    JLabel lblNoAcc = new JLabel("Don't have an account?");
    JLabel lblMessage = new JLabel();
    
    JTextField txtUser = new JTextField();
    JPasswordField txtPass = new JPasswordField();
    
    JCheckBox keep = new JCheckBox(" Keep me signed in",false);
    
    JButton btnLogin = new JButton("Log in");
    JButton btnSignUp = new JButton("Sign Up");
    JButton btnExit = new JButton("EXIT");
        
    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();
    JSeparator separator3 = new JSeparator();
      
    public Login() 
    {
       
        setTitle("Funeral Service Management System");
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setSize(1000,680);
        setLocationRelativeTo(null);
        setLayout(null);

        lblUser.setForeground(Color.BLACK);
        lblPass.setForeground(Color.BLACK);
        lblNoAcc.setForeground(Color.BLACK);
        lblForgot.setForeground(Color.BLUE);
        
        lblForgot.setForeground(Color.BLUE); // Make it look like a link
        lblForgot.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Change cursor on hover


        lblLogin.setFont(new Font("Arial", Font.BOLD, 30));
        lblNoAcc.setFont(new Font("SansSerif ", Font.BOLD, 13));
         
       
        lblLogin.setBounds(690, 50, 300, 50);
        separator1.setBounds(600, 100, 300, 20); 
        
        lblUser.setBounds(655, 150, 100, 30);
        txtUser.setBounds(655, 180, 200 , 35 );
        lblPass.setBounds(655, 230, 100, 30);
        txtPass.setBounds(655, 260, 200 , 35 );
//        keep.setBounds(50, 310, 300, 30);
        btnLogin.setForeground(Color.white);
        btnLogin.setBackground(Color.blue);
        btnLogin.setBounds(655 ,330 ,200 , 40);
        lblMessage.setBounds(665, 299, 300, 30);
        lblForgot.setBounds(600, 390, 200, 30);
        separator2.setBounds(600, 420, 300, 20); 
        lblNoAcc.setBounds(600, 440, 200, 30);
        btnSignUp.setBounds(600, 470, 300, 50);
//        separator3.setBounds(50, 620, 300, 20); 
//        btnExit.setBounds(50, 640, 300, 50);
        
        lblForgot.setForeground(Color.BLUE);
        lblForgot.setCursor(new Cursor(Cursor.HAND_CURSOR)); 


        lblForgot.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {                
                ForgotClass ForgotPass = new ForgotClass();
                ForgotPass.setVisible(true);
           
                dispose();
            }
        });
    
        add(lblLogin);
        add(lblUser);
        add(txtUser);
        add(lblPass);
        add(txtPass);
//        add(keep);
        add(btnLogin);
        add(lblForgot);
        add(lblNoAcc);
        add(btnSignUp);
        add(lblMessage);
        add(btnExit);
        add(separator1);
        add(separator2);
        add(separator3);

        btnLogin.addActionListener(this);  // Login button
        btnSignUp.addActionListener(this); // Sign Up button
        btnExit.addActionListener(this);   // Exit button
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    
    @Override
    public void actionPerformed(ActionEvent ev) 
    {
        
         if (ev.getSource()== btnLogin)
         {
            String username = txtUser.getText();// pang kuha ng text
            String password = new String(txtPass.getPassword());
            
            if (username.equals("admin") && password.equals("pass0")) 
            {
                dispose();
                lblMessage.setText("Logging in as an Administrator!");
                lblMessage.setForeground(Color.GREEN);
                Admin mc = new Admin();
          
            } 
            else if (username.equals("normal") && password.equals("pass1")) 
            {
                lblMessage.setText("Logging in as " + username + " user");
                lblMessage.setForeground(Color.GREEN);
               
              
            } 
            else 
            {
                lblMessage.setText("Invalid username or password.");
                lblMessage.setForeground(Color.RED);
            }
        }
        
        else if (ev.getSource() == btnSignUp)
        {
           SignUp SignUp = new SignUp();
           SignUp.setVisible(true);
           
           dispose();

        }
//        
//        else if (ev.getSource() == btnExit)
//        {
//            System.exit(0);
//        }
        
    }
    
    public static void main(String[] args) 
    {
        new progressBar_();   
        
        Login Login = new Login();
        Login.setVisible(true);
        
    }

}
