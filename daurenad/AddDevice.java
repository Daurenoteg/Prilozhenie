package kz.daurenad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDevice extends Container {
    private JLabel nameLabel;
    private JLabel costLabel;
    private JLabel gameLabel;
    private JLabel developerLabel;
    private JLabel yearLabel;
    private JButton exitButton;
    private JTextField nameText;
    private JTextField costText;
    private JTextField yearText;
    private String[] games = {"Yes", "No", "Maybe"};
    private JComboBox gameBox;
    private JTextField developerText;

    private JButton addButton;
    private JButton backButton;

    public AddDevice(){
        setSize(600, 700);
        setLayout(null);

        nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(90, 60, 500, 40);
        nameText = new JTextField();
        nameText.setBounds(150, 60, 350, 50);
        costLabel = new JLabel("Cost: ");
        costLabel.setBounds(90, 150, 500, 40);
        costText = new JTextField();
        costText.setBounds(150, 150, 350, 50);
        gameLabel = new JLabel("Game: ");
        gameLabel.setBounds(90, 320, 500, 40);
        gameBox = new JComboBox(games);
        gameBox.setBounds(150, 320, 350, 40);
        developerLabel = new JLabel("Developer: ");
        developerLabel.setBounds(90, 240, 350, 40);
        developerText = new JTextField();
        developerText.setBounds(150, 240, 350, 40);
        yearLabel = new JLabel("Year of: ");
        yearLabel.setBounds(90, 400, 350, 40);
        yearText = new JTextField();
        yearText.setBounds(150, 400, 350, 40);
        addButton = new JButton("Add Device");
        addButton.setBounds(90, 500, 210, 30);
        addButton.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        addButton.setBackground(Color.getHSBColor(300,1000,687));

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String cost = costText.getText();
                String game = (String)gameBox.getSelectedItem();
                String developer = developerText.getText();
                String year = yearText.getText();

                Device device = new Device(name, cost, game, developer,year);
                Main.addDevice(device);

                nameText.setText("");
                costText.setText("");
                developerText.setText("");
                yearText.setText("");
            }
        });
        backButton = new JButton("BACK");
        backButton.setBounds(330, 500, 210, 30);
        backButton.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        backButton.setBackground(Color.getHSBColor(300,1000,687));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.addWindow.setVisible(false);
            }
        });
        exitButton = new JButton("EXIT");
        exitButton.setBounds(200, 600, 200, 40);
        exitButton.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        exitButton.setBackground(Color.getHSBColor(300,1000,687));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(addButton);
        add(developerLabel);
        add(exitButton);
        add(backButton);
        add(yearText);
        add(yearLabel);
        add(nameLabel);
        add(developerText);
        add(gameBox);
        add(costLabel);
        add(nameText);
        add(gameLabel);
        add(costText);
    }
}
