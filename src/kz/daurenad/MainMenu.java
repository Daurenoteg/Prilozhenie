package kz.daurenad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainMenu extends Container {
    private JLabel text1;
    private JLabel text2;
    private JLabel text3;
    private JButton addButton;
    private JButton listButton;
    private JButton exitButton;

    public MainMenu(){
        setSize(600, 700);
        setLayout(null);

        text1 = new JLabel("Yo Can leave anytime");
        text1.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 35));
        text1.setBounds(120,110,500,500);

        text2 = new JLabel("List of devices");
        text2.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 35));
        text2.setBounds(150,-150,500,500);

        text3 = new JLabel("Add a new device");
        text3.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 35));
        text3.setBounds(150,-50,500,500);

        addButton = new JButton("Add");
        addButton.setBounds(160, 220, 300, 40);
        addButton.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        addButton.setBackground(Color.getHSBColor(300,1000,687));
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(true);
            }
        });


        listButton = new JButton("LIST");
        listButton.setBounds(160, 120, 300, 40);
        listButton.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        listButton.setBackground(Color.getHSBColor(300,1000,687));
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.listWindow.setVisible(true);

            }
        });


        exitButton = new JButton("EXIT");
        exitButton.setBounds(160, 380, 300, 40);
        exitButton.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        exitButton.setBackground(Color.getHSBColor(300,1000,687));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
        add(text1);
        add(text2);
        add(text3);
        add(addButton);
        add(listButton);

    }
}

