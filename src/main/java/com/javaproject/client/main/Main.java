package main.java.com.javaproject.client.main;
import java.awt.*;
import java.net.Socket;

import game.GameClient;
import main.java.com.javaproject.client.gui.LoginForm;

public class Main {
    public static String ID;
    static Socket socket ;
    public static Client client = new Client();
    public static void main(String args[]) {
        EventQueue eventQueue = new EventQueue();
        eventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}
