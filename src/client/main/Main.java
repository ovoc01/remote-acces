package client.main;

import client.management.Authentificate;

import java.net.Socket;
import javax.swing.JOptionPane;

public class Main {

    static String port = "4907";

    public static void main(String args[]) {
        String ip = JOptionPane.showInputDialog("Please enter server ip");
        new Main().initialize(ip, Integer.parseInt(port));
    }

    public void initialize(String ip, int port) {
        try {
            Socket sc = new Socket(ip, port);
            System.out.println("Connecting to the Server");
            //Authenticate class is responsible for security purposes
            Authentificate frame1 = new Authentificate(sc);

            frame1.setSize(300, 80);
            frame1.setLocation(500, 300);
            frame1.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

