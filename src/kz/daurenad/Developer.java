package kz.daurenad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Developer extends Container {
        private JLabel text2;
        private JLabel text3;
        private JLabel text4;
        private JButton exitButton;
        private JButton backButton;
        public Developer(){

            setSize(600, 700);
            setLayout(null);

            text2 = new JLabel("Otegenov Dauren");
            text2.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 30));
            text2.setBounds(30,50,500,150);
            text2.setBackground(Color.getHSBColor(300,1000,687));

            text3 = new JLabel("Mail:bananzasobaken@mail.ru");
            text3.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 30));
            text3.setBounds(30,100,500,150);
            text3.setBackground(Color.getHSBColor(300,1000,687));

            text4 = new JLabel("Phone:8(777)244-50-44");
            text4.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 30));
            text4.setBounds(30,150,500,150);
            text4.setBackground(Color.getHSBColor(300,1000,687));

            backButton = new JButton("BACK");
            backButton.setBounds(160, 500, 200, 40);
            backButton.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
            backButton.setBackground(Color.getHSBColor(300,1000,687));
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MainFrame.welcomeWindow.setVisible(true);
                    MainFrame.developer.setVisible(false);
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
            add(backButton);
            add(exitButton);
            add(text2);
            add(text3);
            add(text4);
        }
    }




