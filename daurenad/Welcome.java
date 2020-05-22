package kz.daurenad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
public class Welcome extends Container{
    private JButton welcome;
    private JButton welcome2;
    private JLabel text2;
    private JLabel text3;
    private JLabel text4;
    private JButton exitButton;
    public Welcome(){

        setSize(600, 700);
        setLayout(null);

        welcome = new JButton("Storage");
        welcome.setBounds(160, 450, 200, 40);
        welcome.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        welcome.setBackground(Color.getHSBColor(300,1000,687));

        welcome2 = new JButton("Developer");
        welcome2.setBounds(160, 500, 200, 40);
        welcome2.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        welcome2.setBackground(Color.getHSBColor(300,1000,687));


        text3 = new JLabel("I can store information");
        text3.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 35));
        text3.setBounds(40,75,500,500);

        text4 = new JLabel("\n" + "Let's check");
        text4.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 37));
        text4.setBounds(150,150,500,500);

        text2 = new JLabel("WELCOME");
        text2.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 50));
        text2.setBounds(170,50,500,250);
        text2.setBackground(Color.getHSBColor(300,1000,687));

        welcome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.welcomeWindow.setVisible(false);
                MainFrame.menuWindow.setVisible(true);
            }
        });

        welcome2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.welcomeWindow.setVisible(false);
                MainFrame.chatClient.setVisible(true);
                MainFrame.developer.setVisible(true);
            }
        });

        exitButton = new JButton("EXIT");
        exitButton.setBounds(160, 600, 200, 40);
        exitButton.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        exitButton.setBackground(Color.getHSBColor(300,1000,687));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
        add(welcome);
        add(text2);
        add(text3);
        add(text4);
        add(welcome2);
    }
}


