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
public class tixsum {
    public tixsum(String name, String date, String time, int tickA, String payment, movies selected)
    {
        JFrame frame = new JFrame("Main Page");
        frame.setSize(700,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        
        int totalbiaya = (selected.nilai * tickA) + (10*(selected.nilai * tickA));
        
        JLabel tixfin = new JLabel("<html> <h2>ticket summary</h2><br><p> movie name : " + name + "</p><br><p> date : " + date + "</p><br><p> show time : " + time + "</p><br><p> Ticket(s) : " + tickA + "</p><br><p> Payment Method : " + payment + "</p><br><br><h3>Movie Selected : " + selected.namafilm + "</h3><br><h4>total : "+ totalbiaya +"</h4></html>");
        tixfin.setBounds(10,10,500,400);
        frame.add(tixfin);
        frame.setVisible(true);
    }
    
}
