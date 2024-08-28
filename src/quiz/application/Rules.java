package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton start, back;
    
    Rules(String name) {  // Parameterized Constructor
        this.name = name;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Brain Storming Session");
        heading.setBounds(20, 40, 1000, 70);
        heading.setFont(new Font("Papyrus", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 100, 800, 400);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rules.setText(
            "<html>" +
                "1. Time Limit: Each question must be answered within a set time limit (e.g., 30 seconds). If the timer runs out, the question is marked as incorrect." + "<br><br>" +
                "2. Single Attempt: Each question can be attempted only once. No second chances are allowed." + "<br><br>" +
                "3. No Backtracking: Once you submit an answer, you cannot go back to change it. Make sure you are confident before submitting." + "<br><br>" +
                "4. Scoring: Points are awarded for each correct answer. Incorrect answers do not negatively affect your score, but no points are given." + "<br><br>" +
                "5. Answer Format: Ensure your answers match the required format (e.g., multiple choice, true/false) to be counted as correct." + "<br><br>" +
                "6. No External Help: Use of external resources (books, internet, other people) during the quiz is not allowed." + "<br><br>" +
                "7. Submit on Time: All answers must be submitted before the quiz ends. Late submissions will not be accepted." + "<br><br>" +
            "</html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(220, 500, 150, 30);
        back.setBackground(Color.RED);
        back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(480, 500, 150, 30);
        start.setBackground(Color.RED);
        start.setFont(new Font("Times New Roman", Font.BOLD, 20));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(900, 650);
        setLocation(390, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            // Add your action for the Start button here
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login(); // Assuming you have a Login class to go back to the login screen
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
