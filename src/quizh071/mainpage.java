/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizh071;

import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class mainpage {
    public mainpage()
    {
        JFrame frame = new JFrame("Main Page");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        
        JButton movie1 = new JButton("Spongebob");
        JButton movie2 = new JButton("Fast & Furious");
        JButton movie3 = new JButton("Avenger");
        JButton movie4 = new JButton("Iron Man");
        
        movie1.setBounds(10, 10, 120, 20);
        movie2.setBounds(10, 40, 120, 20);
        movie3.setBounds(10, 70, 120, 20);
        movie4.setBounds(10, 100, 120, 20);
        
        frame.add(movie1);
        frame.add(movie2);
        frame.add(movie3);
        frame.add(movie4);
        
        frame.setVisible(true);
        
        movie1.addActionListener(e -> {
            new bookpage(new spongebob());
        });
        movie2.addActionListener(e -> {
            new bookpage(new FnF());
        });
        movie3.addActionListener(e -> {
            new bookpage(new avengers());
        });
        movie4.addActionListener(e -> {
            new bookpage(new ironman());
        });
    }
    
}
