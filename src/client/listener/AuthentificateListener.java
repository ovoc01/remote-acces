package client.listener;

import client.management.Authentificate;
import client.visual.CreateFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class AuthentificateListener implements ActionListener {
    Authentificate authentificate;

    public AuthentificateListener(Authentificate a){
        authentificate = a;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String value1 = authentificate.getText1().getText();
        try {
            authentificate.setPsswrchk( new DataOutputStream(authentificate.getcSocket().getOutputStream()));
            authentificate.setVerification(new DataInputStream(authentificate.getcSocket().getInputStream()));
            authentificate.getPsswrchk().writeUTF(value1);
           authentificate.setVerify(authentificate.getVerification().readUTF());
        } catch (IOException ee) {
            ee.printStackTrace();
        }

        if (authentificate.getVerify().equals("valid")) {
            try {
                authentificate.setWidth(authentificate.getVerification().readUTF());
                authentificate.setHeight(authentificate.getVerification().readUTF()) ;
            } catch (IOException ee) {
                ee.printStackTrace();
            }

            CreateFrame abc = new CreateFrame(authentificate.getcSocket(), authentificate.width, authentificate.height);
            authentificate.dispose();
        } else {
            System.out.println("enter the valid password");
            JOptionPane.showMessageDialog(
                    authentificate,
                    "Incorrect  password",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            authentificate.dispose();
        }
    }
}
