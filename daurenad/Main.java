package kz.daurenad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

import static java.lang.System.out;

public class Main {
    public static MainFrame frame;
    public static Device[] devices = new Device[50];
    public static int deCount = 0;

    public static void addDevice(Device de) {///"Aizhan", Baltabai, HISTOTRY, ISCS
        devices[deCount++] = de;
    }

    public static void main(String[] args) throws Exception {
        frame = new MainFrame();
        frame.setVisible(true);
    }
}