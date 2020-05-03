package kz.daurenad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListDevices extends Container {
    public  static JTextArea text;
    private JButton buttonLIST;
    private JButton buttonBACK;
    private JButton exitButton;
    public ListDevices() {
        setSize(600,700);
        setLayout(null);

        text = new JTextArea();
        text.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        text.setBackground(Color.getHSBColor(300,1000,687));
        text.setBounds(50, 50, 500, 360);
        add(text);

        buttonLIST = new JButton("Show me!");
        buttonLIST.setBounds(80, 500, 205, 40);
        buttonLIST.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        buttonLIST.setBackground(Color.getHSBColor(300,1000,687));
        buttonLIST.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s="";
                for(int i=0;i<Main.deCount;i++){
                    s+=Main.devices[i]+"\n";
                }
                text.setText(s);
            }
        });
        add(buttonLIST);

        buttonBACK = new JButton("Back");
        buttonBACK.setBounds(80, 440, 205,40);
        buttonBACK.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 25));
        buttonBACK.setBackground(Color.getHSBColor(300,1000,687));
        buttonBACK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.listWindow.setVisible(false);
            }
        });
        add(buttonBACK);

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
        add(buttonLIST);
        add(exitButton);
        add(buttonBACK);
    }
}

