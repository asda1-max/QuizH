/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizh071;

/**
 *
 * @author Lab Informatika
 */
import javax.swing.*;
public class loginpage {
    public loginpage()
    {
        JFrame frame = new JFrame("Login Page");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        
        JLabel labelNama = new JLabel("Nama : ");
        JLabel labelPassword = new JLabel("Password : ");
        JTextField textNama = new JTextField();
        JPasswordField textpw = new JPasswordField();
        JButton login = new JButton("login here");
        
        labelNama.setBounds(10, 10, 120, 20);
        labelPassword.setBounds(10, 30, 120, 20);
        textNama.setBounds(130,10,180,20);
        textpw.setBounds(130,30,180,20);
        login.setBounds(10,70,300,20);
        
        frame.add(labelNama);
        frame.add(labelPassword);
        frame.add(textNama);
        frame.add(textpw);
        frame.add(login);
        
        frame.setVisible(true);
        
        login.addActionListener(e -> {
            String username = textNama.getText();
            String pW = new String( textpw.getPassword());
            
            if (username.equals("user") && pW.equals("user")) {
                new mainpage();
                frame.dispose();
            }
        });
    }
}
