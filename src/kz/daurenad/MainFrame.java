package kz.daurenad;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu menuWindow;
    public static AddDevice addWindow;
    public static ListDevices listWindow;
    public static Welcome welcomeWindow;
    public static Developer developer;

    public MainFrame() throws Exception {
        setSize(600, 700);
        setTitle("Device Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuWindow = new MainMenu();
        menuWindow.setLocation(0,0);
        menuWindow.setVisible(false);
        add(menuWindow);

        addWindow = new AddDevice();
        addWindow.setLocation(0, 0);
        addWindow.setVisible(false);
        add(addWindow);

        listWindow = new ListDevices();
        listWindow.setLocation(0,0);
        listWindow.setVisible(false);
        add(listWindow);

        welcomeWindow = new Welcome();
        welcomeWindow.setLocation(0,0);
        welcomeWindow.setVisible(true);
        add(welcomeWindow);

        developer = new Developer();
        developer.setLocation(0,0);
        developer.setVisible(false);
        add(developer);
    }



}

