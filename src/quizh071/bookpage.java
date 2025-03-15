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
public class bookpage {
    public bookpage(movies selected)
    {
        
        JFrame frame = new JFrame("Main Page");
        frame.setSize(700,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        
        JLabel name = new JLabel("Name :");
        JLabel bookDate = new JLabel("Booking Date :");
        JLabel showTime = new JLabel("Show Time :");
        JLabel NoT = new JLabel("Number of Ticket :");
        JLabel paymentM = new JLabel("Payment Method :");
        JLabel  CC= new JLabel("Credit Card");
        JLabel  EW= new JLabel("E-Wallet");
        JLabel  BT= new JLabel("Bank Transfer");
        JLabel tahunini = new JLabel("2025");
        
        JTextField name_F = new JTextField();
        JTextField bookDate_F = new JTextField();
        JTextField NoT_F = new JTextField();
        
        JRadioButton Ccard = new JRadioButton();
        JRadioButton Ewallet = new JRadioButton();
        JRadioButton Btransfer = new JRadioButton();
        
        ButtonGroup payGroup = new ButtonGroup();
        payGroup.add(Ccard);
        payGroup.add(Ewallet);
        payGroup.add(Btransfer);
        
        String[] pilihanbulan ={"jan","feb","mar","apr","may","jun","jul","aug","sep","okt","nov","des"};
        JComboBox<String> month = new JComboBox<>(pilihanbulan);
        
        String[] pilihanwaktu ={"12:00","15:00","18:00","21:00"};
        JComboBox<String> showTimeChoose = new JComboBox<>(pilihanwaktu);
        
        JButton book = new JButton("Book Ticket");
        JButton res = new JButton("Reset");
        JButton back = new JButton("Back");
        
        book.setBounds(0,120,120,30);
        res.setBounds(140,120,120,30);
        back.setBounds(280,120,120,30);
        
        name.setBounds(10,10,160,20);
        bookDate.setBounds(10,30,160,20);
        showTime.setBounds(10,50,160,20);
        NoT.setBounds(10,70,160,20);
        paymentM.setBounds(10,90,160,20);
        CC.setBounds(200,90,120,20);
        EW.setBounds(350,90,120,20);
        BT.setBounds(500,90,120,20);
        tahunini.setBounds(380,30,50,20);
        
        name_F.setBounds(180, 10, 120, 20);
        bookDate_F.setBounds(180, 30, 120, 20);
        NoT_F.setBounds(180, 70, 120, 20);
        
        month.setBounds(320, 30, 50, 20);
        showTimeChoose.setBounds(180,50,120,20);
        
        Ccard.setBounds(180,90,20,20);
        Ewallet.setBounds(330,90,20,20);
        Btransfer.setBounds(480,90,20,20);
        
        frame.add(name);
        frame.add(bookDate);
        frame.add(showTime);
        frame.add(NoT);
        frame.add(paymentM);
        frame.add(name_F);
        frame.add(bookDate_F);
        frame.add(NoT_F);
        frame.add(CC);
        frame.add(EW);
        frame.add(BT);
        frame.add(Ccard);
        frame.add(Ewallet);
        frame.add(Btransfer);
        frame.add(showTimeChoose);
        frame.add(month);
        frame.add(tahunini);
        frame.add(book);
        frame.add(res);
        frame.add(back);
        
        book.addActionListener(e->{
            String nameS;
            String date;
            String ShowT;
            int NoT_val;
            String PaymentMethod = "";
            String MonthS;
            
            nameS = name_F.getText();
            ShowT =(String) showTimeChoose.getSelectedItem();
            MonthS =(String) month.getSelectedItem();
            date = bookDate_F.getText();
            NoT_val = Integer.parseInt(NoT_F.getText());
            
            String combdate = (date + " " +  MonthS + " 2025");
            
            if (Ccard.isSelected()) {
                PaymentMethod = "Credit Cards";
            }
            else if (Ewallet.isSelected()) {
                PaymentMethod = "E Wallet";
            }
            else if (Btransfer.isSelected()) {
                PaymentMethod = "Bank Transfer";
            }
            
            new tixsum(nameS, combdate, ShowT, NoT_val, PaymentMethod, selected);
        });
        
        frame.setVisible(true);
    }
    
}
