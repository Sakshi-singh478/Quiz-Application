package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    Score(String name,int score){
        setBounds(600,150,750,550); 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,250,300,300);        
        add(image);
        
        JLabel heading= new JLabel("ThankYou "+name+" for Attending Game");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Papyrus",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel lblscore= new JLabel("Your Score is : "+ score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(lblscore);
        
        JButton submit= new JButton("Play Again");
        submit.setBounds(350,270,200,30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(Color.RED);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args){
        new Score("user",0);
    }
}
