package quiz.application;

import javax.swing.*;// to import JFrame from java extended version
import java.awt.*;
//import javax.swing.border.Border;// for adding border
import java.awt.event.*;// for ading links in the button or for importing action Listener

public class Login extends JFrame implements ActionListener{ //ActionListener is an abstract unimplement method so we have to override it to implement
    
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Quiz.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,500,500);        
        //Border imageBorder = BorderFactory.createLineBorder(Color.BLACK, 50); //this is to add border in image
        //image.setBorder(imageBorder);
        add(image);
        
        JLabel heading = new JLabel("Get Ready for Brain Storming...");
        heading.setBounds(500,60,650,55);
        heading.setFont(new Font("Papyrus", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(700,150,650,55);
        name.setFont(new Font("Courier New", Font.BOLD, 25));
        //name.setForeground(Color.BLUE);
        add(name);
        
        tfname= new JTextField();
        tfname.setBounds(580,250,500,30);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules= new JButton("Rules");
        rules.setBounds(580,330,200,30);
        rules.setBackground(Color.red);
        rules.setFont(new Font("Times New Roman",Font.BOLD,20));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back= new JButton("Back");
        back.setBounds(880,330,200,30);
        back.setBackground(Color.red);
        back.setFont(new Font("Times New Roman",Font.BOLD,20));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        //Border paneBorder = BorderFactory.createLineBorder(Color.BLUE, 5); //this is to add border in whole winndow
        //getRootPane().setBorder(paneBorder);
        setSize(1200,600);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){//method for overriding actionlistener
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Login();  //Anonymous object
    }
    
}
